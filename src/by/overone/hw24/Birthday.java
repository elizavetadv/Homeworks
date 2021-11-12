package by.overone.hw24;

public class Birthday {

    class MonthBh {
        private String userMonth;

        public String getUserMonth() {
            return userMonth;
        }

        public void setUserMonth(String str) {
            this.userMonth = Month.getMonth(str).toLowerCase();
        }

    }


}
