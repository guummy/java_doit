package operator;

public class OperationEx4 {

	public static void main(String[] args) {
		// 조건연산자
		// 조건식 ? 결과1 : 결과2;
		// 참이면 결과1 거짓이면 결과2가 선택된다.
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge)?'T':'F';
		System.out.println(ch);

	}

}
