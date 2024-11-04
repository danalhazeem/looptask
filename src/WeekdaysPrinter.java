public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < days.length; i++) {
            if (i >= 3) break;
            System.out.println(days[i]);
        }
    }
}