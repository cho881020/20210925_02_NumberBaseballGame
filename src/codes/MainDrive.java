package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		숫자 야구 게임입니다.
//		컴퓨터가 3개의 숫자를 랜덤으로 문제로 냅니다.
		
		int[] cpuNumbers = new int[3];
		
//		3자리 숫자를 채우기 위한 for
		for (int i=0 ; i < cpuNumbers.length ; i++) {
			
//			제대로 된 숫자가 뽑힐때까지 무한반복.
			while (true) {
				

//				1~9 랜덤숫자
				int randomNum = (int) (Math.random()*9+1);
				
//				중복 X 검사
				boolean isDuplOk = true;
				
//				문제 숫자 중 중복?
				for (int num  : cpuNumbers) {
					if (randomNum == num) {
						isDuplOk = false;
						break;
					}
				}
				
//				중복 검사에 통과했나?
				if (isDuplOk) {
//					문제 숫자로 선정.
					cpuNumbers[i] = randomNum;
//					제대로 숫자 나옴. 무한반복 종료.
					break;
				}
				
			}
			
			
		}
		
//		3자리 숫자 확인.
		for (int cpuNum :  cpuNumbers) {
			System.out.println(cpuNum);
		}
		
		
//		플레이어 : 3자리 정수 입력.
		Scanner myScanner = new Scanner(System.in);
		
//		3S 맞출때까지 계속 입력. => 무한 반복
		while (true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int inputNum = myScanner.nextInt();
			
			
//			입력한 숫자를 3자리 배열로 쪼개자.
//			123 => [1, 2, 3]
			int[] myNumbers = new int[3];
			
//			각 자리별로 계산해서 대입.
			myNumbers[0] = inputNum / 100;  // 100의 자리만 추출.
			myNumbers[1] = inputNum / 10 % 10; // 123 => 12.3 => 12로변환 => 1의자리 추출
			myNumbers[2] = inputNum % 10; // 1의자리만 추출.
			
			
//			두개의 배열을 비교. ?S ?B인지 판정.
//			S 개수 / B 개수 구하자.
			int strikeCount = 0;
			int ballCount = 0;
			
//			내 숫자 하나 -> 문제 숫자 3개 비교 -> 통째로 3번 반복.
			for (int i=0 ; i < myNumbers.length ; i++) {
				
				for (int j=0 ; j < cpuNumbers.length ; j++ ) {
					
//					내 숫자 / 컴퓨터 문제 숫자가 같은가?
					if (myNumbers[i] == cpuNumbers[j]) {
						
//						같은 숫자 발견! => 추가검사 : 위치(index)도 같은가?
						if (i == j) {
//							숫자도 같은데 -> 위치도 같다. S 발견
							strikeCount++;
						}
						else {
//							숫자는 같지만 -> 위치만 다르다. B 발견
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			System.out.println(strikeCount+"S " + ballCount + "B 입니다.");
			
		}
		
		
		
	}

}










