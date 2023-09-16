package tesla;

import java.time.LocalDate;

public class Revision {

    private int cod_interno;
    private String cambio_filtro;
    private String cambio_aceite;
    private String cambio_frenos;
    private String cambio_otros;
    private LocalDate fecha_revision;
    private String matricula;

    public Revision(int cod_interno, String cambio_filtro, String cambio_aceite, String cambio_frenos, String cambio_otros, LocalDate fecha_revision, String matricula) {
        this.cod_interno = cod_interno;
        this.cambio_filtro = cambio_filtro;
        this.cambio_aceite = cambio_aceite;
        this.cambio_frenos = cambio_frenos;
        this.cambio_otros = cambio_otros;
        this.fecha_revision = fecha_revision;
        this.matricula = matricula;
    }

    public int getCod_interno() {
        return cod_interno;
    }

    public void setCod_interno(int cod_interno) {
        this.cod_interno = cod_interno;
    }

    public String getCambio_filtro() {
        return cambio_filtro;
    }

    public void setCambio_filtro(String cambio_filtro) {
        this.cambio_filtro = cambio_filtro;
    }

    public String getCambio_aceite() {
        return cambio_aceite;
    }

    public void setCambio_aceite(String cambio_aceite) {
        this.cambio_aceite = cambio_aceite;
    }

    public String getCambio_frenos() {
        return cambio_frenos;
    }

    public void setCambio_frenos(String cambio_frenos) {
        this.cambio_frenos = cambio_frenos;
    }

    public String getCambio_otros() {
        return cambio_otros;
    }

    public void setCambio_otros(String cambio_otros) {
        this.cambio_otros = cambio_otros;
    }

    public LocalDate getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(LocalDate fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Revision{" + "cod_interno=" + cod_interno + ", cambio_filtro=" + cambio_filtro + ", cambio_aceite=" + cambio_aceite + ", cambio_frenos=" + cambio_frenos + ", cambio_otros=" + cambio_otros + ", fecha_revision=" + fecha_revision + ", matricula=" + matricula + '}';
    }

}
