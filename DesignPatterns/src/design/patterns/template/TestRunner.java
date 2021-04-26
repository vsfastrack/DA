package design.patterns.template;

import design.patterns.chainOfResponsibility.PolicyModel;

public class TestRunner {
    public static void main(String[] args)throws InterruptedException{
        GenericPolicyCreationTemplate digiCreationTemplate = new DigiPolicyCreationTemplate();
        GenericPolicyCreationTemplate dreiCreationTemplate = new DreiPolicyCreationTemplate();
        digiCreationTemplate.create(new PolicyModel("DIGI_MY"));
        dreiCreationTemplate.create(new PolicyModel("DREI_AT"));
    }
}
