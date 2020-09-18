package info.searchman;

import java.util.Scanner;

public class Kadai06_if {
	public static void  main(String args[]) {
		//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
		Scanner scanner = new Scanner(System.in);
		System.out.println("月を1～12で入力してください。");
		//scanner.nextLine()で文字列の入力を受け取る
		//※next()は標準入力で空白まで,nextLine()は標準入力で改行まで
		int month = scanner.nextInt();
		//無限ループしないよう、monthが1~12だった時に処理を止める
		while (month >= 1 || month <= 12) {
			//4.6.9.11が入力された時次の処理を行う
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				//入力した月を出力
				System.out.println(month + "月は、30日です。");
				//trueの場合処理を終わらせる、falseの場合次の処理へ
				break;
			//1.3.5.7.8.10.12が入力された時次の処理を行う
			} else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10  || month == 12) {
				//入力した月を出力
				System.out.println(month + "月は、31日です。");
				//trueの場合処理を終わらせる、falseの場合次の処理へ
				break;
			//2が入力された時次の処理を行う
			} else if(month == 2) {
				//入力した月を出力
				System.out.println(month + "月は、28日です。");
				//trueの場合処理を終わらせる、falseの場合次の処理へ
				break;
			//1~12以外の数値が入力された時次の処理を行う
			} else {
				//再入力を促す文言を表示
				System.out.println("入力が間違っています、再度入力してください");
				//もう一度コンソールに文字を入力できるようにscannerを更新
				month = scanner.nextInt();
				//また処理ができるようbreak;はつけない
			}
		}
		//処理が終わった際scannerクラスのインスタンスを閉じる
		scanner.close();
	}
}

