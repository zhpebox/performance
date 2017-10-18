package com.performance.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 第一次我用一个4M的文件：
 * 
 * fileName：test.rar 方法一的运行时间：14712ms fileName：test.rar 方法二的运行时间：5ms
 * 方法三的运行时间：4ms
 * 
 * 第二次：我用一个50M的文件 方式一进度很慢，估计得要个5分钟 方法二的运行时间：67ms 方法三的运行时间：80ms
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/SpringMVC006")
public class Upload2Controller {

	/*
	 * 方法一 通过流的方式上传文件
	 * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
	 */
	@RequestMapping("/fileUpload")
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file)
			throws IOException {

		// 用来检测程序运行时间
		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());

		try {
			// 获取输出流
			OutputStream os = new FileOutputStream("E:/upload/method1_" + new Date().getTime()
					+ file.getOriginalFilename());
			// 获取输入流 CommonsMultipartFile 中可以直接得到文件的流
			InputStream is = file.getInputStream();
			int temp;
			// 一个一个字节的读取并写入
			while ((temp = is.read()) != (-1)) {
				os.write(temp);
			}
			os.flush();
			os.close();
			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法一的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}
	
	/*
	 * 方法一 （多文件） 通过流的方式上传文件
	 * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)  
    public String addUser(@RequestParam("file") CommonsMultipartFile[] files, HttpServletRequest request) throws Exception{
        for(int i=0;i<files.length;i++){
            System.out.print("filename--------->"+files[i].getOriginalFilename());
            if(!files[i].isEmpty()){
                int pre = (int)System.currentTimeMillis();
                FileOutputStream out = new FileOutputStream("E:/upload/多文件_"+new Date().getTime()+files[i].getOriginalFilename());
                FileInputStream in = (FileInputStream)files[i].getInputStream();
                int b =0;
                while((b=in.read())!=-1){
                    out.write(b);
                }
                out.flush();
                out.close();
                in.close();
                int finaltime = (int)System.currentTimeMillis();
                System.out.print(finaltime-pre);
            }
        }
        return "/success";
    }

	/*
	 * 方法二 采用file.Transto 来保存上传的文件
	 */
	@RequestMapping("/fileUpload2")
	public String fileUpload2(@RequestParam("file") CommonsMultipartFile file)
			throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());
		String path = "E:/upload/method2_" + new Date().getTime() + file.getOriginalFilename();

		File newFile = new File(path);
		// 通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		file.transferTo(newFile);
		long endTime = System.currentTimeMillis();
		System.out.println("方法二的运行时间：" + String.valueOf(endTime - startTime)
				+ "ms");
		return "/success";
	}

	/*
	 * 方法三采用spring提供的上传文件的方法
	 */
	@RequestMapping("/springUpload")
	@ResponseBody
	public String springUpload(HttpServletRequest request,HttpServletResponse response)
			throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator<String> iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next()
						.toString());
				if (file != null) {
					String path = "E:/upload/springUpload3_"
							+ file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}
}
