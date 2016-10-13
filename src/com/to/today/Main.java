package com.to.today;

public class Main {

	public static void main(String[] args) {
		// Main.mainA();

		Main.mainB();
	}

	public static void mainB() {
		System.out.println("mainB  " + Thread.currentThread().getName() + "主线程运行开始!");
		Thread1 mTh1 = new Thread1("mainB_A");
		Thread1 mTh2 = new Thread1("mainB_B");
		mTh1.start();
		mTh2.start();
		try {
			mTh1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			mTh2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("mainB  " + Thread.currentThread().getName() + "主线程运行结束!");

	}

	public static void mainA() {
		System.out.println("mainA  " + Thread.currentThread().getName() + "主线程运行开始!");
		Thread1 mTh1 = new Thread1("mainA_A");
		Thread1 mTh2 = new Thread1("mainA_B");
		mTh1.start();
		mTh2.start();
		System.out.println("mainA  " + Thread.currentThread().getName() + "主线程运行结束!");

	}

}