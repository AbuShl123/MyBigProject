package myOwn.builderPattern.PracticeBuilder;

public class HouseBuilder extends House{
    int area;
    String style;
    int stages;
    public HouseBuilder (int area, String style, int stages) {
        this.area = area;
        this.style = style;
        this.stages = stages;
    }

    char hasPool;
    public HouseBuilder hasPool(String hasPool) {
        this.hasPool = hasPool.charAt(0);
        return this;
    }


}
