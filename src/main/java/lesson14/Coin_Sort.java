package lesson14;

import java.util.Comparator;
import java.util.TreeSet;

public class Coin_Sort {


    public void printCoinByMetallFromTo(TreeSet<Coin>coins){
        TreeSet<Coin> byMetall = new TreeSet<>(new byMetallFromToCopmare());
            byMetall.addAll(coins);

            for(Coin c : byMetall){
                System.out.println(c);
            }
    }

    public void printCoinByMetallToFrom(TreeSet<Coin>coins){
        TreeSet<Coin> byMetall = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o2.getYear()!= o1.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                if (!o2.getMetall().equals(o1.getMetall())){
                    return o1.getMetall().compareTo(o2.getMetall());
                }
                if (o2.getDiametr()!= o1.getDiametr()){
                    return Double.compare(o1.getDiametr(),o2.getDiametr());
                }

                return o2.getNominal() - o1.getNominal();
            }
        });
        byMetall.addAll(coins);

        for(Coin c : byMetall){
            System.out.println(c);
        }
    }

    public void printCoinByDiametrFromTo(TreeSet<Coin>coins){

    }

    public void printCoinByDiametrToFrom(TreeSet<Coin>coins){

    }
}
