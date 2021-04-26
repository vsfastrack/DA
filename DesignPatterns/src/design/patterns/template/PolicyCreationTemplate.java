package design.patterns.template;

import design.patterns.chainOfResponsibility.PolicyModel;

public abstract class PolicyCreationTemplate {
    abstract void validateRequest(PolicyModel policyModel);
    abstract void integratePolicyWithProduct(PolicyModel policyModel);
    abstract void mapProductDataToPolicy(PolicyModel policyModel);
    abstract void createCustomerFromPolicy(PolicyModel policyModel);
    abstract void generateTermsAndConditions(PolicyModel policyModel);
    abstract void applyProductRules(PolicyModel policyModel);
    abstract PolicyModel savePolicy(PolicyModel policyModel);
    public final PolicyModel create(PolicyModel policyModel){
        validateRequest(policyModel);
        integratePolicyWithProduct(policyModel);
        mapProductDataToPolicy(policyModel);
        createCustomerFromPolicy(policyModel);
        generateTermsAndConditions(policyModel);
        applyProductRules(policyModel);
        return savePolicy(policyModel);
    }
}
