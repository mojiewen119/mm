package cn.Demo;
import java.util.ArrayList;
import java.util.Scanner;

import cn.Student.Students;
import cn.main.A;
public class Test {
//	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Students> arrayList=new ArrayList<Students>();
		while(true){
			
			System.out.println("��������������������ѧ����Ϣ����ϵͳ��������������������");
			System.out.println();
			
            System.out.println("--------------��1��������ѧ������------------------");
            System.out.println("--------------��2������ѯѧ������------------------");
            System.out.println("--------------��3����ɾ��ѧ������------------------");
            System.out.println("--------------��4�����޸�ѧ������------------------");
            System.out.println("--------------��0�����˳�Ӧ��----------------------");
            @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            switch(num){
            case 1:
            	A.addStudent(arrayList);
            	System.out.println(arrayList.toString());
            	break;
            case 2:
            	System.out.println(arrayList.toString());
            	break;
            case 3:
            	A.deletestudent(arrayList);  
            	break;
            case 4:
            	A.changestudent(arrayList);
            	break;
            case 0:
            	System.out.println("�˳�ϵͳ");
				System.exit(0);
				break;

            	
            }
            
		}
	}
	
	
	

}
