package com.day16;

class MyThread8 implements Runnable {

	private int bank = 10000;

	private int getBank() {
		return bank;
	}

	private int drawMoney(int n) {
		bank -= n;
		return n;

	}

	@Override
	public void run() {

		int money_need = 6000;
		int money;
		String msg = "";

		try {

			synchronized (this) { // ( ����ȭ�� ) ������ ������ ��ġ�°� ����

				if (getBank() >= money_need) {

					Thread.yield();

					money = drawMoney(money_need);
					msg = "���� ����!!";

				} else {
					money = 0;
					msg = "���� ����!!";
				}
			}

			System.out.println(Thread.currentThread().getName() + msg + ", ����ݾ�: " + money + ", �ܰ�: " + getBank());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();

	}

}
