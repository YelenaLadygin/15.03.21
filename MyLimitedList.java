package com.company;

import java.util.ArrayList;

public class MyLimitedList {
    protected ArrayList<Integer> m_items;
    protected int m_max_items;

    public MyLimitedList(ArrayList<Integer> m_items, int m_max_items) {
        this.m_items = m_items;
        this.m_max_items = 7;
    }

    public void addItem(Integer a) {
        m_items.add(a);
    }

    public void getItem(Integer index) {
        m_items.get(index);
    }

    public void removeFirstItem(Integer c) {
        m_items.remove(c);
    }


}