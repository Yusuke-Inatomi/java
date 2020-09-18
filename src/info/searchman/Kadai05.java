package info.searchman;
import java.util.Scanner;

public class Kadai05 {
	public static void  main(String args[]) {
		//Scannerクラスのインスタンスを作成、引数に『System.in』を入れ,標準入力をSystemクラスのinフィールドから取得
		Scanner scanner = new Scanner(System.in);
		System.out.print("月を1～12で入力してください。");
		//scanner.nextLine()で文字列の入力を受け取る
		//※next()は標準入力で空白まで,nextLine()は標準入力で改行まで
		int month = scanner.nextInt();
		
		//if文を用いて
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "月は、30日です。");
		} else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "月は、31日です。");
		} else {
			System.out.println("入力が間違っています。");
		}
		
		//switch文を用いて
		switch(month) {
		//日数が30日の月のケースをまとめる。
		case 4:
		case 6:
		case 9:
		case 11:
			//入力した月を出力
			System.out.println(month + "月は、30日です。");
			//4~11の処理を終わらせ、次の処理へ
			break;
		//日数が31日の月のケースをまとめる。
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			//入力した月を出力
			System.out.println(month + "月は、31日です。");
			//1~12の処理を終わらせ、次の処理へ
			break;
		//28日は2月のみなので、2の値を入れる
		case 2:
			//入力した月を出力
			System.out.println(month + "月は、28日です。");
			//2の処理を終わらせ、次の処理へ
			break;
		//1~12以外の数値が入力された場合
		default:
			System.out.println("入力が間違っています。");
			break;
		}
		//処理が終わった際scannerクラスのインスタンスを閉じる
		scanner.close();
	}
}
