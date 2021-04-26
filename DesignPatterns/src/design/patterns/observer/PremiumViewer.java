package design.patterns.observer;

public class PremiumViewer extends Viewer{
    PremiumViewer(LiveCricketMatch liveCricketMatch){
        this.liveCricketMatch = liveCricketMatch;
        this.liveCricketMatch.registerViewer(this);
    }
    @Override
    public void publish() {
        System.out.println("********** Premium subscriber streaming dashboard: *********");
        System.out.println("Live Match Name = "+this.liveCricketMatch.getName());
        System.out.println("Live Score = "+this.liveCricketMatch.getLiveScore());
    }
}
