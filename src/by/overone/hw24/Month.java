package by.overone.hw24;

public enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private int number;

    Month(int number) {
        this.number = number;
    }

    public static Month getMonth(String str) {

        switch (valueOf(str.toUpperCase())) {
            case JANUARY:
                return JANUARY;
            case FEBRUARY:
                return FEBRUARY;
            case MARCH:
                return MARCH;
            case APRIL:
                return APRIL;
            case MAY:
                return MAY;
            case JUNE:
                return JUNE;
            case JULY:
                return JULY;
            case AUGUST:
                return AUGUST;
            case SEPTEMBER:
                return SEPTEMBER;
            case OCTOBER:
                return OCTOBER;
            case NOVEMBER:
                return NOVEMBER;
            case DECEMBER:
                return DECEMBER;
        }
        return null;
    }

    public int getNumber() {
        return number;
    }

}
