package net.online_class.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("videoDao")
public class VideoDao {
    public void test(){
        System.out.println("video Dao test ");
    }
}
