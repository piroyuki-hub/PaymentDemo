package demo.co.jp;

import org.junit.jupiter.api.Test;

/**
 * 各決済代行サービスを指定し、共通 IF で決済処理を実施
 */
public class PaymentServiceTest {

    /** GMOPG */
    @Test
    void usageGmoTest() {
        PaymentService service = PaymentServiceFactory.getService(PaymentAgency.GMOPG);
        service.exec();
        service.search();
    }

    /** SB */
    @Test
    void usageSbTest() {
        PaymentService service = PaymentServiceFactory.getService(PaymentAgency.SB);
        service.exec();
        service.search();
    }
}
