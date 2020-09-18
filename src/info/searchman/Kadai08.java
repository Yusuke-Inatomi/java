package info.searchman;

import java.util.Arrays;
import java.util.Scanner;

	public class Kadai08 {
		public static void main (String args[]) {
			//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
			Scanner scanner = new Scanner(System.in);
			
			int member = 5;
			int scores[] = new int[member];
			
			
			for (int k = 1; k <= scores.length; k++) {
					System.out.println(k + "人目の点数を入力してください。");
					scores[k - 1] = scanner.nextInt();
				}
			

			//合計
			int add = 0;
			//配列の数分、繰り返し処理を行う
			for (int score: scores) {
				//変数addに入力された値を足していく
				add += score;
			}
			
			//平均
			double average = add / scores.length;
			
			//最大値		
			//最大値をmaxScoreと宣言、初期値を0に
			int max = 0;
			//配列の数分、繰り返し処理を行う
			for (int score: scores) {
				//maxに代入されている値と配列を比較
				if (max <= score) {
					//maxよりscoreが値が大きい時maxに代入する
					max = score;
				}
			}

			System.out.println("合計点数は" + add + "点です。平均点数は" + average + "点です。最高点数は" + max + "点です。");
			System.out.print("点数は小さい順に");
			//小さい順
			//Arrarsクラスのsortメソッドを使い、昇順でソートする
			Arrays.sort(scores);
			//拡張for文を使い全ての値を順に取り出し、処理を行う
			for (int j : scores) {
				System.out.print(j + " ");	
			}
			
			//処理が終わった際scannerクラスのインスタンスを閉じる
			scanner.close();
		}
		
	}
