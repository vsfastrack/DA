package design.patterns.command;

import java.math.BigDecimal;

public class TestRunner {
    public static void main(String [] args){
        System.out.println("***************** Command Pattern Demo *************");
        Investment investment = new Investment();
        investment.setAmountInvested(BigDecimal.valueOf(5000));
        investment.setRateOfInterest(BigDecimal.valueOf(5.5));
        investment.setTenureInMonths(12L);
        investment.setRiskRate(BigDecimal.valueOf(6.5));
        Order investOrder = new InvestOrder(investment);
        Investment disInvestment = new Investment();
        disInvestment.setAmountInvested(BigDecimal.valueOf(2000));
        disInvestment.setRateOfInterest(BigDecimal.valueOf(3.5));
        disInvestment.setTenureInMonths(5L);
        disInvestment.setRiskRate(BigDecimal.valueOf(3.5));
        Order disInvestOrder = new DisInvestmentOrder(disInvestment);
        Broker broker = new Broker();
        broker.takeOrder(investOrder);
        broker.takeOrder(disInvestOrder);
        broker.placeOrders();
    }
}
