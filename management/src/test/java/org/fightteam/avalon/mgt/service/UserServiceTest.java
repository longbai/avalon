package org.fightteam.avalon.mgt.service;

import org.fightteam.avalon.mgt.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class UserServiceTest extends SpringTest{

    @Autowired
    private UserService userService;


    @Test
    public void testFindUser() throws Exception {
        //userService.findUser(1l);
    }
}
