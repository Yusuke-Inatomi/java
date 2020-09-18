package info.searchman;
//java.utilパッケージの、Scannerクラスをインポート
import java.util.Scanner;

public class Kadai04 {
	public static void  main(String args[]) {
		//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
		Scanner scanner = new Scanner(System.in);
		System.out.print("文字列を入力してください:");
		//scanner.nextLine()で文字列の入力を受け取る
		//※next()は標準入力で空白まで,nextLine()は標準入力で改行まで
		String string = scanner.nextLine();
		//分かりやすくするため、printlnで改行し、コンソールに受取った文字列出力する
		System.out.println("入力内容：" + string);
		// Scannerクラスのインスタンスを閉じる
		scanner.close();
	}
}
