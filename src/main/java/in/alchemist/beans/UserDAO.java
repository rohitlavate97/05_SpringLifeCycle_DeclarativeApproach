package in.alchemist.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;
//for programmatic approach we have to implement InitializingBean and DisposableBean Interfaces
public class UserDAO implements InitializingBean, DisposableBean {

    //    public void init(){
//        System.out.println("Getting db  connection");
//    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is init method : Getting db  connection");
    }

    public void getData() {
        System.out.println("Getting data from user");
    }

    public void destroy() {
        System.out.println("closing db  connection");
    }
}

