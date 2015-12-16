package ru.javabegin.training.fastjava2.shop.goods;

public class Televisor extends ElectronicDevice {

    public Televisor(int i, boolean b, String smartTV, String name) {
        super(name);
    }

    public void selectChanel(){
        System.out.println("select channel");
    }
}
