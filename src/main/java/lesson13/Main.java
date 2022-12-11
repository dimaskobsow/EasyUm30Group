package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        try {
            LinkedList<String> arrayList = new LinkedList<>();
            arrayList.add("1 last text");
            arrayList.add("2 last text");
            arrayList.add("3 last text");
            arrayList.addLast("4 last text");
            arrayList.add(0, "0 last text");
            for(int i= 0; i < arrayList.size() ;i++){
                System.out.println(arrayList);
            }
        }catch (Exception e){
            System.out.println("Exception");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - start);


        long start1 = System.currentTimeMillis();
        try{
            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("1 last text");
            arrayList1.add("2 last text");
            arrayList1.add("3 last text");
            arrayList1.add(0,"0 last text");
            for(int i= 0; i <arrayList1.size() ;i++){
                System.out.println(arrayList1);
            }

        }catch (Exception e ){
            System.out.println("Exception ");
        }

        long fin1 = System.currentTimeMillis();
        System.out.println(fin1 - start1);



    }
}
