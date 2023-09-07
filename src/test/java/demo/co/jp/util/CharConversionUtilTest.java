package demo.co.jp.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

public class CharConversionUtilTest {

    @ParameterizedTest
    @MethodSource("usageConvertH2KProvider")
    void usageConvertH2KTest(String hiragana, String expected) {
        String actual = CharConversionUtil.convertHiraToKata(hiragana);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> usageConvertH2KProvider() {
        return Stream.of(
                arguments(null, null),
                arguments(StringUtils.EMPTY, StringUtils.EMPTY),
                arguments(StringUtils.SPACE, StringUtils.SPACE),
                arguments("Yamada Taro", "Yamada Taro"),
                arguments("ヤマダ　タロウ", "ヤマダ　タロウ"),
                arguments("山田太郎", "山田太郎"),
                // NOTE: ▼ target case
                arguments("やまだ たろう", "ヤマダ タロウ"),
                arguments("本日は晴天ナリ", "本日ハ晴天ナリ")
        );
    }

    @ParameterizedTest
    @MethodSource("usageConvertH2RProvider")
    void usageConvertH2RTest(String hiragana, String expected) {
        String actual = CharConversionUtil.convertHiraToRoma(hiragana);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> usageConvertH2RProvider() {
        return Stream.of(
                arguments(null, null),
                arguments(StringUtils.EMPTY, StringUtils.EMPTY),
                arguments(StringUtils.SPACE, StringUtils.SPACE),
                arguments("Yamada Taro", "Yamada Taro"),
                arguments("ヤマダ　タロウ", "ヤマダ　タロウ"),
                arguments("山田太郎", "山田太郎"),
                // NOTE: ▼ target case
                arguments("やまだ たろう", "yamada tarou"),
                arguments("本日は晴天ナリ", "本日ha晴天ナリ")
        );
    }
}
