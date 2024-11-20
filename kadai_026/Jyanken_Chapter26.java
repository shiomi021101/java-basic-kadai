package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    // 自分のじゃんけんの手を取得するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう:");
        System.out.println("グーはrockのr、チョキはscissorsのs、パーはpaperのpを入力してください");
        String choice = scanner.nextLine().toLowerCase();

        // 入力チェック
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。もう一度入力してください:");
            choice = scanner.nextLine().toLowerCase();
        }

        return choice;
    }

    // 対戦相手の手を乱数で選ぶメソッド
    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        Random random = new Random();
        int index = (int) Math.floor(random.nextDouble() * 3);
        return choices[index];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String opponentChoice) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
