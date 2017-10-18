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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * springMVC实现多文件上传的方式有两种，一种是我们经常使用的以字节流的方式进行文件上传，另外一种是使用springMVC包装好的解析器进行上传。
 * 这两种方式对于实现多文件上传效率上却有着很大的差距，下面我们通过实例来看一下这两种方式的实现方式，同时比较一下在效率上到底存在着多大的差距。
 * 1.下载相关jar包
 * 。需要引入的jar出了springMVC的jar包外，还需要引入com.springsource.org.apache.commons.
 * fileupload
 * -1.2.0.jar和com.springsource.org.apache.commons.io-1.4.0.jar。所有的jar包可以通过
 * “点击这里”进行下载。
 * 
 * 
 * 
 * .最后看后台打印数据，数据来源于后台打印的上传文件所用的时间，第一幅图片是使用字节流写入方式完成三个文件上传中每个文件用时，
 * 第二幅图片是使用springMVC包装好的解析器进行的三个相同的文件上传中每个文件的用时：
 * 字节流实现文件上传的传递效率，结果显示传递三个文件用时分别为534ms，453ms和387ms。
 * 使用springMVC解析器进行文件上传用时分别为2ms，1ms和2ms。
 * 通过对比这两种方式我们可以发现使用springMVC进行多文件的效率显然要比字符流写入方式效率上要高得多
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/springMVC7")
public class Upload1Controller {
	 @RequestMapping("/upload"   )  
	    public String addUser(@RequestParam("file") CommonsMultipartFile[] files,HttpServletRequest request){  
	          
	        for(int i = 0;i<files.length;i++){  
	            System.out.println("fileName---------->" + files[i].getOriginalFilename());  
	          
	            if(!files[i].isEmpty()){  
	                int pre = (int) System.currentTimeMillis();  
	                try {  
	                    //拿到输出流，同时重命名上传的文件  
	                    FileOutputStream os = new FileOutputStream("E:/upload/mul_method1_" + new Date().getTime() + files[i].getOriginalFilename());  
	                    //拿到上传文件的输入流  
	                    FileInputStream in = (FileInputStream) files[i].getInputStream();  
	                      
	                    //以写字节的方式写文件  
	                    int b = 0;  
	                    while((b=in.read()) != -1){  
	                        os.write(b);  
	                    }  
	                    os.flush();  
	                    os.close();  
	                    in.close();  
	                    int finaltime = (int) System.currentTimeMillis();  
	                    System.out.println(finaltime - pre);  
	                      
	                } catch (Exception e) {  
	                    e.printStackTrace();  
	                    System.out.println("上传出错");  
	                }  
	        }  
	        }  
	        return "/success";  
	    }  
	      
	      
	    @RequestMapping("/upload2"  )  
	    public String upload2(HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException {  
	        //创建一个通用的多部分解析器  
	        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
	        //判断 request 是否有文件上传,即多部分请求  
	        if(multipartResolver.isMultipart(request)){  
	            //转换成多部分request    
	            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
	            //取得request中的所有文件名  
	            Iterator<String> iter = multiRequest.getFileNames();  
	            while(iter.hasNext()){  
	                //记录上传过程起始时的时间，用来计算上传时间  
	                int pre = (int) System.currentTimeMillis();  
	                //取得上传文件  
	                MultipartFile file = multiRequest.getFile(iter.next());  
	                if(file != null){  
	                    //取得当前上传文件的文件名称  
	                    String myFileName = file.getOriginalFilename();  
	                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
	                    if(myFileName.trim() !=""){  
	                        System.out.println(myFileName);  
	                        //重命名上传后的文件名  
	                        String fileName = "demoUpload" + file.getOriginalFilename();  
	                        //定义上传路径  
	                        String path = "E:/upload/mul_method2_" + fileName;  
	                        File localFile = new File(path);  
	                        file.transferTo(localFile);  
	                    }  
	                }  
	                //记录上传该文件后的时间  
	                int finaltime = (int) System.currentTimeMillis();  
	                System.out.println(finaltime - pre);  
	            }  
	              
	        }  
	        return "/success";  
	    }  
	      
	    @RequestMapping("/toUpload" )   
	    public String toUpload() {  
	          
	        return "/upload";  
	    }  
}
