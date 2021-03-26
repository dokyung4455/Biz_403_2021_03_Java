package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int x = 0;
		while (true) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1(x);
		

			ssV1.makeScore();
			ssV1.TotalScore();
			
			int yesNo = 0;
			
			System.out.println("처음부터 다시하시겠습니까? (Yes:1 / No:01)");
			yesNo = scr.nextInt();
			if(yesNo ==0) {
				System.out.println(" Good Bye!");
				break;
			}
		}

	}

}
