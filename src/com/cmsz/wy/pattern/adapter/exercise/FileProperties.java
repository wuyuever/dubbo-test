package com.cmsz.wy.pattern.adapter.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties properties;
	
	public FileProperties() {
		properties = new Properties();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		properties.store(new FileOutputStream(new File(filename)), "注释");
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key, "");
	}

}
