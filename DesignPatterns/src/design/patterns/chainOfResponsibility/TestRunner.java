package design.patterns.chainOfResponsibility;

public class TestRunner {
    public static void main(String [] args){
        AbstractPolicyManager managersChain = TestRunner.getChainOfManagers();
        PolicyModel policyModel = new PolicyModel("SET_TAIWAN");
        managersChain.handleRequest(policyModel);
    }

    public static AbstractPolicyManager getChainOfManagers(){
        AbstractPolicyManager digiPolicyManager = new DigiPolicyManager(PartnerEnum.DIGI_MY.getPartnerId());
        AbstractPolicyManager dreiPolicyManager = new DREIPolicyManager(PartnerEnum.DREI_AT.getPartnerId());
        AbstractPolicyManager setPolicyManager = new SETPolicyManager(PartnerEnum.SET_TAIWAN.getPartnerId());
        digiPolicyManager.setNextManager(dreiPolicyManager);
        dreiPolicyManager.setNextManager(setPolicyManager);
        return digiPolicyManager;
    }
}
