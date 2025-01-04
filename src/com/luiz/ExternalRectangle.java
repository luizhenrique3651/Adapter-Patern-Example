package com.luiz;

//Essa classe é um exemplo que simula uma biblioteca
public class ExternalRectangle {
    private  double width;
    private  double height;

    

	//instancia um retangulo, recebendo largura e altura
    public ExternalRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //calcula a area desse retangulo criado.
    public double computeArea() {
        return width * height;
    }
}
