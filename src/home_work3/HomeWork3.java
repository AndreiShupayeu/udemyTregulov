package home_work3;

public class HomeWork3 {
    public static void main(String[] args) {
        int i1=5;
        int i2=11;
        double d1=5.5;
        double d2=1.3;
        long l=20l;
        double result=0;
        result =i2/d1 +d2%i1-l;
        /*    11/5.5+1.3%5-20= 2+0-20=-18            */
        System.out.println(result);
        System.out.println(i2/d1);
        System.out.println(d2%i1);

        int a=5; /*4, 3, 4 ,5         2,6,10=15   */
        int b=8; /* 10,11,10     9-9=0+11=11-10=1 */
        System.out.println(a-- - --a + ++a +a++ + a);
        System.out.println(++b - b++ + ++b - --b);

    }
}
