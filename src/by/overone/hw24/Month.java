package by.overone.hw24;

public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public static String getMonth(String str) {

        switch (valueOf(str.toUpperCase())) {
            case JANUARY:
                return JANUARY.toString();
            case FEBRUARY:
                return FEBRUARY.toString();
            case MARCH:
                return MARCH.toString();
            case APRIL:
                return APRIL.toString();
            case MAY:
                return MAY.toString();
            case JUNE:
                return JUNE.toString();
            case JULY:
                return JULY.toString();
            case AUGUST:
                return AUGUST.toString();
            case SEPTEMBER:
                return SEPTEMBER.toString();
            case OCTOBER:
                return OCTOBER.toString();
            case NOVEMBER:
                return NOVEMBER.toString();
            case DECEMBER:
                return DECEMBER.toString();
            default:
                return null;
        }
    }
}
