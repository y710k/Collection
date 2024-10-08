package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2021, 10, 21);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 4);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);
		
        List<Task> list = new ArrayList<Task>();
        list.add(new Task(d1, "牛乳を買う"));
		list.add(new Task(d2, "○○社面談"));
		list.add(new Task(d3, "手帳を買う"));
		list.add(new Task(d4, "散髪に行く"));
		list.add(new Task(d5, "スクールの課題を解く"));
		
		Collections.sort(list);
		
		for(Task ta :list) {
			System.out.println(ta);
		}
	}
}




/*
表示
2021-08-10:散髪に行く
2021-09-15:○○社面接
2021-10-21:牛乳を買う
2021-11-09:スクールの課題を解く
2021-12-04:手帳を買う
*/