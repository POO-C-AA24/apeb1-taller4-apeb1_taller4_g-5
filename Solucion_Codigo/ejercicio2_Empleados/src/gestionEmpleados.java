

import java.util.Scanner;


public class gestionEmpleados {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_EMPLEADOS = 100; // Tamaño máximo de empleados
        Empleado[] listaEmpleados = new Empleado[MAX_EMPLEADOS];
        int numEmpleados = 0;

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    if (numEmpleados < MAX_EMPLEADOS) {
                        System.out.println("\nAgregar un empleado:");
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        listaEmpleados[numEmpleados++] = new Empleado(nombre, salario, edad);
                    } else {
                        System.out.println("No se pueden agregar más empleados. La lista está llena.");
                    }
                    break;
                case 2:
                    System.out.println("\nInformación de los empleados:");
                    for (int i = 0; i < numEmpleados; i++) {
                        listaEmpleados[i].mostrarInformacion();
                    }
                    break;
                case 3:
                    System.out.println("\nCalcular aumento de salario:");
                    System.out.print("Ingrese el porcentaje de aumento salarial: ");
                    double porcentajeAumento = scanner.nextDouble();
                    double sumaSalarios = 0;
                    for (int i = 0; i < numEmpleados; i++) {
                        sumaSalarios += listaEmpleados[i].getSalario();
                    }
                    double salarioPromedio = sumaSalarios / numEmpleados;
                    for (int i = 0; i < numEmpleados; i++) {
                        if (listaEmpleados[i].getSalario() < salarioPromedio) {
                            double aumento = listaEmpleados[i].getSalario() * porcentajeAumento / 100;
                            listaEmpleados[i].aumentarSalario(aumento);
                            System.out.println("El salario de " + listaEmpleados[i].getNombre() + " ha aumentado a " + listaEmpleados[i].getSalario());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
    
}
