package design.patterns.template;

import design.patterns.chainOfResponsibility.PolicyModel;

public class GenericPolicyCreationTemplate extends PolicyCreationTemplate{

    @Override
    void validateRequest(PolicyModel policyModel) {
        System.out.println("Validating Policy Request");
    }

    @Override
    void integratePolicyWithProduct(PolicyModel policyModel) {
        System.out.println("Integrating with Product for  Policy Request");
    }

    @Override
    void mapProductDataToPolicy(PolicyModel policyModel) {
        System.out.println("Mapping  Product for  Policy Request");
    }

    @Override
    void createCustomerFromPolicy(PolicyModel policyModel) {
        System.out.println("Creating Customer for  Policy Request");
    }

    @Override
    void generateTermsAndConditions(PolicyModel policyModel) {
        System.out.println("Creating T&C for  Policy Request");
    }

    @Override
    void applyProductRules(PolicyModel policyModel) {
        System.out.println("Applying product rules for  Policy Request");
    }

    @Override
    PolicyModel savePolicy(PolicyModel policyModel) {
        System.out.println("Saving  product rules for  Policy Request");
        return null;
    }
}
