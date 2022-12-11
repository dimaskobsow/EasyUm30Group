package lesson14;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private double diametr;
    private String metall;

    public Coin() {
    }

    public Coin(int nominal, int year, double diametr, String metall) {
        this.nominal = nominal;
        this.year = year;
        this.diametr = diametr;
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(coin.diametr, diametr) == 0 && Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, diametr, metall);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diametr=" + diametr +
                ", metall='" + metall + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        // this - first moneta
        // o - second moneta

        if (this.getYear()!= o.getYear()){
            return this.getYear() - o.getYear();
        }
        if (!this.getMetall().equals(o.getMetall())){
            return this.getMetall().compareTo(o.getMetall());
        }
        if (this.getDiametr()!= o.getDiametr()){
            return Double.compare(this.getDiametr(),o.getDiametr());
        }

       return this.getNominal() - o.getNominal();
    }


}
