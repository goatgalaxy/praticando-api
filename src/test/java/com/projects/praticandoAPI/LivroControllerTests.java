package com.projects.praticandoAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.projects.praticandoAPI.controller.LivroController;
import com.projects.praticandoAPI.controller.form.LivroForm;
import com.projects.praticandoAPI.repository.LivroRepository;


@RunWith(SpringRunner.class)
//@SpringBootTest 
@WebMvcTest(controllers = LivroController.class) 

public class LivroControllerTests {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private LivroRepository livroRepository;

	@Test
    public void testGetLivros() throws Exception {
        mockMvc
            .perform(MockMvcRequestBuilders.get("/livros"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

}

