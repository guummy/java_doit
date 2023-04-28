package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		System.out.println("0번: "+gameScore);
		
		// 증가,감소 연산자의 위치에 따라 값이 다르게 나옴
		
		// 증가, 감소 연산자가 피연산자 앞에 있을때
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		System.out.println("1번: "+gameScore);

		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		System.out.println("2번: "+gameScore);
		
		// 증가, 감소 연산자가 피연산자 뒤에 있을때
		// gameScore 값이 lastScore3 대입되고 1증가
		int lastScore3 = gameScore++;
		System.out.println(lastScore3);
		System.out.println("3번: "+gameScore);
		// gameScore 값이 lastScore4 대입되고 1감소
		int lastScore4 = gameScore--;
		System.out.println(lastScore4);
		System.out.println("4번: "+gameScore);
		
		
		

	}

}
