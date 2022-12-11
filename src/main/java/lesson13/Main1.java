package lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);

        System.out.println(arrayList);
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println("-----------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
        for(Iterator<Integer>iterator = arrayList.iterator(); iterator.hasNext();){
            
        }
    }
}