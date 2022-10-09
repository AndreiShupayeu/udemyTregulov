package home_work14;

public class Time {
    public static void showTime() {
        for (int hour = 0; hour < 6; hour++) {
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) {
                    break;
                }
                for (int sec = 0; sec < 60; sec++) {
                    if(sec*hour>min){
                        continue;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
