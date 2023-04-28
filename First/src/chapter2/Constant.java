package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수
		final int MAX_NUM = 100;  // 선언과 동시에 초기화
		
		final int MIN_NUM;  
		MIN_NUM = 0;   // 사용하기전에 초기화를 해여한다 아니면 오류발생!
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000;  !오류 : 상수값은 변경할수 없다

	}

}
