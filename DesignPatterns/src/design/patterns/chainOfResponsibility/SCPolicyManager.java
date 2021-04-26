package design.patterns.chainOfResponsibility;

public abstract class SCPolicyManager extends AbstractPolicyManager {
    abstract protected void execute(PolicyModel policyModelRequest);
}
