package com.company;

public class Real_Madrid extends Football implements Printable{
    private String fiveCup;

    public Real_Madrid(int чемпионатМира, int лигаЧемпионов, String fiveCup) {
        super(чемпионатМира, лигаЧемпионов);
        fiveCup = fiveCup;
    }

    public String getFiveCup() {
        return fiveCup;
    }

    public void setFiveCup(String fiveCup) {
        fiveCup = fiveCup;
    }

    @Override
    public void print() {
        System.out.println("Обладатель пяти кубков Лиги чемпионов " + getFiveCup() + " \nЧемпионат Мира:" + getЧемпионатМира() + "\nЛига Чемпионов:" + getЛигаЧемпионов());
    }
}
