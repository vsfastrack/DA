package design.patterns.observer;

  class BasicViewer extends Viewer{
    BasicViewer(LiveCricketMatch liveCricketMatch){
        this.liveCricketMatch = liveCricketMatch;
        this.liveCricketMatch.registerViewer(this);
    }
    @Override
    public void publish() {
        System.out.println("Basic subscriber streaming dashboard:");
        System.out.println("Live Score = "+this.liveCricketMatch.getLiveScore());
    }
}
