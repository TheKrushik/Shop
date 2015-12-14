package ru.javabegin.training.fastjava2.shop.Start;

import ru.javabegin.training.fastjava2.shop.bank.Sberbank;
import ru.javabegin.training.fastjava2.shop.bank.VTB;
import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.Subwoofer;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {

//        GoodsInterface goods = new Televisor("Samsung");
//
//        ((Televisor)goods).selectChanel();
//
//        Subwoofer subwoofer = new Subwoofer("Microlab");
//        Computer computer = new Computer("MacBook");
//        Computer computer2 = new Computer("Asus");
//
//        CommonVisitor commonVisitor = new CommonVisitor();
//
//        commonVisitor.buy(goods);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(subwoofer);

        Sberbank sberbank = new Sberbank("Sberbank", "test desc");
        sberbank.checkInfo();
        sberbank.checkInfo();
        sberbank.checkInfo();

        VTB vtb = new VTB("VTB", "test desc");
        vtb.checkInfo();
        vtb.checkInfo();

        System.out.println("Sberbank.requestCount = " + Sberbank.requestCount);

    }
}
