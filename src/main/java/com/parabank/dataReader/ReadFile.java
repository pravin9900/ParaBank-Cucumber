package com.parabank.dataReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFile {

	public static String readPropertiesFile(String key)
	{
		String output = null;
		File file = new File(System.getProperty("user.dir")+"/Data Folder/testData.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			output = prop.getProperty(key);
			return output;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return output;
	}
}
