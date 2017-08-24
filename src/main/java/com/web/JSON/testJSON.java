package com.web.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.User;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by mr.wl on 2017/8/24
 */
public class testJSON {
    @Test
    public void test() throws IOException {
        User user = new User("laowang",123);
        User user1 = new User("laow",23);
        User user2 = new User("laang",13);
        User user3 = new User("lwang",1);
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        ObjectMapper mapper = new ObjectMapper();
        //将对象转成JSON
        // String str = mapper.writeValueAsString(list);
        //将JSON转为对象
        User user4 = mapper.readValue("{\"name\":\"lwang\",\"age\":1}",User.class);
        System.out.println(user4.getName()+"---"+user4.getAge());
    }
}
