package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		// 총점
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		// 평균
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
	}

}
