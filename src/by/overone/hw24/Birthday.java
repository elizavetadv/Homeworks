package by.overone.hw24;

public class Birthday {
    private int userDay;

    MonthBh monthBh;

    {
        monthBh = new MonthBh();
    }

    public int getUserDay() {
        return userDay;
    }

    public void setUserDay(int userDay) {
        this.userDay = userDay;
    }

    class MonthBh {
        private String userMonth;

        public String getUserMonth() {
            return userMonth;
        }

        public void setUserMonth(String str) {
            this.userMonth = Month.getMonth(str).toString();
        }

    }


}
