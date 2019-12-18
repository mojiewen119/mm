package cn.Student;

public class Students {
	private String name;
	private String city;
	private int age;
	private String num;
	public Students(){
		
	}
	public  Students(String name,String num,String city,int age){
		this.name=name;
		this.num=num;
		this.city=city;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city= city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", number=" + num
				+ ",city="+city+"]";
	}
}
