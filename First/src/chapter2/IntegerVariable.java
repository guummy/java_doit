package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
//		자료형이 다른 정수끼리 더할때 
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		// 4바이트를 기본단위로 사용하기 때문에 두 정수를 더하기 전에 두 정수는 모두 int 형으로 변환된다!
		// 더한 값도 int 형으로 저장
	}

}
