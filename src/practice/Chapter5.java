package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.Task.Day;


public class Chapter5 {
	public static void main(String[] args) {
		
		
		List<String> tasks = new ArrayList<String>();
		tasks.add(Day.j1);
		tasks.add(Day.j2);
		tasks.add(Day.j3);
		tasks.add(Day.j4);
		tasks.add(Day.j5);
		
		Collections.sort(tasks);
		
		for(String ta :tasks) {
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