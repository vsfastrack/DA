package design.patterns.chainOfResponsibility;

public enum PartnerEnum {
    DIGI_MY("DIGI_MY"),
    SET_TAIWAN("SET_TAIWAN"),
    DREI_AT("DREI_AT"),
    DEFAULT("DAFAULT");

    private String partnerId;
    PartnerEnum(String partnerId) {
        this.partnerId = partnerId;
    }
    public String getPartnerId() {
        return partnerId;
    }
}
