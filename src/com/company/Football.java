package com.company;

public class Football {
    private int  ЧемпионатМира;
    private int ЛигаЧемпионов;

    public Football(int чемпионатМира, int лигаЧемпионов) {
       this.ЧемпионатМира = чемпионатМира;
       this.ЛигаЧемпионов = лигаЧемпионов;
    }

    public int getЧемпионатМира() {
        return ЧемпионатМира;
    }

    public void setЧемпионатМира(int чемпионатМира) {
        ЧемпионатМира = чемпионатМира;
    }

    public int getЛигаЧемпионов() {
        return ЛигаЧемпионов;
    }

    public void setЛигаЧемпионов(int лигаЧемпионов) {
        ЛигаЧемпионов = лигаЧемпионов;
    }
}
