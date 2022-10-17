package com.company.monthandmathservice.controller;

import com.company.monthandmathservice.models.MathRequest;
import com.company.monthandmathservice.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MathControllers {

    @PostMapping(value = "/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution addition(@RequestBody @Valid MathRequest req){
        MathSolution additionSolution = new MathSolution(req.getOperand1(), req.getOperand2(), "add");
        int sum =additionSolution.getOperand1()+ additionSolution.getOperand2();
        additionSolution.setAnswer(sum);
        return additionSolution;
    }

    @PostMapping(value = "/subtract")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution subtraction(@RequestBody @Valid MathRequest req){
        MathSolution subtractionSolution = new MathSolution(req.getOperand1(), req.getOperand2(), "subtract");
        int difference =subtractionSolution.getOperand1()- subtractionSolution.getOperand2();
        subtractionSolution.setAnswer(difference);
        return subtractionSolution;
    }

    @PostMapping(value = "/multiply")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution multiplication(@RequestBody @Valid MathRequest req){
        MathSolution multiplicationSolution = new MathSolution(req.getOperand1(), req.getOperand2(), "multiply");
        int product =multiplicationSolution.getOperand1()* multiplicationSolution.getOperand2();
        multiplicationSolution.setAnswer(product);
        return multiplicationSolution;
    }

    @PostMapping(value = "/divide")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution division(@RequestBody @Valid MathRequest req) throws Exception {
        MathSolution divisionSolution = new MathSolution(req.getOperand1(), req.getOperand2(), "divide");
        Integer quotient;
        if (divisionSolution.getOperand2() == 0) {
            throw new IllegalArgumentException("No Zereos allowed in the Denominator");
        } else {
            quotient = divisionSolution.getOperand1() / divisionSolution.getOperand2();
        }
        divisionSolution.setAnswer(quotient);
        return divisionSolution;
    }

}
