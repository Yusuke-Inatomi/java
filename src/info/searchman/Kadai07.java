package info.searchman;

import java.util.Scanner;

public class Kadai07 {
	public static void main (String args[]) {
		//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1つ目の文字列を入力してください。");
		//1回目の入力
		String first = scanner.next();
		
		System.out.println("2つ目の文字列を入力してください。");
		//2回目の入力
		String second = scanner.next();
		//「==演算子」では参照が同じであるかを判定。
		//「equalsメソッド」では中身が同じであるかを判定。
		//今回は文字列なので「equalsメソッド」を使う。
		if (first.equals(second)) {
			//文字列は等しい場合は「入力された文字列は等しいです。」をコンソールに表示
			System.out.println("入力された文字列は等しいです。");
		} else {
			//文字列が異なる場合は「入力された文字列は異なっています。」をコンソールに表示
			System.out.println("入力された文字列は異なっています。");
		}
		//処理が終わった際scannerクラスのインスタンスを閉じる
		scanner.close();
	}
}
