package home_work17;

public class StringB {
    public static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        String sa = new String(a);
        String sb = new String(b);
        return sa.equals(sb);
    }

    public static boolean ravenstvo1(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class StringBTest {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Privet Jane!");
        StringBuilder b = new StringBuilder("Privet Jan!");
        System.out.println(a == b);
        System.out.println(StringB.ravenstvo(a, b));
        System.out.println(StringB.ravenstvo1(a,b));
    }
}
