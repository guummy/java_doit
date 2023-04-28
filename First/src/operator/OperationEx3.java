package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		// 단락회로평가 : 논리곱, 논리합 연산을 할 때 두 항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우에 나머지 항은 실행되지 않는 것
		// && : 둘 다 참이어야지 참
		boolean value =((num1 = num1+10) < 10) && ((i= i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);	// 앞 항이 거짓이므로 실행이 되지않아 i값이 그대로
		
		// || : 앞 항이 참이면 뒷항이 거짓이든 참이든 상관없이 참
		value =((num1 = num1+10) > 10) || ((i= i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);	// 앞 항이 참이므로 실행이 되지않아 i값이 그대로

	}

}
