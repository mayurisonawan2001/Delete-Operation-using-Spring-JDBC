package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Delete student with id 102
        int result = studentDao.deleteStudent(102);
        System.out.println("Record deleted: " + result);
    }
}
