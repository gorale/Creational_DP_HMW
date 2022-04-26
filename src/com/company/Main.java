package com.company;

import builder.Book;
import builder.BookBuilder;
import factory.ShapeFactory;
import singleton.SingletonDatabaseConnection;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection con = SingletonDatabaseConnection.getSingleton().createConnection();
        Book book = new Book("A12","Title","Genre","Author", "12/02/2012","Description");
//        book = new Book("A12","Title","Genre","aaAuthor", Calendar.getInstance().getTime(),"Description");
        Book book1 = new Book("A12","Tit11le","Genre","Author", "13/09/2014","Description");

        Book builder = new BookBuilder().setAuthor("Gor").setTitle("Book Title").build();
//        System.out.println(builder);
//
//        System.out.println(book);

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShape("triangle").shape();
        shapeFactory.createShape("Rectangle").shape();






    }
}
