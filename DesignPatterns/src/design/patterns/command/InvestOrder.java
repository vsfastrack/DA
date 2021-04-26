package design.patterns.command;

public class InvestOrder implements Order {
    private final Investment investment;
    public InvestOrder(Investment investment){
        this.investment = investment;
    }
    @Override
    public void execute(String loanOfferId) {
        this.investment.invest(loanOfferId);
    }
}
