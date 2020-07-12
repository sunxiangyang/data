package bean;

public class EventWithBLOBs extends Event {
    private String intro;

    private String figureData;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getFigureData() {
        return figureData;
    }

    public void setFigureData(String figureData) {
        this.figureData = figureData == null ? null : figureData.trim();
    }
}