package com.luiz;

//classe Adaptador que representa o retângulo e imlementa a interface genérica
public class RectangleAdapter implements Shape{

	/*instancia da biblioteca, que posteriormente pode ser trocada por qualquer 
	 * outra, sem alterar o comportamento do código, a maior alteração que poderia
	 * ser necessária, seria na implementação do getArea(), onde a nova biblioteca
	 * teria um nome de função diferente, ou necessitaria de algum parametro a mais, por exemplo.*/
    private ExternalRectangle rectangle;

    public RectangleAdapter(double width, double height) {
        this.rectangle = new ExternalRectangle(width, height);
    }

    @Override
    public double getArea() {
    	//chamada da biblioteca que pode ser mudada por outra
        return rectangle.computeArea();
    }

}
