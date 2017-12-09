package quiz;

public class Question {
	int a = new java.util.Random().nextInt(3);

	void piyo() {
		Answer ans = new Answer();
		int b = a + 1;

		do {
		switch(a) {
			case 0:System.out.println("クモ類や昆虫類にみられる、小型で単純な構造の目を何という？");
					System.out.println("①複眼\n②老眼\n③近眼\n④単眼");
					ans.answer(a);
					b--;
					break;
			case 1:System.out.println("次のうち、色の光の波長が最も短い色はどれ？");
					System.out.println("①赤\n②青\n③黄\n④緑");
					ans.answer(a);
					b--;
					break;
			case 2:System.out.println("次のうち、アンモニアの工業的製法はどれ？");
					System.out.println("①ハーバー・ボッシュ法\n②オストワルト法\n③ソルベー法\n④接触法");
					ans.answer(a);
					b--;
					break;

		}
		}while(b > 0);
	}


}
