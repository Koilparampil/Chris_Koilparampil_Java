package com.company.monthandmathservice.controller;

import com.company.monthandmathservice.models.MathRequest;
import com.company.monthandmathservice.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathControllers.class)
public class MathControllersTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private MathSolution mathSolution;
    private MathRequest mathRequest;
    @Before
    public void setUp() throws Exception {
        mathRequest =new MathRequest();
        mathSolution = new MathSolution();
    }

    @Test
    public void shouldReturnSumOnPostRequest() throws Exception {
        mathRequest.setOperand1(2);
        mathRequest.setOperand2(2);
        String mathRequestJSON=mapper.writeValueAsString(mathRequest);
        mathSolution.setOperand1(2);
        mathSolution.setOperand2(2);
        mathSolution.setAnswer(4);
        mathSolution.setOperation("add");
        String mathSolutionJSON=mapper.writeValueAsString(mathSolution);

        mockMvc.perform(post("/add")
                .content(mathRequestJSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json(mathSolutionJSON));
    }
    @Test
    public void shouldReturn422OnSumPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        inputMap.put("operand2","a");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/add")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturn422OnSumPostRequestBecauseOnlyOneOperand() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/add")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }


    @Test
    public void shouldReturnDifferenceOnPostRequest() throws Exception {
        mathRequest.setOperand1(20);
        mathRequest.setOperand2(2);
        String mathRequestJSON=mapper.writeValueAsString(mathRequest);
        mathSolution.setOperand1(20);
        mathSolution.setOperand2(2);
        mathSolution.setAnswer(18);
        mathSolution.setOperation("subtract");
        String mathSolutionJSON=mapper.writeValueAsString(mathSolution);

        mockMvc.perform(post("/subtract")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json(mathSolutionJSON));
    }
    @Test
    public void shouldReturn422OnSDifferenceBecauseOnlyOneOperandPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/subtract")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturn422OnSDifferencePostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        inputMap.put("operand2","a");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/subtract")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturnProductOnPostRequest() throws Exception {
        mathRequest.setOperand1(20);
        mathRequest.setOperand2(2);
        String mathRequestJSON=mapper.writeValueAsString(mathRequest);
        mathSolution.setOperand1(20);
        mathSolution.setOperand2(2);
        mathSolution.setAnswer(40);
        mathSolution.setOperation("multiply");
        String mathSolutionJSON=mapper.writeValueAsString(mathSolution);

        mockMvc.perform(post("/multiply")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json(mathSolutionJSON));
    }
    @Test
    public void shouldReturn422OnProductBecauseOnlyOneOperandPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/multiply")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturn422OnProductPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        inputMap.put("operand2","a");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/multiply")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }






    @Test
    public void shouldReturnQuotientOnPostRequest() throws Exception {
        mathRequest.setOperand1(20);
        mathRequest.setOperand2(2);
        String mathRequestJSON=mapper.writeValueAsString(mathRequest);
        mathSolution.setOperand1(20);
        mathSolution.setOperand2(2);
        mathSolution.setAnswer(10);
        mathSolution.setOperation("divide");
        String mathSolutionJSON=mapper.writeValueAsString(mathSolution);

        mockMvc.perform(post("/divide")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json(mathSolutionJSON));
    }
    @Test
    public void shouldReturn422OnQuotientPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        inputMap.put("operand2","a");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/divide")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturn422OnQuotientBecauseOnlyOneOperandPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/divide")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldReturn422OnQuotientBecauseZeroPostRequest() throws Exception {
        Map<String,String> inputMap = new HashMap<>();
        inputMap.put("operand1","24");
        inputMap.put("operand2","0");

        String mathRequestJSON=mapper.writeValueAsString(inputMap);;

        mockMvc.perform(post("/divide")
                        .content(mathRequestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity());
    }
}