package info.searchman;

import java.util.Scanner;

public class HelloWarld {
	public static void main (String args[]) {
	//Hellow World
	//	System.out.println("HelloWarld");
	//	int add1 = 23;
	//	int add2 = 12;
	//	System.out.println(add1 + add2);

//		変数、出力
		String msg = "HelloWarld";
		System.out.println(msg);

//		オブジェクト
		String[] name = {"apple", "banana", "orange", "peach", "strowberry"};
		System.out.println(name[3]);

//		配列
		String names[] = new String[5];
		names[3] = "peach";
		System.out.println(names[3]);


		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		 //最初のfor文で９の段まで連続して処理されるよう指定
		for (int i = 1; i <= 9; i++) {
			//次のfor文でかける値を９回処理されるよう指定
			for (int j = 1; j <= 9; j++) {
				   //次の段で改行されるようにif文で条件分岐する
					if (i * j <= 9) {
						//9以下の値の時に表が崩れないように(２桁の数字に合わせる為)半角スペース空ける
						System.out.print(" ");
					}
					    //２番目のfor文に計算結果と値同士を離すため半角スペースを空ける
						System.out.print(i * j + " ");
					}
					//１番目のfor文にprintlnを入れて９回改行させる
					System.out.println("");
			}
		
		for (int k = 1; k <= 5; k++) {
			System.out.println(k + "人目の点数を入力してください");
		}
		
		//桁の取得
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scanner.nextInt();
		int keta = (int)(Math.log(num)/Math.log(10)) + 1;
		System.out.println("入力された値の桁数は『" + keta + "』です。");
		
	}

	}

