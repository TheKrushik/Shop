package ru.javabegin.training.fastjava2.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<StaffInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}
