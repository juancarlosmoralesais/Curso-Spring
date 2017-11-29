package com.ais.threads;

// Runable esta en javalang
public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("Thread name : " +
	    Thread.currentThread().getName());
	}
}
