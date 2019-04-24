import java.util.Scanner;
 
public class sumarNumeros
{
    public static void main(String[] ARGS)
    {
        Scanner obtener = new Scanner(System.in);
        int cantidadNumeros,total,i,nuevoNumero;
 
        System.out.print("Ingrese la cantidad de numeros a sumar: ");
        cantidadNumeros = obtener.nextInt();
 
        total = 0;
 
        for(i = 1; i <= cantidadNumeros; i++)
        {
            System.out.print("Ingrese el numero (" + i + ") : ");
            nuevoNumero = obtener.nextInt();
 
            total = total + nuevoNumero;
        }
 
        System.out.print("La suma total es : " + total);
    }
}
