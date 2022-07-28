package Prob8_06;

public class Prob8_06 {
	public static void main(String[] args) {
		int hidari_bunsi=(int)(Math.random()*10)+1;
		int hidari_bunbo=(int)(Math.random()*9)+2;

		int migi_bunsi=(int)(Math.random()*10)+1;
		int migi_bunbo=(int)(Math.random()*9)+2;
		int bunsi=hidari_bunsi*migi_bunbo + migi_bunsi*hidari_bunbo;
		int bunbo=hidari_bunbo*migi_bunbo;
		int seisu=bunsi/bunbo;


		//約分の求め方
		for(int i=2;i<=bunsi;i++) {
			if(bunsi%i==0 && bunbo%i==0) {
				bunsi=bunsi/i;
				bunbo=bunbo/i;
				i--;
			}
		}
		//帯分数にする
		if(bunsi>bunbo) {
			seisu=bunsi/bunbo;
			bunsi=bunsi%bunbo;
		}
		//整数の場合
		if(bunsi == bunbo) {
			seisu=1;
			bunsi=0;
			bunbo=0;
		}

		if(seisu >0) {
			System.out.print(seisu);
		}
		if(seisu>0 && bunsi>0) {
			System.out.print(".");
		}
		if(bunsi>0) {
			System.out.println(bunsi+"/"+bunbo);
		}
	}
}
