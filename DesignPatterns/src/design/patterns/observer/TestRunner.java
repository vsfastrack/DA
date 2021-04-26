package design.patterns.observer;

public class TestRunner {
    public static void main(String [] args)throws Exception{
        design.patterns.observer.LiveCricketMatch indiaAusMatch = new LiveCricketMatch();
        indiaAusMatch.setName("India vs Australia");
        design.patterns.observer.LiveCricketMatch englandPakMatch = new LiveCricketMatch();
        englandPakMatch.setName("England vs Pakistan");
        Viewer premiumViewer = new PremiumViewer(indiaAusMatch);
        Viewer basicViewer = new BasicViewer(englandPakMatch);
        indiaAusMatch.setLiveScore(101);
        Thread.sleep(5000);
        englandPakMatch.setLiveScore(99);
        Thread.sleep(5000);
        englandPakMatch.setLiveScore(100);
        Thread.sleep(5000);
        englandPakMatch.setLiveScore(101);
        Thread.sleep(10000);
        indiaAusMatch.setLiveScore(255);
    }
}
