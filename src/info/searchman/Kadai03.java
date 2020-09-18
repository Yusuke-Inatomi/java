package info.searchman;

public class Kadai03 {
	public static void main (String args[]) {
		 //最初のfor文で９の段まで連続して処理されるよう指定
		for (int i = 1; i <= 9; i++) {
			//次のfor文でかける値を９回処理されるよう指定
			for (int j = 1; j <= 9; j++) {
				//[i * j]を少なくとも3桁で表示（％→書式指定開始、３→最低限３桁以上、d→１０進数で）
				System.out.printf("%3d", i * j);
			}
			//９段になる様に改行
			System.out.printf("%n");
		}
		
	}
}


