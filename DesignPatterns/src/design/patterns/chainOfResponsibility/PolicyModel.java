package design.patterns.chainOfResponsibility;

public class PolicyModel {
    private final String partnerId;
    public PolicyModel(String partnerId){
        this.partnerId = partnerId;
    }
    public String getPartnerId() {
        return partnerId;
    }
}
