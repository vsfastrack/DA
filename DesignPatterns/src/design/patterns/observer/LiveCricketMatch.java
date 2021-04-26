package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class LiveCricketMatch {
    private List<Viewer> streamingViewers = new ArrayList<>();
    private Integer liveScore;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(Integer liveScore) {
        this.liveScore = liveScore;
        this.publishScores();
    }
    public void registerViewer(Viewer viewer){
        this.streamingViewers.add(viewer);
    }
    public void publishScores(){
        System.out.println("HHHHHHHHHHH Publishing live scores HHHHHHHHHHHHH");
        this.streamingViewers.forEach(Viewer::publish);
    }
}
