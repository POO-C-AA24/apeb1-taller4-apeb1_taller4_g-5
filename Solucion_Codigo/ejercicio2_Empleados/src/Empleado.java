
class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double aumento) {
        this.salario += aumento;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario + ", Edad: " + edad);
    }
}