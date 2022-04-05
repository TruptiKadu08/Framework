package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws IOException {
	String Path= "C:\\Users\\trupt\\eclipse-workspace\\Framework\\Config\\Config.properties";
	FileInputStream fis=new FileInputStream(Path);
    pro=new Properties();
	pro.load(fis);
	
	}
	public String getBaseUrl_stage() {
	return pro.getProperty("BaseUrl_stage");
	}
}
