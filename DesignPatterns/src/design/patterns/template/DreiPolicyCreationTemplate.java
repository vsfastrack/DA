package design.patterns.template;

import design.patterns.chainOfResponsibility.PolicyModel;

public class DreiPolicyCreationTemplate extends GenericPolicyCreationTemplate{
    @Override
    PolicyModel savePolicy(PolicyModel policyModel) {
        System.out.println("Saving DREI Policy");
        System.out.println("Integration With Comission API");
        return null;
    }
}
