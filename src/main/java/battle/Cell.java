package battle;

public enum Cell {
    EMPTY("-"), KILLED("☒"), DECK("▢"), MISSED("●");

    private String icon;

    Cell(String icon) {
        this.icon = icon;

    }

    @Override
    public String toString() {
        return icon;
    }
}