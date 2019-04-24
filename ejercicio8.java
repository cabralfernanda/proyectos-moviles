import java.util.Scanner;
public class Persona {
private Scanner teclado;
private String nombre;
private int edad;
public void inicializar() {
teclado=new Scanner(System.in);
System.out.print("Ingrese nombre:");
nombre=teclado.next();
System.out.print("Ingrese edad:");
edad=teclado.nextInt();
}
public void imprimir()
{
System.out.println("Nombre:"+nombre);
System.out.println("Edad:"+edad);
}
}
public static void main(String[] ar) {
Persona persona1;
persona1=new Persona();
persona1.inicializar();
persona1.imprimir();
}
public class Operacion {
protected Scanner teclado;
protected int valor1;
protected int valor2;
protected int resultado;
public Operacion() {
teclado=new Scanner(System.in);
}
public void cargar1() {
System.out.print("Ingrese el primer valor:");
valor1=teclado.nextInt();
}
public void cargar2() {
System.out.print("Ingrese el segundo valor:");