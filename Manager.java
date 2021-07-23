package Kosta.grade;

import java.util.Scanner;

public class Manager {
	Grade[] grade = new Grade[10];
	int count =0;
	Scanner sc = new Scanner(System.in);
	Student[] student = new Student[10];
	Student std = new Student();
	
	
	public void putGrade() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int mat = sc.nextInt();
		grade[count] = new Grade(kor, eng, mat);
		sc.nextLine();
		student[count] = new Student(name);
		student[count].takeReport(grade[count++]);
		}

	public void showAll() {
		for(int i=0; i< count; i++){
			student[i].showInfo();
			
		}
	}

	public void showOne() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		for(int i=0; i< count; i++) {
			if(name.equals(student[i].name)) {
				student[i].showInfo();
			}
		}
		
	}
}
