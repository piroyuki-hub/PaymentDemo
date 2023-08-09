package demo.co.jp.agency;

import demo.co.jp.PaymentService;
import demo.co.jp.agency.mockapi.Sb;

/**
 * ソフトバンクペイメントの決済ロジック
 */
public class SbPaymentService implements PaymentService {
    private final Sb api;

    public SbPaymentService() {
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
