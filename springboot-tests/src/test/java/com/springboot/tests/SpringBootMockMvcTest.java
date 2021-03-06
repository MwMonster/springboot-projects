package com.springboot.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/20 10:46 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootTestsApplication.class})
@AutoConfigureMockMvc
public class SpringBootMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMockMvc() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/v1/hello")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
    }
}
