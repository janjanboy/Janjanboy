package Chapter8;

public class TwelveMonths {
    public static void main(String[] args) {
        String[] month = {"January","February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"};
        int monthsInYear = 0;
        while (monthsInYear < month.length) {
            System.out.println(month[monthsInYear]);
            monthsInYear++;
        }
    }
}
