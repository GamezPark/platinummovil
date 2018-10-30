package upch.movil.platinum.platinummovilupch.entidades;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlanEstudios {
    @SerializedName("idplan")
    @Expose
    private String idplan;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("clave")
    @Expose
    private String clave;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("creditos")
    @Expose
    private String creditos;
    @SerializedName("fechaAlta")
    @Expose
    private String fechaAlta;
    @SerializedName("fechaBaja")
    @Expose
    private String fechaBaja;
    @SerializedName("observaciones")
    @Expose
    private String observaciones;
    @SerializedName("periodos")
    @Expose
    private String periodos;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("objetivo")
    @Expose
    private String objetivo;
    @SerializedName("numeroPeriodo")
    @Expose
    private String numeroPeriodo;
    @SerializedName("materia")
    @Expose
    private String materia;

    public String getIdplan() {
        return idplan;
    }

    public void setIdplan(String idplan) {
        this.idplan = idplan;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPeriodos() {
        return periodos;
    }

    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getNumeroPeriodo() {
        return numeroPeriodo;
    }

    public void setNumeroPeriodo(String numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}