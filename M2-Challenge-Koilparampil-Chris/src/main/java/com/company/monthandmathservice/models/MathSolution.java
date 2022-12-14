package com.company.monthandmathservice.models;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathSolution {

    @NotNull (message = "You must Supply a Number for the first Operand")
    private Integer operand1;

    @NotNull(message = "You must Supply a Number for the second Operand")
    private Integer operand2;

    private String operation;

    private int answer;

    public MathSolution() {
    }

    public MathSolution(Integer operand1, Integer operand2, String operation, int answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }
    public MathSolution(int operand1, int operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }


    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution solution = (MathSolution) o;
        return answer == solution.answer && Objects.equals(operand1, solution.operand1) && Objects.equals(operand2, solution.operand2) && Objects.equals(operation, solution.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}
