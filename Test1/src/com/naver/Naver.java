package com.naver;

//List Collection���� ȸ������ �����
//�޴� : ȸ������,ȸ����ü���, ���̵�˻�...
//���� : ȸ�����Խ� ���̵�� 8~15�� �̳�, ������ ���� ȥ��
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 ���Ͽ� �ϳ��� ����
//�Է� ��� ���� ���̵�˻�

public interface Naver {

	public void input(); // ȸ������
	public void print(); // ȸ��������
	public void delete(); // ȸ��Ż��
	public void updata(); // ��������
	public void findId(); // ���̵�˻�
	public void findName(); // �̸��˻�
	public void saveInfo(); // ȸ����� ���Ϸ� ����
	public void thread();
	
	
}
