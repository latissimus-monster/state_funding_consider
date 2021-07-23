package Kosta.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			System.out.println("1.추가 2.전체출력 3.선택출력 4.종료");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				m.putGrade();
				break;
			case 2 :
				m.showAll();
				break;
			case 3 :
				m.showOne();
				break;
			case 4 :
				System.out.println("종료합니다.");
				return;
			}
		}
		
	}

}
