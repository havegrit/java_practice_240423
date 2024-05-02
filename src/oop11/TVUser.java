package oop11;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/product.properties"));
		
		String tvName = prop.getProperty("tv");
		Class<?> tvClass = Class.forName(tvName);
		TV tv = (TV) tvClass.getConstructor().newInstance();	// new SamsungTv();

		String speakerName = prop.getProperty("speaker");
		
		try {
			Class<?> speakerClass = Class.forName(speakerName);
			Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
			
			tv.setSpeaker(speaker);
		} catch (Exception e) {
		}
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.powerOff();
	}
}
