import java.util.Scanner;
public class Persona {
	private Scanner teclado;
	private float nota1;
	private float nota2;
    private float nota3;
    private float promedio;
    private String alumno;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Nombre del alumno:");
        alumno=teclado.nextString();
        System.out.print("Escriba la 1er nota:");
        nota1=teclado.nextfloat();
        System.out.print("Escriba la 2da nota:");
        nota2=teclado.nextfloat();
        System.out.print("Escriba la 3er nota:");
        nota3=teclado.nextfloat();

        promedio=(nota1+nota3+nota3)/3;
    }

    public void imprimir(){
        System.out.print("Nombre del alumno:"+alumno);
        System.out.print("Su promedio es:"+promedio);
        
    }
    }
    public static void main(String[]ar)
 {
    Persona.imprimir();
 }
     