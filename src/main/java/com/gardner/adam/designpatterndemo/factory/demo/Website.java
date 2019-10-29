package com.gardner.adam.designpatterndemo.factory.demo;

import com.gardner.adam.designpatterndemo.factory.demo.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    // doesn't have anything to actually create the pages,

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages(){
        return this.pages;
    }

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();
}
