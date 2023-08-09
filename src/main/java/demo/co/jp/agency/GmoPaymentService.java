package demo.co.jp.agency;

import demo.co.jp.PaymentService;
import demo.co.jp.agency.mockapi.GmoPg;

/**
 * GMOPG の決済ロジック
 */
public class GmoPaymentService implements PaymentService {
    private final GmoPg api;

    public GmoPaymentService() {
        this.api = new GmoPg();
    }

    @Override
    public void exec() {
        api.entryTran();
        api.execTran();
    }

    @Override
    public void search() {
        api.searchTrade();
    }
}
