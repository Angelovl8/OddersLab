package tesla;
public class Cliente {
    
    private int cod_cliente;
    private String nif;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    private int cp;

    public Cliente(int cod_cliente, String nif, String nombre, String apellidos, int telefono, String direccion, int cp) {
        this.cod_cliente = cod_cliente;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cp = cp;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + ", nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", cp=" + cp + '}';
    }
    
    
    
}
