//Test Code Taken From class Activity RecordStore
package com.company.monthandmathservice.controller;

import com.company.monthandmathservice.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(MonthControllers.class)
public class MonthControllersTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @org.junit.Before
    public void setUp() throws Exception {}


    @Test
    public void shouldReturnASingleMonth() throws Exception {
        //Arrange
        Month outputMonth = new Month();
        outputMonth.setName("March");
        outputMonth.setNumber(3);

        //Convert java Object to JSON
        String outputJSON =mapper.writeValueAsString(outputMonth);

        //ACT
        mockMvc.perform(get("/month/3"))
                .andDo(print())
                .andExpect(status().isOk())                     // ASSERT that we got back 200 OK.
                .andExpect(content().json(outputJSON));         // ASSERT that what we're expecting is what we got back.
    }
    @Test
    public void shouldReturnA422ErrorWhenInPuttingSomethingOutOfRange() throws Exception {

        mockMvc.perform(get("/month/13"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
        mockMvc.perform(get("/month/0"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void getARandomMonth() throws Exception{

        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}