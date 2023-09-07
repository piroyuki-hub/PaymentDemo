package demo.co.jp.util;

import com.ibm.icu.text.Transliterator;
import org.apache.commons.lang3.StringUtils;

public class CharConversionUtil {

    private static final Transliterator H2K = Transliterator.getInstance("Hiragana-Katakana");

    // NOTE: カタカナ濁点などの合成文字は、そのままだとローマ字変換されてしまうので、一度バラしてから変換、その後戻すことで不要な変換を防ぐ
    private static final Transliterator H2R = Transliterator.getInstance("NFD; Hiragana-Latin; NFC;");

    /**
     * ひらがな -> カタカナ
     * <p>
     *     ひらがな以外は変換しない
     * </p>
     *
     * @param hiragana
     *          ひらがな
     * @return 変換結果
     */
    public static String convertHiraToKata(String hiragana) {
        return StringUtils.isEmpty(hiragana) ? hiragana : H2K.transliterate(hiragana);
    }

    /**
     * ひらがな -> ローマ字
     * <p>
     *     ひらがな以外は変換しない
     * </p>
     *
     * @param hiragana
     *          ひらがな
     * @return 変換結果
     */
    public static String convertHiraToRoma(String hiragana) {
        return StringUtils.isEmpty(hiragana) ? hiragana : H2R.transliterate(hiragana);
    }
}
