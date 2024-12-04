package in.alchemist.beans;

import org.springframework.stereotype.Repository;

public class UserDAO {
    public void init(){
        System.out.println("Getting db  connection");
    }
    public void getData(){
        System.out.println("Getting data from user");
    }
    public void destroy(){
        System.out.println("closing db  connection");
    }
}
