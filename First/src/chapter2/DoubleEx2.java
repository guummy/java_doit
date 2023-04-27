package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 부동소수점 방식의 오류
		// 지수와 가수로 나타내는 부동소수점 방식은 지수로 표현되는 값이 0을 나타낼수 없음 
		// => 부동소수점 값을 연산하면 약간의 오차가 발생할 수 있다.
		double dnum = 1;
		
		for(int i=0;i<10000;i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}
