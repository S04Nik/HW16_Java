package com.example.HW15_Spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) throws BeansException {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("app.xml");
//        Book book=context.getBean("book",Book.class);
//        Author author=context.getBean("author",Author.class);
//
//        System.out.println(book.name);
//        System.out.println(author.name);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Book book= (Book) context.getBean("book1");
        Author author= (Author) context.getBean("author1");


//        book.setAuthor(author);
//        System.out.printf(book.author.getName());
//        System.out.printf(author.books.get(0).name);
    }
}
