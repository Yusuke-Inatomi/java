package info.searchman;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai06_while {
	public static void  main(String args[]) {
		//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
		Scanner scan = new Scanner(System.in);
		System.out.println("月を1～12で入力してください。");
		//scanner.nextInt()で整数の入力を受け取る
		//※next()は標準入力で空白まで,nextLine()は標準入力で改行まで
		//int month = scanner.nextInt();を先に置くと、tryの前にエラーが起きてしまう為、monthを初期化する。
		int month = 0;
		//trueでない時ループさせる,while文にラベル名をつけてbreak;でwhile文を抜けれるようにする
		while (true) {
			
			try {
				month = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextInt();
			} 
			stop: switch(month) {
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(month + "月は、30日です。");
					//ラベル名をbreakにつけwhile文を抜けれるように設定
					break stop;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(month + "月は、31日です。");
					//ラベル名をbreakにつけwhile文を抜けれるように設定
					break stop;
				case 2:
					System.out.println(month + "月は、28日です。");
					//ラベル名をbreakにつけwhile文を抜けれるように設定
					break stop;
				default:
					System.err.println("入力が間違っています、再度入力してください");
					break;
			}
			//処理が終わった際scannerクラスのインスタンスを閉じる
			//closeを使うとエラーがでない？？？
//			scan.close();
		}
	}
}
