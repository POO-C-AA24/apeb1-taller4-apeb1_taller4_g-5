class Xproductos {

    public int cantidad;
    public double precio;
    public double total;
    public double precioTotal;

    public Xproductos(double precio, int cantidad) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularDescuento() {
        if (this.precio >= 1000 && this.cantidad >= 10) {
            this.precio = this.precio - this.precio * 0.1;
        } else {
            this.precio = this.precio - this.precio * 0.05;
        }
        return this.precio;
    }

    public double calcularPrecioFinal() {
        this.total = this.cantidad * this.precio;
        return this.total;
    }
    
    public double precioTotal(){
        return this.total; // Devolver el precio total de un solo producto
    }

    @Override
    public String toString() {
        System.out.println("Xproductos{" + "cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}');
        return null;
    }
}