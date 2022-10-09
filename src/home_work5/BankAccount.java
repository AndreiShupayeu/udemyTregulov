package home_work5;

public class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double d){
        balance+=d;
    }
    void snyatieSoScheta(double d1){
        balance-=d1;
    }
}
