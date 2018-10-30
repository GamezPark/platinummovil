package upch.movil.platinum.platinummovilupch.entidades;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alumno {
    @SerializedName("cuatrimestre")
    @Expose
    private Object cuatrimestre;
    @SerializedName("tutor")
    @Expose
    private Object tutor;
    @SerializedName("no_seguro")
    @Expose
    private Object noSeguro;
    @SerializedName("tutorAsignado")
    @Expose
    private Object tutorAsignado;
    @SerializedName("planID")
    @Expose
    private Object planID;
    @SerializedName("matricula")
    @Expose
    private String matricula;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("sexo")
    @Expose
    private Object sexo;
    @SerializedName("carrera")
    @Expose
    private Object carrera;
    @SerializedName("plan")
    @Expose
    private Object plan;
    @SerializedName("estatus")
    @Expose
    private String estatus;
    @SerializedName("periodo")
    @Expose
    private Object periodo;
    @SerializedName("ultimoperiodo")
    @Expose
    private Object ultimoperiodo;
    @SerializedName("grupo")
    @Expose
    private Object grupo;
    @SerializedName("c1")
    @Expose
    private Object c1;
    @SerializedName("c2")
    @Expose
    private Object c2;
    @SerializedName("c3")
    @Expose
    private Object c3;
    @SerializedName("r1")
    @Expose
    private Object r1;
    @SerializedName("r2")
    @Expose
    private Object r2;
    @SerializedName("r3")
    @Expose
    private Object r3;
    @SerializedName("extra")
    @Expose
    private Object extra;
    @SerializedName("final")
    @Expose
    private Object _final;
    @SerializedName("fechaNacimiento")
    @Expose
    private Object fechaNacimiento;
    @SerializedName("lugarNacimiento")
    @Expose
    private Object lugarNacimiento;
    @SerializedName("edad")
    @Expose
    private Object edad;
    @SerializedName("nacionalidad")
    @Expose
    private Object nacionalidad;
    @SerializedName("lenguaMaterna")
    @Expose
    private Object lenguaMaterna;
    @SerializedName("curp")
    @Expose
    private Object curp;
    @SerializedName("tipoSangre")
    @Expose
    private Object tipoSangre;
    @SerializedName("estadoCivil")
    @Expose
    private Object estadoCivil;
    @SerializedName("hijos")
    @Expose
    private Object hijos;
    @SerializedName("capacidadesDiferentes")
    @Expose
    private Object capacidadesDiferentes;
    @SerializedName("telefono")
    @Expose
    private Object telefono;
    @SerializedName("correoElectronico")
    @Expose
    private Object correoElectronico;
    @SerializedName("celular")
    @Expose
    private Object celular;
    @SerializedName("estado")
    @Expose
    private Object estado;
    @SerializedName("municipio")
    @Expose
    private Object municipio;
    @SerializedName("localidad")
    @Expose
    private Object localidad;
    @SerializedName("direccion")
    @Expose
    private Object direccion;
    @SerializedName("colonia")
    @Expose
    private Object colonia;
    @SerializedName("codigoPostal")
    @Expose
    private Object codigoPostal;
    @SerializedName("estadobachi")
    @Expose
    private Object estadobachi;
    @SerializedName("municipiobachi")
    @Expose
    private Object municipiobachi;
    @SerializedName("periodoEgreso")
    @Expose
    private Object periodoEgreso;
    @SerializedName("bachillerato")
    @Expose
    private Object bachillerato;
    @SerializedName("perfil")
    @Expose
    private Object perfil;
    @SerializedName("promedio")
    @Expose
    private Object promedio;
    @SerializedName("nombreTutor")
    @Expose
    private Object nombreTutor;
    @SerializedName("sexoTutor")
    @Expose
    private Object sexoTutor;
    @SerializedName("estadoCivilTutor")
    @Expose
    private Object estadoCivilTutor;
    @SerializedName("nacionalidadTutor")
    @Expose
    private Object nacionalidadTutor;
    @SerializedName("fechaNacimientoTutor")
    @Expose
    private Object fechaNacimientoTutor;
    @SerializedName("lugarNacimientoTutor")
    @Expose
    private Object lugarNacimientoTutor;
    @SerializedName("telefonoTutor")
    @Expose
    private Object telefonoTutor;
    @SerializedName("parentesco")
    @Expose
    private Object parentesco;
    @SerializedName("fechaInicio")
    @Expose
    private Object fechaInicio;

    public Object getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Object cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Object getTutor() {
        return tutor;
    }

    public void setTutor(Object tutor) {
        this.tutor = tutor;
    }

    public Object getNoSeguro() {
        return noSeguro;
    }

    public void setNoSeguro(Object noSeguro) {
        this.noSeguro = noSeguro;
    }

    public Object getTutorAsignado() {
        return tutorAsignado;
    }

    public void setTutorAsignado(Object tutorAsignado) {
        this.tutorAsignado = tutorAsignado;
    }

    public Object getPlanID() {
        return planID;
    }

    public void setPlanID(Object planID) {
        this.planID = planID;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getSexo() {
        return sexo;
    }

    public void setSexo(Object sexo) {
        this.sexo = sexo;
    }

    public Object getCarrera() {
        return carrera;
    }

    public void setCarrera(Object carrera) {
        this.carrera = carrera;
    }

    public Object getPlan() {
        return plan;
    }

    public void setPlan(Object plan) {
        this.plan = plan;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Object getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Object periodo) {
        this.periodo = periodo;
    }

    public Object getUltimoperiodo() {
        return ultimoperiodo;
    }

    public void setUltimoperiodo(Object ultimoperiodo) {
        this.ultimoperiodo = ultimoperiodo;
    }

    public Object getGrupo() {
        return grupo;
    }

    public void setGrupo(Object grupo) {
        this.grupo = grupo;
    }

    public Object getC1() {
        return c1;
    }

    public void setC1(Object c1) {
        this.c1 = c1;
    }

    public Object getC2() {
        return c2;
    }

    public void setC2(Object c2) {
        this.c2 = c2;
    }

    public Object getC3() {
        return c3;
    }

    public void setC3(Object c3) {
        this.c3 = c3;
    }

    public Object getR1() {
        return r1;
    }

    public void setR1(Object r1) {
        this.r1 = r1;
    }

    public Object getR2() {
        return r2;
    }

    public void setR2(Object r2) {
        this.r2 = r2;
    }

    public Object getR3() {
        return r3;
    }

    public void setR3(Object r3) {
        this.r3 = r3;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Object getFinal() {
        return _final;
    }

    public void setFinal(Object _final) {
        this._final = _final;
    }

    public Object getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Object fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Object getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(Object lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Object getEdad() {
        return edad;
    }

    public void setEdad(Object edad) {
        this.edad = edad;
    }

    public Object getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Object nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Object getLenguaMaterna() {
        return lenguaMaterna;
    }

    public void setLenguaMaterna(Object lenguaMaterna) {
        this.lenguaMaterna = lenguaMaterna;
    }

    public Object getCurp() {
        return curp;
    }

    public void setCurp(Object curp) {
        this.curp = curp;
    }

    public Object getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(Object tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Object getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Object estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Object getHijos() {
        return hijos;
    }

    public void setHijos(Object hijos) {
        this.hijos = hijos;
    }

    public Object getCapacidadesDiferentes() {
        return capacidadesDiferentes;
    }

    public void setCapacidadesDiferentes(Object capacidadesDiferentes) {
        this.capacidadesDiferentes = capacidadesDiferentes;
    }

    public Object getTelefono() {
        return telefono;
    }

    public void setTelefono(Object telefono) {
        this.telefono = telefono;
    }

    public Object getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(Object correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Object getCelular() {
        return celular;
    }

    public void setCelular(Object celular) {
        this.celular = celular;
    }

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    public Object getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Object municipio) {
        this.municipio = municipio;
    }

    public Object getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Object localidad) {
        this.localidad = localidad;
    }

    public Object getDireccion() {
        return direccion;
    }

    public void setDireccion(Object direccion) {
        this.direccion = direccion;
    }

    public Object getColonia() {
        return colonia;
    }

    public void setColonia(Object colonia) {
        this.colonia = colonia;
    }

    public Object getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Object codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Object getEstadobachi() {
        return estadobachi;
    }

    public void setEstadobachi(Object estadobachi) {
        this.estadobachi = estadobachi;
    }

    public Object getMunicipiobachi() {
        return municipiobachi;
    }

    public void setMunicipiobachi(Object municipiobachi) {
        this.municipiobachi = municipiobachi;
    }

    public Object getPeriodoEgreso() {
        return periodoEgreso;
    }

    public void setPeriodoEgreso(Object periodoEgreso) {
        this.periodoEgreso = periodoEgreso;
    }

    public Object getBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(Object bachillerato) {
        this.bachillerato = bachillerato;
    }

    public Object getPerfil() {
        return perfil;
    }

    public void setPerfil(Object perfil) {
        this.perfil = perfil;
    }

    public Object getPromedio() {
        return promedio;
    }

    public void setPromedio(Object promedio) {
        this.promedio = promedio;
    }

    public Object getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(Object nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public Object getSexoTutor() {
        return sexoTutor;
    }

    public void setSexoTutor(Object sexoTutor) {
        this.sexoTutor = sexoTutor;
    }

    public Object getEstadoCivilTutor() {
        return estadoCivilTutor;
    }

    public void setEstadoCivilTutor(Object estadoCivilTutor) {
        this.estadoCivilTutor = estadoCivilTutor;
    }

    public Object getNacionalidadTutor() {
        return nacionalidadTutor;
    }

    public void setNacionalidadTutor(Object nacionalidadTutor) {
        this.nacionalidadTutor = nacionalidadTutor;
    }

    public Object getFechaNacimientoTutor() {
        return fechaNacimientoTutor;
    }

    public void setFechaNacimientoTutor(Object fechaNacimientoTutor) {
        this.fechaNacimientoTutor = fechaNacimientoTutor;
    }

    public Object getLugarNacimientoTutor() {
        return lugarNacimientoTutor;
    }

    public void setLugarNacimientoTutor(Object lugarNacimientoTutor) {
        this.lugarNacimientoTutor = lugarNacimientoTutor;
    }

    public Object getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(Object telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public Object getParentesco() {
        return parentesco;
    }

    public void setParentesco(Object parentesco) {
        this.parentesco = parentesco;
    }

    public Object getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Object fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}

