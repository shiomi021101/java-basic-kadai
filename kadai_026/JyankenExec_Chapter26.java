package kadai_026;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        Jyanken_Chapter26 game = new Jyanken_Chapter26();

        // 自分の手を取得
        String myChoice = game.getMyChoice();

        // 対戦相手の手を取得
        String opponentChoice = game.getRandom();

        // じゃんけんを実行
        game.playGame(myChoice, opponentChoice);
    }
}
