package design.patterns.chainOfResponsibility;

public class SETPolicyManager extends SCPolicyManager {
    SETPolicyManager(String partnerId){
        this.partnerId = partnerId;
    }
    @Override
    protected void execute(PolicyModel policyModelRequest) {
        System.out.println("Executing SET TAIWAN custom policy creation Flow");
    }
}
