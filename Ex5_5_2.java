package Chap5;

public class Ex5_5_2 {

	public static void main(String[] args) {
		int[] ball = new int[45]; //45 칸 배열 생성
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		} // 1~45 배열에 대입

		for(int i=0; i<6; i++) {
			int r = (int)(Math.random()*(45-i)+i); // -i와 +i를 추가함으로써 한번 바꾼 부분은 제외할 수 있다.
			int tmp = ball[i];
			ball[i] = ball[r];
			ball[r] = tmp; // 바꿨던 위치를 또 바꿀수도 있으므로 완전한 로또 확률이라고 보기 어렵지 않을까? 13행 수정!
			System.out.println("ball["+i+"]="+ball[i]);
		}
	}

}
