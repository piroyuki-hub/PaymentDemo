package demo.co.jp;

public enum PaymentAgency {
    GMOPG("GMO Payment Gateway"),
    SB("ソフトバンクペイメント");

    private final String agency;

    PaymentAgency(String agency) {
        this.agency = agency;
    }

    public String getAgency() {
        return this.agency;
    }
}
