import java.util.Scanner;
public class Operaciones {
	private Scanner teclado;
	private int num1;
	private int num2;
	private int suma;
	private int resta;
	private int division;
	private int multiplicacion;
    public void inicializar() {
    	teclado=new Scanner(System.in);
    	System.out.print("Ingrese el primer numero:");
    	num1=teclado.nextint();
    	System.out.print("Ingrese el segundo numero:");
    	num2=teclado.nextint();

    	suma=num1+num2;
    	resta=num1+num2;
    	division=num1+num2;
    	multiplicacion=num1+num2;
    }
    public void imprimir(){
    	
    	
    	System.out.print("Los resultados son:");
    	System.out.println("Suma:"+suma);
    	System.out.println("Resta:"+resta);
    	System.out.println("Division:"+division);
    	System.out.println("Multiplicacion:"+multiplicacion);
    }

     
 }

 public static void main(String[]ar)
 {
 	Operaciones.imprimir();
 }