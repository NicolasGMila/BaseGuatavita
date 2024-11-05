package baseguatavita;

import java.math.BigDecimal;
import java.util.Date;

public class REG2 {
    private int numid;
    private String cedula_catastral;
    private String matricula_inmobiliaria;
    private BigDecimal aterreno;
    private BigDecimal aconstruida;
    private Date vigencia;
    private String z_fis1;
    private String z_fis2;
    private String z_econ1;
    private String z_econ2;
    private int habitaciones1;
    private int habitaciones2;
    private int habitaciones3;
    private int banos1;
    private int banos2;
    private int banos3;
    private int locales1;
    private int locales2;
    private int locales3;
    private int pisos1;
    private int pisos2;
    private int pisos3;
    private int estrato1;
    private int estrato2;
    private int estrato3;
    private String destino1;
    private String destino2;
    private String destino3;
    private BigDecimal puntaje1;
    private BigDecimal puntaje2;
    private BigDecimal puntaje3;

    // Constructor vacío
    public REG2() {
    }

    // Constructor con parámetros
    public REG2(int numid, String cedula_catastral, String matricula_inmobiliaria, BigDecimal aterreno, BigDecimal aconstruida, 
                Date vigencia, String z_fis1, String z_fis2, String z_econ1, String z_econ2,
                int habitaciones1, int habitaciones2, int habitaciones3,
                int banos1, int banos2, int banos3,
                int locales1, int locales2, int locales3,
                int pisos1, int pisos2, int pisos3,
                int estrato1, int estrato2, int estrato3,
                String destino1, String destino2, String destino3,
                BigDecimal puntaje1, BigDecimal puntaje2, BigDecimal puntaje3) {
        this.numid = numid;
        this.cedula_catastral = cedula_catastral;
        this.matricula_inmobiliaria = matricula_inmobiliaria;
        this.aterreno = aterreno;
        this.aconstruida = aconstruida;
        this.vigencia = vigencia;
        this.z_fis1 = z_fis1;
        this.z_fis2 = z_fis2;
        this.z_econ1 = z_econ1;
        this.z_econ2 = z_econ2;
        this.habitaciones1 = habitaciones1;
        this.habitaciones2 = habitaciones2;
        this.habitaciones3 = habitaciones3;
        this.banos1 = banos1;
        this.banos2 = banos2;
        this.banos3 = banos3;
        this.locales1 = locales1;
        this.locales2 = locales2;
        this.locales3 = locales3;
        this.pisos1 = pisos1;
        this.pisos2 = pisos2;
        this.pisos3 = pisos3;
        this.estrato1 = estrato1;
        this.estrato2 = estrato2;
        this.estrato3 = estrato3;
        this.destino1 = destino1;
        this.destino2 = destino2;
        this.destino3 = destino3;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.puntaje3 = puntaje3;
    }

    // Getters y setters para todos los atributos
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

    public String getMatricula_inmobiliaria() {
        return matricula_inmobiliaria;
    }

    public void setMatricula_inmobiliaria(String matricula_inmobiliaria) {
        this.matricula_inmobiliaria = matricula_inmobiliaria;
    }

    public BigDecimal getAterreno() {
        return aterreno;
    }

    public void setAterreno(BigDecimal aterreno) {
        this.aterreno = aterreno;
    }

    public BigDecimal getAconstruida() {
        return aconstruida;
    }

    public void setAconstruida(BigDecimal aconstruida) {
        this.aconstruida = aconstruida;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getZ_fis1() {
        return z_fis1;
    }

    public void setZ_fis1(String z_fis1) {
        this.z_fis1 = z_fis1;
    }

    public String getZ_fis2() {
        return z_fis2;
    }

    public void setZ_fis2(String z_fis2) {
        this.z_fis2 = z_fis2;
    }

    public String getZ_econ1() {
        return z_econ1;
    }

    public void setZ_econ1(String z_econ1) {
        this.z_econ1 = z_econ1;
    }

    public String getZ_econ2() {
        return z_econ2;
    }

    public void setZ_econ2(String z_econ2) {
        this.z_econ2 = z_econ2;
    }

    public int getHabitaciones1() {
        return habitaciones1;
    }

    public void setHabitaciones1(int habitaciones1) {
        this.habitaciones1 = habitaciones1;
    }

    public int getHabitaciones2() {
        return habitaciones2;
    }

    public void setHabitaciones2(int habitaciones2) {
        this.habitaciones2 = habitaciones2;
    }

    public int getHabitaciones3() {
        return habitaciones3;
    }

    public void setHabitaciones3(int habitaciones3) {
        this.habitaciones3 = habitaciones3;
    }

    public int getBanos1() {
        return banos1;
    }

    public void setBanos1(int banos1) {
        this.banos1 = banos1;
    }

    public int getBanos2() {
        return banos2;
    }

    public void setBanos2(int banos2) {
        this.banos2 = banos2;
    }

    public int getBanos3() {
        return banos3;
    }

    public void setBanos3(int banos3) {
        this.banos3 = banos3;
    }

    public int getLocales1() {
        return locales1;
    }

    public void setLocales1(int locales1) {
        this.locales1 = locales1;
    }

    public int getLocales2() {
        return locales2;
    }

    public void setLocales2(int locales2) {
        this.locales2 = locales2;
    }

    public int getLocales3() {
        return locales3;
    }

    public void setLocales3(int locales3) {
        this.locales3 = locales3;
    }

    public int getPisos1() {
        return pisos1;
    }

    public void setPisos1(int pisos1) {
        this.pisos1 = pisos1;
    }

    public int getPisos2() {
        return pisos2;
    }

    public void setPisos2(int pisos2) {
        this.pisos2 = pisos2;
    }

    public int getPisos3() {
        return pisos3;
    }

    public void setPisos3(int pisos3) {
        this.pisos3 = pisos3;
    }

    public int getEstrato1() {
        return estrato1;
    }

    public void setEstrato1(int estrato1) {
        this.estrato1 = estrato1;
    }

    public int getEstrato2() {
        return estrato2;
    }

    public void setEstrato2(int estrato2) {
        this.estrato2 = estrato2;
    }

    public int getEstrato3() {
        return estrato3;
    }

    public void setEstrato3(int estrato3) {
        this.estrato3 = estrato3;
    }

    public String getDestino1() {
        return destino1;
    }

    public void setDestino1(String destino1) {
        this.destino1 = destino1;
    }

    public String getDestino2() {
        return destino2;
    }

    public void setDestino2(String destino2) {
        this.destino2 = destino2;
    }

    public String getDestino3() {
        return destino3;
    }

    public void setDestino3(String destino3) {
        this.destino3 = destino3;
    }

    public BigDecimal getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(BigDecimal puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public BigDecimal getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(BigDecimal puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public BigDecimal getPuntaje3() {
        return puntaje3;
    }

    public void setPuntaje3(BigDecimal puntaje3) {
        this.puntaje3 = puntaje3;
    }
}

