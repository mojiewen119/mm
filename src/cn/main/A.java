package cn.main;

import java.util.ArrayList;
import java.util.Scanner;

import cn.Student.Students;

public class A {
	private static Scanner sc;
	
	//����ѧ��
	public static boolean addStudent(ArrayList<Students> arrayList){
		 boolean flag=false;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�������������ѧ����ѧ��");
		String number=sc.nextLine();
		
		
		System.out.println("�������������ѧ��������");
		String name=sc.nextLine();
		
		System.out.println("�������������ѧ���ĳ���");

		
		String city=sc.nextLine();
	
		System.out.println("�������������ѧ��������");
		int age=sc.nextInt();
		
		
		arrayList.add(new Students(name,number,city,age));
		flag=true;
		return flag;
	
	}
	
	//ɾ��ѧ��
	public static void deletestudent(ArrayList<Students> arry) {
		sc = new Scanner(System.in);
		System.out.print("������Ҫɾ����ѧ�ţ�");
		String deleId = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Students s = arry.get(i);
			if(s.getNum().equals(deleId)) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("������󣡣�������Ҫɾ����ѧ�������ڣ�������ѡ��");
			} else {
				arry.remove(index);
				System.out.println("ɾ��ѧ���ɹ�����");
			}
		} 
	}
	//�޸�ѧ��
	public static void changestudent(ArrayList<Students> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫ�ı��ѧ�ţ�");
		String changeId = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Students s = arry.get(i);
			if(s.getNum().equals(changeId)) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("��Ҫ�ı��ѧ�������ڣ������²�����");
		} else {
			System.out.println("��������������");
			String name = sc.nextLine();
			System.out.println("�������³��У�");
			String city = sc.nextLine();
			System.out.println("�����������䣺");
			int age = sc.nextInt();
			//��������
			Students s = new Students();
			s.setNum(changeId);
			s.setName(name);
			s.setCity(city);
			s.setAge(age);
			//�޸Ķ���
			arry.set(index,s);
			System.out.println("�޸�ѧ���ɹ�����");
		}
	}

}
