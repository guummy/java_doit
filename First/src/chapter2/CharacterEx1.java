package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		//문자자료형
		char ch1 = 'A';
		// 문자출력
		System.out.println(ch1);
		// 문자에 해당되는 정수값(아스키코드값) 출력
		System.out.println((int)ch1);
		System.out.println("-----------");
		
		// 정수 값 대입
		char ch2 = 66;
		// 정수값에 해당하는 문자출력 
		System.out.println(ch2);
		System.out.println("-----------");
		
		int ch3 = 67;
		// 문자 정수 값 출력
		System.out.println(ch3);
		// 정수값에 해당하는 문자 출력
		System.out.println((char)ch3);
	}

}
