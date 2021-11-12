package by.overone.hw24;

public enum Zodiac {
    CAPRICORN, AQUARIUS, PISCES, ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS;

    public static String getUserZodiac(String strMonth){
        Birthday birthday = new Birthday();
        int d = birthday.getUserDay();
        switch (Month.getMonth(strMonth).getNumber()){
            case 1:
                return (d < 20) ? CAPRICORN.toString() : AQUARIUS.toString();
            case 2:
                return (d < 19) ? AQUARIUS.toString() : PISCES.toString();
            case 3:
                return (d < 21) ? PISCES.toString() : ARIES.toString();
            case 4:
                return (d < 20) ? ARIES.toString() : TAURUS.toString();
            case 5:
                return (d < 21) ? TAURUS.toString() : GEMINI.toString();
            case 6:
                return (d < 22) ? GEMINI.toString() : CANCER.toString();
            case 7:
                return (d < 23) ? CANCER.toString() : LEO.toString();
            case 8:
                return (d < 23) ? LEO.toString() : VIRGO.toString();
            case 9:
                return (d < 23) ? VIRGO.toString() : LIBRA.toString();
            case 10:
                return (d < 23) ? LIBRA.toString() : SCORPIO.toString();
            case 11:
                return (d < 23) ? SCORPIO.toString() : SAGITTARIUS.toString();
            case 12:
                return (d < 22) ? SAGITTARIUS.toString() : CAPRICORN.toString();

        }

        return " ";
    }
}
