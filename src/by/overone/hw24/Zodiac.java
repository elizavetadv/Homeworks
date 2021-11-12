package by.overone.hw24;

public enum Zodiac {
    CAPRICORN, AQUARIUS, PISCES, ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS;

    public static String getUserZodiac(String strMonth){
        Birthday birthday = new Birthday();
        int d = birthday.getUserDay();
        switch (Month.getMonth(strMonth).getNumber()){
            case 1:
                return (d < 20) ? "CAPRICORN" : "AQUARIUS";
            case 2:
                return (d < 19) ? "AQUARIUS" : "PISCES";
            case 3:
                return (d < 21) ? "PISCES" : "ARIES";
            case 4:
                return (d < 20) ? "ARIES" : "TAURUS";
            case 5:
                return (d < 21) ? "TAURUS" : "GEMINI";
            case 6:
                return (d < 22) ? "GEMINI" : "CANCER";
            case 7:
                return (d < 23) ? "CANCER" : "LEO";
            case 8:
                return (d < 23) ? "LEO" : "VIRGO";
            case 9:
                return (d < 23) ? "VIRGO" : "LIBRA";
            case 10:
                return (d < 23) ? "LIBRA" : "SCORPIO";
            case 11:
                return (d < 23) ? "SCORPIO" : "SAGITTARIUS";
            case 12:
                return (d < 22) ? "SAGITTARIUS" : "CAPRICORN";

        }

        return " ";
    }
}
