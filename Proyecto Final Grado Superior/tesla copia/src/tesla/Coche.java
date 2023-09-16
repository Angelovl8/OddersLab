package tesla;
public class Coche {
    
    private String matricula;
    private String color;
    private String modelo;
    private String marca;
    private double precio;

    public Coche(String matricula, String color, String modelo, String marca, double precio, int cod_cliente) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }
}

    