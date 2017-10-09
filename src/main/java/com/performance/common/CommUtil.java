package com.performance.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class CommUtil {
	
	public static Properties initProp() throws Exception{
		Properties prop = new Properties();
		
		File tempFile = new File(System.getProperty("user.dir").replaceAll("\\\\", "/")+"/conf.properties");
		InputStream in;
		if(tempFile.exists()){
			in = new BufferedInputStream(new FileInputStream(tempFile));
		}else{
			in = ClassLoader.getSystemResourceAsStream("conf.properties");
		}
		prop.load(in);
		return prop;
	}
}
