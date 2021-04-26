package design.patterns.observer;

public abstract class Viewer {
    protected LiveCricketMatch liveCricketMatch;
    public abstract void publish();
}
