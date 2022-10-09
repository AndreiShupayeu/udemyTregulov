package home_work6;

public class HomeMath {
    int sum(){
        int result=0;
        System.out.println(result);
        return result;
    }
    int sum(int a, int b, int c, int d){
        System.out.println( a+b+c+d);
        return a+b+c+d;

    }
    int sum(int a, int b, int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    int sum(int a){
        System.out.println(a);
        return a;
    }
}
class HomeMathTest{
    public static void main(String[] args) {
        HomeMath hm=new HomeMath();
        hm.sum();
        hm.sum(10);
        hm.sum(10,10);
        hm.sum(10,10,10);
        hm.sum(10,10,10,10);
    }
}
