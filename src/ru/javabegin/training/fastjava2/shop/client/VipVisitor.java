package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    //private String name; �� ����� ����������� ����������, ��� ��� ���� � ��...
    private float discount;



    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            //������ �� �������
        }

    }

    public boolean checkDiscount() {
        return discount>0;
    }

}
