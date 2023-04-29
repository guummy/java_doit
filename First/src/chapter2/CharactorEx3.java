package chapter2;

public class CharactorEx3 {

	public static void main(String[] args) {
		// 문자자료형
		// 문자형 변수에 숫자를 저장할때
		
		int a = 65;
		int b = -66;
		
		// char형은 문자자료형이지만 정수자료형으로 분류할 수 있음
		char a2 = 65;
		// 하지만 음수값은 표현하지 못한다!!
//		char b2 = - 66;  => 오류
		
		System.out.println((char)a);
		System.out.println((char)b);   // 음수값을 대입했기때문에 알수없는 문자로 뜸
		System.out.println(a2);
			

	}

}
