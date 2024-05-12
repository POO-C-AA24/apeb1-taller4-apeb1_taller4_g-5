
import java.util.Scanner;

public class test_Xproductos {
    public static void main(String[] args) {
        int i, cant;
        double valor;
        String opc = "s";
        Scanner t = new Scanner(System.in);
        System.out.println("Cuantos productos desea ingresar?");
        i = t.nextInt();
        Xproductos factura[] = new Xproductos[i];
        int cont = 0;
        while ((opc.endsWith("s")) && (cont < i)) {
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese el valor del producto y la cantidad:");
            factura[cont] = new Xproductos(t.nextDouble(), t.nextInt());
            factura[cont].calcularDescuento();
            factura[cont].calcularPrecioFinal();
            System.out.println("Desea ingresar mas productos? (s/n)");
            opc = t.next();
            cont++;
            System.out.println("----------------------------------------------\n");
        }
        
        double precioTotal = 0;
        
        for (int j = 0; j < cont; j++) {
            factura[j].toString(); 
            precioTotal += factura[j].precioTotal(); 
            
        }
        
        System.out.println("Precio total de todos los productos: " + precioTotal);
    }
}