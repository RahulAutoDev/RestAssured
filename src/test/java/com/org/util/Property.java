package com.org.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	public static Properties prop = new Properties();
	
	static {
		
		File file = new File("/Users/rahulsingh/eclipse-workspace/RestAssuredAPIAutomation/Files/ProjectConfig.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}

}
