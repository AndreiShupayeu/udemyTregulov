package home_work8;

public class FirstClass {
    static final double Pi=3.14;
    double squareOfCircle(int r){
        return Pi*r*r;
    }
    static double circleLength(int r){
      return 2*Pi*r;
    }
    void showLengthAndSquareCircle(int r){
        System.out.println("Площадь круга: "+Pi*r*r);
        System.out.println("Длинна круга: "+2*Pi*r);
    }

    static int multiplication(int a,int b, int c){
        return a*b*c;
    }
    static void showInfo(int a, int b){
        System.out.println("Целое частное: "+a/b);
        System.out.println("Остаток от деления: "+a%b);
    }
}
class FirstClassTest{
    public static void main(String[] args) {
        int result=FirstClass.multiplication(5,2,5);
        System.out.println("Результат метода multiplication: "+result);
        FirstClass.showInfo(25,12);

        FirstClass fc=new FirstClass();
        System.out.println(fc.squareOfCircle(5));
        fc.showLengthAndSquareCircle(6);
        System.out.println(fc.circleLength(8));


    }
}
