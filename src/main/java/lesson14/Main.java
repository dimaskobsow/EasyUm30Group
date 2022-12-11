package lesson14;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Coin coin1 = new Coin(10,2000,2.3,"Gold1");
        Coin coin2 = new Coin(11,2001,2.3,"Gold2");
        Coin coin3 = new Coin(12,2002,2.3,"Gold3");
        Coin coin4 = new Coin(13,2003,2.3,"Gold4");
        Coin coin5 = new Coin(13,2003,2.3,"Gold4");


        Set<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c:coins) {
            System.out.println(c);
        }



        Coin_Sort coinSort = new Coin_Sort();

        System.out.println("---------printCoinByMetallFromTo-----------");
        coinSort.printCoinByMetallFromTo((TreeSet<Coin>) coins);

        System.out.println("--------printCoinByMetallToFrom----------");
        coinSort.printCoinByMetallToFrom((TreeSet<Coin>)coins);

    }
}
