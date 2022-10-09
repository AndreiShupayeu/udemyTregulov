package home_work20;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {
    public static ArrayList<String> arraylist(String... s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(String s1:s){
            if(!arrayList.contains(s1)){
                arrayList.add(s1);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }



    public static void main(String[] args) {
        arraylist(new String("Privet"),"Andersen",new String("Poka"), new String("Jhon"),"Andersen");
    }
}
