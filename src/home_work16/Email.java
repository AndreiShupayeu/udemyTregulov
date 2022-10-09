package home_work16;

public class Email {
    public static void email(String a) {
        int first = 0;
        int last;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '@') {
                first = i + 1;
            }
            if (a.charAt(i) == '.') {
                last = i;
                System.out.println(a.substring(first, last));
            }
            if (a.charAt(i) == ';') {
                first = 0;
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
