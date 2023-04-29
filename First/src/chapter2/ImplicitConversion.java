package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 형변환 - 묵시적 형 변환(자동) 
		
		// 1. 바이트 크기가 작은 자료형에서 큰자료형
		byte bNum = 10;
		// byte형 값이 int형 변수로 대입됨
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// 2. 덜 정밀한 자료형에서 더 정밀한 자료형
		int iNum2 = 20;
		// int형 값이 float형 변수로 대입됨
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		// fNum + iNum : float형으로 형변환되어 계산
		// dNum : double형으로 값 나온다!
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);

	}

}
