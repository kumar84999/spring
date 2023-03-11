package com.ciq.clint;

import com.ciq.springdemo.Airtel;
import com.ciq.springdemo.Container;
import com.ciq.springdemo.NetWork;

public class NetWorkTest {

	public static void main(String[] args) {
	//	Network e=new Airtel();
//		Airtel e=new Airtel();
//		e.call();
//		e.sms();
//		e.data();
		Container c=new Container();
		NetWork n=(NetWork) c.getcontainer("network");
		n.call();
		n.sms();
		n.data();
	}

}
