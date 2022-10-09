package p4;
import p1.p2.p3.C;
import p1.A;
import p4.p5.E;
import static p1.p2.B.b1;
public class D {
    public static void main(String[] args) {
        A aaa=new A();
        C ccc=new C();
        E eee=new E();
        int d=aaa.a1+ccc.c1+eee.e1;
        System.out.println(d);
        System.out.println(b1);
    }
}
