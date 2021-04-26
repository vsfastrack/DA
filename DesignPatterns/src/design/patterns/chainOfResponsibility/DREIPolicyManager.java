package design.patterns.chainOfResponsibility;

public class DREIPolicyManager extends AbstractPolicyManager{
    DREIPolicyManager(String partnerId){
        this.partnerId = partnerId;
    }
    @Override
    protected void execute(PolicyModel policyModelRequest) {
        System.out.println("Executing DREI AT custom policy creation Flow");
    }
}
