package design.patterns.command;

public class DisInvestmentOrder implements Order{
    private final Investment investment;
    DisInvestmentOrder(Investment investment){
        this.investment = investment;
    }
    @Override
    public void execute(String loanOfferId) {
        this.investment.disInvest(loanOfferId);
    }
}
