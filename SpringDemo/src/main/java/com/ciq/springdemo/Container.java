package com.ciq.springdemo;

import java.io.IOException;
import java.util.Properties;

public class Container {
	static Properties prop=null;
	public Object getcontainer(String name) {
		

			try {
				prop=new Properties();

				prop.load(Container.class.getClassLoader().getResourceAsStream("network.properties"));
				return Class.forName(prop.getProperty(name)).newInstance();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		return null;

}
	public static void main(String[] args) {
		System.out.println(prop.getProperty("network"));
	}
}