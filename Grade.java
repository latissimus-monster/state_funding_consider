package Kosta.grade;

public class Grade {
	int kor;
	int eng;
	int mat;
	
	public Grade() {}

	public Grade(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void show() {
		System.out.println("국어 : "+kor+" 영어 : "+eng+" 수학 : "+mat);
	}
	
}
