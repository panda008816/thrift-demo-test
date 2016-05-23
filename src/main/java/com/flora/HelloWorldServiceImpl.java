package com.flora;

import org.apache.thrift.TException;

import com.flora.thrift.HelloWorldService.Iface;
/**
 * @desc 
 *
 * @author flora
 *
 * @date 2016年5月23日 上午10:51:48
 *
 */
public class HelloWorldServiceImpl implements Iface {
	 
	public HelloWorldServiceImpl() {
	}
 
	@Override
	public String sayHello(String username) throws TException {
		System.out.println("server has recieved " + username);
		return "Hi," + username + " welcome to my blog www.micmiu.com";
	}
 
}
