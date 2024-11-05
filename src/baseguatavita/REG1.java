package baseguatavita;
import java.math.BigDecimal;
import java.util.Date;

public class REG1 {
    private int numid;
    private String cedula_catastral;
    private int num_orden;
    private String nombre;
    private String tipo_doc;
    private int num_doc;
    private String direccion;
    private BigDecimal area_terreno;     
    private BigDecimal area_construida;   
    private BigDecimal avaluo;           
    private Date vigencia;

    public REG1() {
    }

    public REG1(int numid, String cedula_catastral, int num_orden, String nombre, String tipo_doc, String direccion, BigDecimal area_terreno, BigDecimal area_construida, BigDecimal avaluo, Date vigencia) {
        this.numid = numid;
        this.cedula_catastral = cedula_catastral;
        this.num_orden = num_orden;
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
        this.direccion = direccion;
        this.area_terreno = area_terreno;
        this.area_construida = area_construida;
        this.avaluo = avaluo;
        this.vigencia = vigencia;
    }

    public int getNumid() {
        return numid;
    }

    public void setNumid(int numid) {
        this.numid = numid;
    }

    public String getCedula_catastral() {
        return cedula_catastral;
    }

    public void setCedula_catastral(String cedula_catastral) {
        this.cedula_catastral = cedula_catastral;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigDecimal getArea_terreno() {
        return area_terreno;
    }

    public void setArea_terreno(BigDecimal area_terreno) {
        this.area_terreno = area_terreno;
    }

    public BigDecimal getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(BigDecimal area_construida) {
        this.area_construida = area_construida;
    }

    public BigDecimal getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(BigDecimal avaluo) {
        this.avaluo = avaluo;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public int getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(int num_doc) {
        this.num_doc = num_doc;
    }
    
    
}
