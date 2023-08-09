package demo.co.jp;

import demo.co.jp.agency.GmoPaymentService;
import demo.co.jp.agency.SbPaymentService;

/**
 * 決済
 */
public class PaymentServiceFactory {
    public static PaymentService getService(PaymentAgency agency) {
        // デフォルト GMOPG
        System.out.printf("[ 決済代行会社：%s ]\n", agency.getAgency());
        return PaymentAgency.SB == agency ? new SbPaymentService() : new GmoPaymentService();
    }
}
