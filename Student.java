package Kosta.grade;

public class Student {
	String name;
	Grade myGrade;
	
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public void takeReport(Grade mygrade) {
		this.myGrade= mygrade;
	}
	public void showInfo() {
		System.out.print("이름 : "+name+"\n");
		myGrade.show();
	}
}
