package com.projects.praticandoAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.assertEquals;

import com.projects.praticandoAPI.controller.HelloWorld;



@RunWith(SpringRunner.class)
//@SpringBootTest 
@WebMvcTest(controllers = HelloWorld.class) 

public class PraticandoApiApplicationTests {

	@Autowired
    private MockMvc mockMvc;
		
	@Test
    public void testHelloWorld() throws Exception {
        
        mockMvc
                .perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World!"));
    }

    @Test
    public void dummyTest() throws Exception {
        assertEquals(10, 10);
    }


}
