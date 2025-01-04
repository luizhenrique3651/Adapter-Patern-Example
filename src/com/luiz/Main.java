package com.luiz;

public class Main {

    public static void main(String[] args) {
        // Usando o adaptador
        Shape rectangle = new RectangleAdapter(5, 10);
        
        System.out.println("Área do retângulo: " + rectangle.getArea());
    }
}
