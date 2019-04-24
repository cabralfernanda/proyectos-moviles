package Numeross;
import java.util.*;
public class Par {
	public static void main(String[] args) {
		
		int a;
		Scanner A=new Scanner(System.in);
		System.out.println("Pares o Impares");
		for ( a= 0; a <=10; a ++){
		System.out.println("**********");
		System.out.println("Ingrese un numero:");
		a=A.nextInt();
		if (a%2== 0) 
		{
					System.out.println("Su numero es par.");
		}
		else
		{
					System.out.println("Su numero es impar.");
		}
		}
		}
}

