package com.example.calcuicono;

public class Clasesita
{
    private double num1, num2, resultado;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void suma() {
        resultado = num1 + num2;
    }

    public void resta() {
        resultado = num1 - num2;
    }

    public void multiplicacion() {
        resultado = num1 * num2;
    }

    public void division() {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            resultado = 0;
        }
    }
}
