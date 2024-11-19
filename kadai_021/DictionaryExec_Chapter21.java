package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語
        String[] wordsToSearch = { "apple", "banana", "grape", "orange" };

        // 各単語を辞書で調べて結果を出力
        for (String word : wordsToSearch) {
            String meaning = dictionary.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
