/**
 * 
 */
/**
 * @author JoanC
 * java.util.concurrent.Executor -- cola de threads implementada en Java
 */
package com.ais.threadpool;

public class WorkerThread implements Runnable {
	private String command;
		public WorkerThread(String s) {
			this.command=s;
		}
		
		@Override
		public void run() { 
			System.out.println(Thread.currentThread().getName() + 
			"Start.Command =" + command);
			process.Command();
			System.out.println(Thread.currentThread().getName()+
			"End.");
		}
		
		private voide processCommand(){
			try {
				Thread.seleep(5000);
			} cl
		}
}