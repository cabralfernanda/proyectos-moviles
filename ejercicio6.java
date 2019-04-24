public class Empleado {
    private Scanner teclado;
    private String nombre;
    private int sueldo;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese su sueldo : ");
        sueldo = teclado.nextInt();
    }
    public void imprimeDatos(){
        System.out.println("Nombre de empleado: " +nombre);
        System.out.println("Sueldo de empleado: " +sueldo);
    }
    public void imprimeImpuesto(){
        if(sueldo>3000)
            System.out.println("Debe pagar impuesto");
        else
            System.out.println("No debe pagar impuesto");
    }
    public static void main (String args[]){     
        Empleado empleado1 = new Empleado();
        empleado1.inicializar();
        empleado1.imprimeDatos();
        empleado1.imprimeImpuesto();
    }  
}