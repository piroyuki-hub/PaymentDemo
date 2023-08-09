package demo.co.jp;

/**
 * 決済処理の IF (決済代行が変わってもビジネスロジックから呼び出す IF はこれ)
 */
public interface Payment {
    void exec();
    void search();
}
