package com.shinhan.day06;

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();
		
		
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		
		try {
			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
		
	}

	int countSameEye(int n) {
		if(n<0) throw new IllegalArgumentException("던지는 횟수는 음수 불가");
		
		int count=0;
		Dice dc1 = new Dice(8);
		Dice dc2 = new Dice(8);
		for(int i=1;i<=n;i++) {
			if(dc1.play()==dc2.play()) {
				count++;
			}
		}
				
		return count;
		
	}

}
