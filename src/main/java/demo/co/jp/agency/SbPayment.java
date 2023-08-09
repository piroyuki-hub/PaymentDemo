package demo.co.jp.agency;

import demo.co.jp.Payment;
import demo.co.jp.agency.mockapi.Sb;

/**
 * ソフトバンクペイメントの決済ロジック
 */
public class SbPayment implements Payment {
    private final Sb api;

    public SbPayment() {
        this.api = new Sb();
    }

    @Override
    public void exec() {
        api.execute();
    }

    @Override
    public void search() {
        api.search();
    }
}
