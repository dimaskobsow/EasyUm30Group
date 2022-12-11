package lesson14;

import java.util.Comparator;

public class byMetallFromToCopmare implements Comparator<Coin> {


    @Override
    public int compare(Coin o1, Coin o2) {
        // o1 - first moneta
        // o2 - second moneta

        if (o1.getYear()!= o2.getYear()){
            return o1.getYear() - o2.getYear();
        }
        if (!o1.getMetall().equals(o2.getMetall())){
            return o1.getMetall().compareTo(o2.getMetall());
        }
        if (o1.getDiametr()!= o2.getDiametr()){
            return Double.compare(o1.getDiametr(),o2.getDiametr());
        }

        return o1.getNominal() - o2.getNominal();

    }
}
