package demo.co.jp;

import demo.co.jp.agency.GmoPayment;
import demo.co.jp.agency.SbPayment;

/**
 * 決済
 */
public class PaymentService {
    private final Payment payment;

    public PaymentService(PaymentAgency agency) {
        // デフォルト GMOPG
        this.payment = PaymentAgency.SB == agency ? new SbPayment() : new GmoPayment();
        System.out.printf("[ 決済代行会社：%s ]\n", agency.getAgency());
    }

    public void exec() {
        payment.exec();
    }

    public void search() {
        payment.search();
    }
}
