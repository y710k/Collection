package practice;

import java.time.LocalDate;



public class Task implements Comparable<Task>{
	private LocalDate date;
	private String task;
	
	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}
	@Override
	public String toString() {
		return date +":"+ task;
	}
	public int compareTo(Task o) {
		return this.toString().compareTo(o.toString());
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