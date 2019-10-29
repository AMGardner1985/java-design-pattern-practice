package com.gardner.adam.designpatterndemo.factory.demo;

import com.gardner.adam.designpatterndemo.factory.demo.pages.CartPage;
import com.gardner.adam.designpatterndemo.factory.demo.pages.ItemPage;
import com.gardner.adam.designpatterndemo.factory.demo.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
