package demo.co.jp.agency;

import demo.co.jp.Payment;
import demo.co.jp.agency.mockapi.GmoPg;

/**
 * GMOPG の決済ロジック
 */
public class GmoPayment implements Payment {
    private final GmoPg api;

    public GmoPayment() {
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
