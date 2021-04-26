package design.patterns.command;

import java.math.BigDecimal;

public class Investment {
    private BigDecimal amountInvested;
    private BigDecimal rateOfInterest;
    private Long tenureInMonths;
    private BigDecimal riskRate;

    @Override
    public String toString() {
        return "Investment{" +
                "amountInvested=" + amountInvested +
                ", rateOfInterest=" + rateOfInterest +
                ", tenureInMonths=" + tenureInMonths +
                ", riskRate=" + riskRate +
                '}';
    }

    public void invest(String loanOfferIdentifier){
        System.out.println("Investment Order for Loan Offer =="+loanOfferIdentifier + "investment===="+this);
    }

    public void disInvest(String loanOfferIdentifier){
        System.out.println("DisInvestment Order for Loan Offer =="+loanOfferIdentifier + "disinvestment===="+this);
    }

    public BigDecimal getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(BigDecimal amountInvested) {
        this.amountInvested = amountInvested;
    }

    public BigDecimal getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(BigDecimal rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public Long getTenureInMonths() {
        return tenureInMonths;
    }

    public void setTenureInMonths(Long tenureInMonths) {
        this.tenureInMonths = tenureInMonths;
    }

    public BigDecimal getRiskRate() {
        return riskRate;
    }

    public void setRiskRate(BigDecimal riskRate) {
        this.riskRate = riskRate;
    }
}
