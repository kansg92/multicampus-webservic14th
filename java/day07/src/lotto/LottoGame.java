package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	private int lottoNum [];
	private int bonusNum;
	
	
	public LottoGame() {
	}


	public LottoGame(int[] lottoNum, int bonusNum) {
		this.lottoNum = lottoNum;
		this.bonusNum = bonusNum;
	}


	public int[] getLottonum() {
		return lottoNum;
	}


	public int getBonusnum() {
		return bonusNum;
	}
	
	
	public void createlottonum(int[] ar) {	
		for (int i = 0; i < ar.length; i++) {
			Random r = new Random();
			ar [i] = r.nextInt(45)+1;
			// 중복 수 제거.
			for (int j = 0; j < i ; j++) {
				if (ar[i] == ar[j] ) {
					i--;
				}
			}
		}
		this.lottoNum = ar;
		this.bonusNum = ar[6];
				
	}
	



	@Override
	public String toString() {
		return "LottoGame [lottoNum=" + Arrays.toString(lottoNum) + ", bonusNum=" + bonusNum + "]";
	}
	

	
	
}




