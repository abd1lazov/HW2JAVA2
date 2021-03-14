package com.company;

public class Psg extends Football implements Printable {
    private String championOfFrance;

    public Psg(int чемпионатМира, int лигаЧемпионов, String championOfFrance) {
        super(чемпионатМира, лигаЧемпионов);
        this.championOfFrance = championOfFrance;
    }

    public String getChampionOfFrance() {
        return championOfFrance;
    }

    public void setChampionOfFrance(String championOfFrance) {
        this.championOfFrance = championOfFrance;
    }

    @Override
    public void print() {
        System.out.println("Чемпион Фрнации:" + getChampionOfFrance() + "\nЧемпионатМира:" + getЧемпионатМира() + "\nЛигаЧемпионов:" + getЛигаЧемпионов());
    }
}
