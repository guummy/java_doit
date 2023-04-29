package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		// 실수 dNum1, fNum2를 각각 int형으로 변환하고 더하기 
		int iNum3 = (int)dNum1 + (int)fNum2;
		// 실수 dNum1, fNum2를 더한 값을 int형으로 변환
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
