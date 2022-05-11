package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		// Number Guess Game 
		// 1 ~ 99 랜덤숫자중 한개의 숫자를 받든다.
		// 숫자를 입력하고 해당 숫자보다 낮으면 down, 높으면 up
		// 10회 이상 입력하면 Game over. 다시 도전 하세요.
		// 최종 숫자를 맞추면 시스템 종료.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int randnum = 0;
		System.out.println("Game start..");
		String stdIn = "";	
		while (true) {	
			//예외 상황 입력시 반복.
			try {
						
				randnum = ran.nextInt(99)+1;
				// 리 게임 시 카운트 초기화.
				int count = 0;
				for(int i = 0; i <= 10; i++ ) {				
					System.out.print("Guess number(1~99) :");
					System.out.println("");
					stdIn = sc.next();
					int num = Integer.parseInt(stdIn);				
					count++;
					// 10회 입력시 게임 실패
					if ( count == 10) {
						System.out.println("Game over, 10회 이내로 맞추셔야합니다. 다시도전하세요.");
						break;
					}
					// 입력 숫자가 높을 시 down
					if ( num > randnum ) {
						System.out.println("Down");
						continue;
					//입력 숫자가 낮을 시 up	
					} else if ( num < randnum) {
						System.out.println("Up");
						continue;
					// 정답시 게임 더 진행 여부 확인.
					} else if ( num == randnum) {
						System.out.printf("정답! 축하드립니다. 도전횟수 : %d회 \n", count );
						System.out.println("게임을 이어 하시겠습니까? (input : yes or no):");
						stdIn = sc.next();
						//yes or no 만 입력 받기.
						while(true) {
							if ( !(stdIn.equals("yes") ||stdIn.equals("no") ) ) {
							System.out.println("yes or no 만입력 가능합니다. 다시입력하세요 :");	
							stdIn = sc.next();
							}
							if ( stdIn.equals("yes")) {
								break;
							} else if(stdIn.equals("no")) {	
								System.out.println("게임이 종료 되었습니다.");
								sc.close();
								return;
							}							
						}
					}
					break;
				}
				//예외상황시 숫자 재입력.
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
		}		

	}	

}
