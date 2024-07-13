package com.telran.org.homework;

public class HomeworkSeven {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        System.out.println("Я могу купить еду = " + canBuy(isEdekaOpen,isReweOpen));
    }

    public static boolean canBuy(boolean Market1, boolean Market2){

        return Market1 || Market2;
    }
}
