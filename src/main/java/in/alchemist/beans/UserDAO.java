package in.alchemist.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//for programmatic approach we have to implement InitializingBean and DisposableBean Interfaces
@Component     //required as using annotation
public class UserDAO  {
    @PostConstruct
    public void init(){
        System.out.println("Getting db  connection");
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("This is init method : Getting db  connection");
// code commented for annotation approach
//    }

    public void getData() {
        System.out.println("Getting data from user");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("closing db  connection");
    }
}

