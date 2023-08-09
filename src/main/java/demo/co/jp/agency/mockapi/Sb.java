package demo.co.jp.agency.mockapi;

import demo.co.jp.PaymentAgency;

/**
 * ソフトバンクペイメント 提供 API IF (Mock)
 */
public class Sb {
    private final String agency = PaymentAgency.SB.getAgency();

    public void execute() {
        System.out.printf("%s: Execute\n", agency);
    }

    public void search() {
        System.out.printf("%s: Search\n", agency);
    }
}
