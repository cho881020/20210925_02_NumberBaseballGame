package codes;

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
				
			}
			
			
		}
		
//		3자리 숫자 확인.
		for (int cpuNum :  cpuNumbers) {
			System.out.println(cpuNum);
		}
		
		
	}

}
