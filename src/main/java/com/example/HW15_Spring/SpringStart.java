package com.example.HW15_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app.xml");
        Book book=context.getBean("book",Book.class);
        Author author=context.getBean("author",Author.class);

        System.out.println(book.name);
        System.out.println(author.name);
    }
}
