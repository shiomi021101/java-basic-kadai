package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        // 英単語と意味を辞書に追加
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 英単語の意味を取得するメソッド
    public String getMeaning(String word) {
        return dictionary.getOrDefault(word, null);
    }
}
