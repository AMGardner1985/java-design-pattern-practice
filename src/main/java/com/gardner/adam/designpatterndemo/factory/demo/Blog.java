package com.gardner.adam.designpatterndemo.factory.demo;

import com.gardner.adam.designpatterndemo.factory.demo.pages.AboutPage;
import com.gardner.adam.designpatterndemo.factory.demo.pages.CommentPage;
import com.gardner.adam.designpatterndemo.factory.demo.pages.ContractPage;
import com.gardner.adam.designpatterndemo.factory.demo.pages.PostPage;

public class Blog extends Website {

    // the concrete implementation has to deal with creating the pages
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContractPage());
    }
}
