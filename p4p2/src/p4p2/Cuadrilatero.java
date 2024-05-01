package p4p2;
/*Escriba una jerarquía de herencia para las clases Cuadrilatero, 
Trapezoide, Paralelogramo, Rectangulo y Cuadrado. Use 
Cuadrilatero como la superclase de la jerarquía. Agregue todos los 
niveles que sea posible a la jerarquía.
Especifique las variables de instancia y los métodos para cada 
clase. Las variables de instancia private de Cuadrilatero
deben ser los pares de coordenadas x-y para los cuatro puntos fi 
nales del Cuadrilatero. Escriba un programa que cree instancias de 
objetos de sus clases, y que imprima el área de cada objeto 
(excepto Cuadrilatero)*/
public class Cuadrilatero {
	//Aca ya se escriben las variables que tiene
	double x1,y1,x2,y2;
	
	public Cuadrilatero(){
		x1=0;
		y1=0;
		x2=0;
		y2=0;
	}
	public void getAllCoordinates(double x1,double x2,double y1,double y2) {
		setX1(x1);
		setX2(x2);
		setY1(y1);
		setY2(y2);
	}
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}
	public double getY1() {
		return y1;
	}
	public double getY2() {
		return y2;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
}
