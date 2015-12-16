package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    //private String name; не нужно дублировать переменную, она уже есть в ро...
    private float discount;

    public VipVisitor(String джон, int i) {

    }


    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            //купить со скидкой
        }

    }

    public boolean checkDiscount() {
        return discount>0;
    }

}
