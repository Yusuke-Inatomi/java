package info.searchman;

public class Kadai02 {
	public static void main(String args[]) {
		int[] numbers = {10, 4, 340, 180, 79};
        //配列を宣言
		int max = numbers[0];
        //maxを定義し、namubersの最初の値を設定
		for(int i = 1; i < numbers.length; i++) {
		//numbersの最初の値は代入済みなのでnumbersの2番目から
			if(max < numbers[i]) {
		    //maxに代入されている値と配列を比較
				max = numbers[i];
				//maxに配列の要素の一番大きい値が更新される
				System.out.println("最大値は" + max + "です");
				//更新された値をコンソールに出力する
			}
		}
	}
}
