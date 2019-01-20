package com.springboot.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/20 10:32 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootTestsApplication.class})
public class SpringBootTestDemo {


    @Test
    public void testOne(){
        System.out.println("Test Hello 1");
    }

    @Test
    public void testTwo(){
        System.out.println("Test Hello 2");
    }

    @Before
    public void testBefore(){
        System.out.println("Test Before");
    }

    @After
    public void testAfter(){
        System.out.println("Test After");
    }
}
