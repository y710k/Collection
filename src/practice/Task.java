package practice;

import java.time.LocalDate;



public class Task{
	static String t1 ="牛乳を買う";
	static String t2 ="○○社面談";
	static String t3 ="手帳を買う";
	static String t4 ="散髪に行く";
	static String t5 ="スクールの課題を解く";
	
	public static class Day{
		static LocalDate d1 = LocalDate.of(2021, 10, 21);
		static LocalDate d2 = LocalDate.of(2021, 9, 15);
		static LocalDate d3 = LocalDate.of(2021, 12, 4);
		static LocalDate d4 = LocalDate.of(2021, 8, 10);
		static LocalDate d5 = LocalDate.of(2021, 11, 9);
		
		static String j1 = d1 +":"+ t1;
		static String j2 = d2 +":"+ t2;
		static String j3 = d3 +":"+ t3;
		static String j4 = d4 +":"+ t4;
		static String j5 = d5 +":"+ t5;
	}
	
	


}


/*
日付（LocalDate型）とタスク内容（String型）を持つTaskクラスを作成します。
以下のタスクを生成してリストに格納し、日付順に並び替えて表示してください。

使用するコレクションのクラスは自由です。

2021年10月21日 牛乳を買う。
2021年9月15日 ○○社面談。
2021年12月4日 手帳を買う。
2021年8月10日 散髪に行く。
2021年11月9日 スクールの課題を解く。

*/