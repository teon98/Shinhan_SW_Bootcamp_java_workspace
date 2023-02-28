package com.shinhan.day06;

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
    int play(){
 	int number = (int)(Math.random() * size) + 1;
        return number;
    }
}


public class DiceGame {
	public static void main(String args[]){
		 	DiceGame game = new DiceGame ();
				 
		 	int result1 = game.countSameEye(10);
	System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		 
			int result2 = game.countSameEye(-10);
	System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		 
		 
	 	}
	int countSameEye(int n)  {
		//-	면이 8개인 주사위 2개를 생성한다.
		//주사위 2개를 동시에 n번 던졌을 때, 같은 눈이 나오는 횟수를 계산한다.
		//주사위를 던지는 횟수(n)의 값에 음수가 들어오면 IllegalArgumentException 을 발생시킴

		int count = 0;
		
		try{
			if(n<0) {
				throw new IllegalArgumentException("던지는 횟수는 음수 불가");
			}
			
			Dice a = new Dice(8);
			Dice b = new Dice(8);
			
			while(n>0) {//n번 돌리기
				if(a.play() == b.play()) {
					count += 1;
				}
				n--;
			}
		}catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
		return count;

	}
}


