package design.patterns.chainOfResponsibility;

import design.patterns.template.DigiPolicyCreationTemplate;

public class DigiPolicyManager extends AbstractPolicyManager{
    DigiPolicyManager(String partnerId){
        this.partnerId = partnerId;
    }
    @Override
    protected void execute(PolicyModel policyRequest) {
        new DigiPolicyCreationTemplate().create(policyRequest);
    }
}
