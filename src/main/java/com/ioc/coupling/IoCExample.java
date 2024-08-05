package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("application.IoC.LooseCouplingExample.xml");

//        UserDataProvider userDataProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(userDataProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

//        WebServiceDataProvider webServiceDataProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceDataProvider);
        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithMongoDatabaseProvider");
        System.out.println(userManagerWithWS.getUserInfo());

//        UserDataProvider newDatabaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithWebServiceDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

    }
}

/** Loose Coupling is a design principle that aims to reduce the dependencies between components within a system
 * IoC is a design principle where the control of object creation and lifecycle management is transferred from the
 *  application code to an external container or framework i.e. Spring Boot
 * DI is a design pattern commonly used in oops, where the dependencies of a class are provided externally
 *  rather than being created within the class itself
 * Beans are the objects that are managed by framework
 * Spring Container have objects whose life-cycle is managed by Spring Container.
 *  2 types : 1. Application Context(Advanced, more common) 2. BeanFactory
 * Configuration file contains Bean definition
 * Maven : getting the jar files in your project makes life easier
 * Dependencies : Spring-Core (most basic), Spring-Context (next basic)
 *
 * Bean Config can be done through : XML, Config files, Annotations, Java-based Config
 * Dependency Injection is design pattern to achieve loose coupling by removing direct dependency instantiation from the dependent class itself
 * Two types : Constructor, Setter
 *
 */