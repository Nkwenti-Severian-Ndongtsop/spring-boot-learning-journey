package com.severian.lesson1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class HelloTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnMessageFromComponent() throws Exception {
        mockMvc.perform(get("/result"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome to Spring Boot!"));
    }
}
