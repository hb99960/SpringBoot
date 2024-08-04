package com.learn.beanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanApp {
    public static void main(String[] args) {

        /** Configure Spring Container*/
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        /** Retrieve Bean */
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}


