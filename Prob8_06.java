package Prob8_06;

public class Prob8_06 {

	public static void main(String[] args) {
		int x=(int)(Math.random()*10)+1;
		int y=(int)(Math.random()*9)+2;
		
		int z=(int)(Math.random()*10)+1;
		int q=(int)(Math.random()*9)+2;
		int bunsi=x*q + z*y;
		int bunbo=y*q;
		
		bunsi=8;
		bunbo=12;
		
		
		
				//整数になるケース
				
				if(bunsi%bunbo == 0) {
					//System.out.println("test");
					System.out.println(x+"/"+y+ " + " +z+"/"+q+" = "+(bunsi/bunbo));
					
				//約分になるケース
				}else if(bunsi%bunsi==0 && bunbo%bunsi==0){
					//約分になるケース
					for(int i=2;i<=bunsi;i++) {
						if(bunsi%i==0 && bunbo%i==0) {
							bunsi=bunsi/i;
							bunbo=bunbo/i;
							i--;
						}
					}
						System.out.print(bunsi/bunsi+"/"+bunbo/bunsi);
					//分子が分母より大きい場合
				}else if(bunsi>bunbo) {
					int seisu=bunsi/bunbo;
					bunsi=bunsi%bunbo;
					System.out.print(x+"/"+y+ " + " +z+"/"+q+" = " + seisu + "." + bunsi + "/" + bunbo);
				
				//通常の場合
				}else {
					System.out.println(x+"/"+y+ " + " +z+"/"+q+" = "+ bunsi +"/"+bunbo);
					System.out.println();
				}

	}

}
