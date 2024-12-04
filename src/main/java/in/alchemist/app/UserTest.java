package in.alchemist.app;

import in.alchemist.beans.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
//this is declaration approach
//for programmatic approach we have to implement InitializingBean and DisposableBean Interfaces
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        UserDAO dao=context.getBean(UserDAO.class);
        dao.getData();
        //after this execute the main method execute finish, JVM shutdown-->so destroy method do not execute. so we add sone code for it
        ConfigurableApplicationContext ctxt=(ConfigurableApplicationContext) context;  //Super Interface
        ctxt.close();
    }
}
