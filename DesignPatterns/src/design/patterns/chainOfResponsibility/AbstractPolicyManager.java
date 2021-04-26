package design.patterns.chainOfResponsibility;

import java.util.Objects;

public abstract class AbstractPolicyManager {
    protected AbstractPolicyManager nextManager;
    protected String partnerId;

    public void setNextManager(AbstractPolicyManager nextManager) {
        this.nextManager = nextManager;
    }
    protected void handleRequest(PolicyModel policyModel){
        System.out.println("             ||                      ");
        System.out.println("Traversing manager Chain = "+ partnerId);
        if(policyModel.getPartnerId().equals(PartnerEnum.valueOf(partnerId).getPartnerId())){
            execute(policyModel);
        }else if(Objects.nonNull(nextManager)){
            System.out.println("Delegating to next manager in the Chain");
            nextManager.handleRequest(policyModel);
        }
    }
    abstract protected void execute(PolicyModel policyRequest);
}
