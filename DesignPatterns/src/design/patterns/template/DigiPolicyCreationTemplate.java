package design.patterns.template;

import design.patterns.chainOfResponsibility.PolicyModel;

public class DigiPolicyCreationTemplate extends GenericPolicyCreationTemplate{
    @Override
    PolicyModel savePolicy(PolicyModel policyModel) {
        System.out.println("Saving DIGI Policies");
        System.out.println("Upload images to CRMZ");
        System.out.println("Integrate with CPA");
        return null;
    }
}
