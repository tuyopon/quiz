package quiz;

import java.util.Scanner;


public class Answer {
	void answer(int a){
		Scanner scanner = new Scanner(System.in);
		int kai;
		kai = scanner.nextInt();


		while(kai < 1 || 4 < kai){
			System.out.println("解答が範囲外です");
			kai = scanner.nextInt();
		}

		if(a == 0) {
			if(kai == 4) {
				System.out.println("正解");
			}else {
				System.out.println("不正解");
			}
		}
		if(a == 1) {
			if(kai == 2) {
				System.out.println("正解");
			}else {
				System.out.println("不正解");
			}
		if(a == 2) {
			if(kai == 1) {
				System.out.println("正解");
			}else {
				System.out.println("不正解");
			}
		}


		scanner.close();
	}
}
}
