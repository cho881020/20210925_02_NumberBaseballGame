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
			
		}
		
		
		
	}

}










