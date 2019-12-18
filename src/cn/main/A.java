package cn.main;

import java.util.ArrayList;
import java.util.Scanner;

import cn.Student.Students;

public class A {
	private static Scanner sc;
	
	//增加学生
	public static boolean addStudent(ArrayList<Students> arrayList){
		 boolean flag=false;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入你想插入学生的学号");
		String number=sc.nextLine();
		
		
		System.out.println("请输入你想插入学生的姓名");
		String name=sc.nextLine();
		
		System.out.println("请输入你想插入学生的城市");

		
		String city=sc.nextLine();
	
		System.out.println("请输入你想插入学生的年龄");
		int age=sc.nextInt();
		
		
		arrayList.add(new Students(name,number,city,age));
		flag=true;
		return flag;
	
	}
	
	//删除学生
	public static void deletestudent(ArrayList<Students> arry) {
		sc = new Scanner(System.in);
		System.out.print("请输入要删除的学号：");
		String deleId = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Students s = arry.get(i);
			if(s.getNum().equals(deleId)) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("输入错误！！！！你要删除的学生不存在，请重新选择！");
			} else {
				arry.remove(index);
				System.out.println("删除学生成功！！");
			}
		} 
	}
	//修改学生
	public static void changestudent(ArrayList<Students> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入要改变的学号：");
		String changeId = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Students s = arry.get(i);
			if(s.getNum().equals(changeId)) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("您要改变的学生不存在，请重新操作！");
		} else {
			System.out.println("请输入新姓名：");
			String name = sc.nextLine();
			System.out.println("请输入新城市：");
			String city = sc.nextLine();
			System.out.println("请输入新年龄：");
			int age = sc.nextInt();
			//创建对象
			Students s = new Students();
			s.setNum(changeId);
			s.setName(name);
			s.setCity(city);
			s.setAge(age);
			//修改对象
			arry.set(index,s);
			System.out.println("修改学生成功！！");
		}
	}

}
