package demo.co.jp.agency.mockapi;

import demo.co.jp.PaymentAgency;

/**
 * GMOPG 提供 API IF (Mock)
 */
public class GmoPg {
    private final String agency = PaymentAgency.GMOPG.getAgency();

    public void entryTran() {
        System.out.printf("%s: EntryTran\n", agency);
    }

    public void execTran() {
        System.out.printf("%s: ExecTran\n", agency);
    }

    public void searchTrade() {
        System.out.printf("%s: SearchTrade\n", agency);
    }
}
