package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		int[] cpuNumbers = new int[3];
		
		for (int i=0 ; i < cpuNumbers.length ; i++) {
			
			while (true) {
				
				int randomNum = (int) (Math.random()*9+1);
				
				boolean isDuplOk = true;
				
				for (int num  : cpuNumbers) {
					if (randomNum == num) {
						isDuplOk = false;
						break;
					}
				}
				
				if (isDuplOk) {
					cpuNumbers[i] = randomNum;
					break;
				}
				
			}
			
			
		}
		
		
		Scanner myScanner = new Scanner(System.in);
		
		int tryCount = 0;
		
		while (true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int inputNum = myScanner.nextInt();
			
			tryCount++;
			
			
			int[] myNumbers = new int[3];
			myNumbers[0] = inputNum / 100;
			myNumbers[1] = inputNum / 10 % 10;
			myNumbers[2] = inputNum % 10; 
			
			
			int strikeCount = 0;
			int ballCount = 0;
			
			for (int i=0 ; i < myNumbers.length ; i++) {
				
				for (int j=0 ; j < cpuNumbers.length ; j++ ) {
					
					if (myNumbers[i] == cpuNumbers[j]) {
						
						if (i == j) {
							strikeCount++;
						}
						else {
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			System.out.println(strikeCount+"S " + ballCount + "B 입니다.");
			
			
			if (strikeCount == 3) {
				System.out.println("축하합니다! 정답을 맞췄습니다.");
				System.out.println(tryCount + "회 만에 맞췄습니다.");
				
				break;
			}
			
		}
		
		
		
	}

}










