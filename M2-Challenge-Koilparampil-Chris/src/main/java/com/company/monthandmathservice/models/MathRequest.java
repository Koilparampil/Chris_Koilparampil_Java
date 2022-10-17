package com.company.monthandmathservice.models;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathRequest {


    @NotNull(message = "You must Supply a Number for the first Operand")
    private Integer operand1;

    @NotNull (message = "You must Supply a Number for the second Operand")
    private Integer operand2;

    public MathRequest(Integer operand1, Integer operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public MathRequest() {}


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathRequest that = (MathRequest) o;
        return Objects.equals(operand1, that.operand1) && Objects.equals(operand2, that.operand2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2);
    }

    @Override
    public String toString() {
        return "MathRequest{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
}
