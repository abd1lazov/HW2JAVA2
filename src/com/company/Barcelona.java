package com.company;

public class Barcelona extends Football implements Printable {
    private int year;

    public Barcelona(int чемпионатМира, int лигаЧемпионов, int year) {
        super(чемпионатМира, лигаЧемпионов);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Основан в:" + getYear() + "\nЧемпионат Мира:" + getЧемпионатМира() + "\nЛига Чемпионов:" + getЛигаЧемпионов());
    }
}
