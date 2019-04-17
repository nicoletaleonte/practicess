package practices;

public abstract class Widget {
    private final int cachedWidth;
    private final int cachedHeight;

    //nu are nicio treba, un constructor intr-o clasa abstracta e degeaba
    //de obicei se lasa constructorul default fara vreun parametru
    public Widget() {
        this.cachedWidth = width();
        this.cachedHeight = height();
    }

    protected abstract int width();
    protected abstract int height();
}
