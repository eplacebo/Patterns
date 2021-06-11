package creational.prototype;

public class TabletFactory {
    Tablet tablet;

    public TabletFactory(Tablet tablet) {
        this.tablet = tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    Tablet cloneTablet(){
        return (Tablet) tablet.copy();
    }
}
