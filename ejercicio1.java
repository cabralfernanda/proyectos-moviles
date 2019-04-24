package Calculador;
import java.util.*;
public class Ingreso {
	public static void main(String[] args) {
		//declaracion de Variables 
		float a, c;
		int b;
		//Ingreso de datos
		Scanner A=new Scanner(System.in);
		Scanner B=new Scanner(System.in);
		Scanner C=new Scanner(System.in);
		System.out.println("Ingrese el precio del producto por unidad: ");
		a=A.nextFloat();
		System.out.println("Ingrese la cantidad de productos que lleva: ");
		b=B.nextInt();
		c=a*b;
		System.out.println("Uste debe abonar: $"+c);
	}

}