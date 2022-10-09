package home_work15;

public class Time {
    public static void main(String[] args) {
        int hour=0;
        while(hour<24){
            int min=0;
            do{
                int sec=0;
              while(sec<60){
                  System.out.println(hour+":"+min+":"+sec);
                  sec++;
              }
              min++;
            }
            while(min<60);
            hour++;
        }
    }
}
