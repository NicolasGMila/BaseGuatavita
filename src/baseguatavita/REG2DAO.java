package baseguatavita;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class REG2DAO {
    BaseGuatavita cn = new BaseGuatavita();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarREG2(REG2 cl) {
        String sql = "INSERT INTO guatavita_reg2 (numid, cedula_catastral, matricula_inmobiliaria, aterreno, aconstruida, vigencia, z_fis1, z_fis2, z_econ1, z_econ2, "
                   + "habitaciones1, habitaciones2, habitaciones3, banos1, banos2, banos3, locales1, locales2, locales3, pisos1, pisos2, pisos3, "
                   + "estrato1, estrato2, estrato3, destino1, destino2, destino3, puntaje1, puntaje2, puntaje3) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getNumid());
            ps.setString(2, cl.getCedula_catastral());
            ps.setString(3, cl.getMatricula_inmobiliaria());
            ps.setBigDecimal(4, cl.getAterreno());
            ps.setBigDecimal(5, cl.getAconstruida());
            ps.setDate(6, new Date(cl.getVigencia().getTime())); // Convierte Date a java.sql.Date
            ps.setString(7, cl.getZ_fis1());
            ps.setString(8, cl.getZ_fis2());
            ps.setString(9, cl.getZ_econ1());
            ps.setString(10, cl.getZ_econ2());
            ps.setInt(11, cl.getHabitaciones1());
            ps.setInt(12, cl.getHabitaciones2());
            ps.setInt(13, cl.getHabitaciones3());
            ps.setInt(14, cl.getBanos1());
            ps.setInt(15, cl.getBanos2());
            ps.setInt(16, cl.getBanos3());
            ps.setInt(17, cl.getLocales1());
            ps.setInt(18, cl.getLocales2());
            ps.setInt(19, cl.getLocales3());
            ps.setInt(20, cl.getPisos1());
            ps.setInt(21, cl.getPisos2());
            ps.setInt(22, cl.getPisos3());
            ps.setInt(23, cl.getEstrato1());
            ps.setInt(24, cl.getEstrato2());
            ps.setInt(25, cl.getEstrato3());
            ps.setString(26, cl.getDestino1());
            ps.setString(27, cl.getDestino2());
            ps.setString(28, cl.getDestino3());
            ps.setBigDecimal(29, cl.getPuntaje1());
            ps.setBigDecimal(30, cl.getPuntaje2());
            ps.setBigDecimal(31, cl.getPuntaje3());
            ps.execute();
            return true;      

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public REG2 obtenerRegistroPorCedula(int num_id) {
        REG2 registro = null;
        String sql = "SELECT * FROM guatavita_reg2 WHERE numid = ?"; // Consulta SQL

        try {
            con = cn.getConnection(); // Obtiene la conexión
            ps = con.prepareStatement(sql); // Prepara la consulta
            ps.setInt(1, num_id); // Establece el valor de la cédula

            ResultSet rs = ps.executeQuery(); // Ejecuta la consulta
            if (rs.next()) { // Si hay resultados
                registro = new REG2(); // Crea un nuevo objeto REG2
                
                registro.setNumid(rs.getInt("numid"));
                registro.setCedula_catastral(rs.getString("cedula_catastral"));
                registro.setMatricula_inmobiliaria(rs.getString("matricula_inmobiliaria"));
                registro.setAterreno(rs.getBigDecimal("aterreno"));
                registro.setAconstruida(rs.getBigDecimal("aconstruida"));
                registro.setVigencia(rs.getDate("vigencia")); // Asumiendo que la vigencia es un tipo DATE
                registro.setZ_fis1(rs.getString("z_fis1"));
                registro.setZ_fis2(rs.getString("z_fis2"));
                registro.setZ_econ1(rs.getString("z_econ1"));
                registro.setZ_econ2(rs.getString("z_econ2"));
                registro.setHabitaciones1(rs.getInt("habitaciones1"));
                registro.setHabitaciones2(rs.getInt("habitaciones2"));
                registro.setHabitaciones3(rs.getInt("habitaciones3"));
                registro.setBanos1(rs.getInt("banos1"));
                registro.setBanos2(rs.getInt("banos2"));
                registro.setBanos3(rs.getInt("banos3"));
                registro.setLocales1(rs.getInt("locales1"));
                registro.setLocales2(rs.getInt("locales2"));
                registro.setLocales3(rs.getInt("locales3"));
                registro.setPisos1(rs.getInt("pisos1"));
                registro.setPisos2(rs.getInt("pisos2"));
                registro.setPisos3(rs.getInt("pisos3"));
                registro.setEstrato1(rs.getInt("estrato1"));
                registro.setEstrato2(rs.getInt("estrato2"));
                registro.setEstrato3(rs.getInt("estrato3"));
                registro.setDestino1(rs.getString("destino1"));
                registro.setDestino2(rs.getString("destino2"));
                registro.setDestino3(rs.getString("destino3"));
                registro.setPuntaje1(rs.getBigDecimal("puntaje1"));
                registro.setPuntaje2(rs.getBigDecimal("puntaje2"));
                registro.setPuntaje3(rs.getBigDecimal("puntaje3"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                if (rs != null) rs.close(); // Cierra el ResultSet si está abierto
                if (ps != null) ps.close(); // Cierra el PreparedStatement si está abierto
                if (con != null) con.close(); // Cierra la conexión si está abierta
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

        return registro; // Retorna el objeto REG2 encontrado o null si no se encontró
    }

    public boolean EliminarREG2(int numid) {
        String sql = "DELETE FROM guatavita_reg2 WHERE numid = ?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, numid); // Establece el valor del num_id
            int rowsAffected = ps.executeUpdate(); // Ejecuta la actualización
            return rowsAffected > 0; // Retorna true si se eliminó al menos un registro
        } catch (SQLException e) { 
            // Imprime el error en la consola
            JOptionPane.showMessageDialog(null, e.toString());
            return false; // Retorna false si ocurrió un error
        } finally {
            try {
                if (ps != null) ps.close(); // Cierra PreparedStatement
                if (con != null) con.close(); // Cierra la conexión
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public boolean ActualizarREG2(REG2 cl) {
        String sql = "UPDATE guatavita_reg2 SET cedula_catastral = ?, matricula_inmobiliaria = ?, aterreno = ?, aconstruida = ?, vigencia = ?, "
                   + "z_fis1 = ?, z_fis2 = ?, z_econ1 = ?, z_econ2 = ?, habitaciones1 = ?, habitaciones2 = ?, habitaciones3 = ?, "
                   + "banos1 = ?, banos2 = ?, banos3 = ?, locales1 = ?, locales2 = ?, locales3 = ?, pisos1 = ?, pisos2 = ?, pisos3 = ?, "
                   + "estrato1 = ?, estrato2 = ?, estrato3 = ?, destino1 = ?, destino2 = ?, destino3 = ?, puntaje1 = ?, puntaje2 = ?, puntaje3 = ? "
                   + "WHERE numid = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCedula_catastral());
            ps.setString(2, cl.getMatricula_inmobiliaria());
            ps.setBigDecimal(3, cl.getAterreno());
            ps.setBigDecimal(4, cl.getAconstruida());
            ps.setDate(5, new Date(cl.getVigencia().getTime())); // Convierte Date a java.sql.Date
            ps.setString(6, cl.getZ_fis1());
            ps.setString(7, cl.getZ_fis2());
            ps.setString(8, cl.getZ_econ1());
            ps.setString(9, cl.getZ_econ2());
            ps.setInt(10, cl.getHabitaciones1());
            ps.setInt(11, cl.getHabitaciones2());
            ps.setInt(12, cl.getHabitaciones3());
            ps.setInt(13, cl.getBanos1());
            ps.setInt(14, cl.getBanos2());
            ps.setInt(15, cl.getBanos3());
            ps.setInt(16, cl.getLocales1());
            ps.setInt(17, cl.getLocales2());
            ps.setInt(18, cl.getLocales3());
            ps.setInt(19, cl.getPisos1());
            ps.setInt(20, cl.getPisos2());
            ps.setInt(21, cl.getPisos3());
            ps.setInt(22, cl.getEstrato1());
            ps.setInt(23, cl.getEstrato2());
            ps.setInt(24, cl.getEstrato3());
            ps.setString(25, cl.getDestino1());
            ps.setString(26, cl.getDestino2());
            ps.setString(27, cl.getDestino3());
            ps.setBigDecimal(28, cl.getPuntaje1());
            ps.setBigDecimal(29, cl.getPuntaje2());
            ps.setBigDecimal(30, cl.getPuntaje3());
            ps.setInt(31, cl.getNumid()); // Establece el numid al final
            ps.executeUpdate(); // Cambiar a executeUpdate para actualizar
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cierra el PreparedStatement
                }
                if (con != null) {
                    con.close(); // Cierra la conexión
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}

