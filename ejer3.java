import java.util.Scanner;
public class Empleado {
	private Scanner teclado;
    private int horas;
    private int sueldo;
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas en el mes:");
        horas=teclado.nextint();

        sueldo=horas*400;
    }

    public void imprimir(){
        System.out.print("Su sueldo a cobrar es:"+sueldo);
    
    }
    }
    public static void main(String[]ar)
 {
    Empleado.imprimir();
 }
     