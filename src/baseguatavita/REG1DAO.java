package baseguatavita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class REG1DAO {
    BaseGuatavita cn = new BaseGuatavita();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarREG1(REG1 cl){
       String sql = "INSERT INTO guatavita_reg1 (numid, cedula_catastral, num_orden, nombre, tipo_doc, num_doc, direccion, area_terreno, area_construida, avaluo, vigencia) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = (Connection) cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getNumid());
            ps.setString(2, cl.getCedula_catastral());
            ps.setInt(3, cl.getNum_orden());
            ps.setString(4, cl.getNombre());
            ps.setString(5, cl.getTipo_doc());
            ps.setInt(6, cl.getNum_doc());
            ps.setString(7, cl.getDireccion());
            ps.setBigDecimal(8, cl.getArea_terreno());
            ps.setBigDecimal(9, cl.getArea_construida());
            ps.setBigDecimal(10, cl.getAvaluo());
            ps.setDate(11, (Date) cl.getVigencia());
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
public REG1 obtenerRegistroPorCedula(int num_id) {
        REG1 registro = null;
        String sql = "SELECT * FROM guatavita_reg1 WHERE numid = ?"; // Consulta SQL

        try {
            con = cn.getConnection(); // Obtiene la conexión
            ps = con.prepareStatement(sql); // Prepara la consulta
            ps.setInt(1, num_id); // Establece el valor de la cédula

            ResultSet rs = ps.executeQuery(); // Ejecuta la consulta
            if (rs.next()) { // Si hay resultados
                registro = new REG1(); // Crea un nuevo objeto REG1
                
                registro.setNumid(rs.getInt("numid"));
                registro.setCedula_catastral(rs.getString("cedula_catastral"));
                registro.setNum_orden(rs.getInt("num_orden"));
                registro.setNombre(rs.getString("nombre"));
                registro.setTipo_doc(rs.getString("tipo_doc"));
                registro.setNum_doc(rs.getInt("num_doc"));
                registro.setDireccion(rs.getString("direccion"));
                registro.setArea_terreno(rs.getBigDecimal("area_terreno"));
                registro.setArea_construida(rs.getBigDecimal("area_construida"));
                registro.setAvaluo(rs.getBigDecimal("avaluo"));
                registro.setVigencia(rs.getDate("vigencia")); // Asumiendo que la vigencia es un tipo DATE
            }
        } catch (SQLException e) {

            
        } finally {
            try {
                if (rs != null) rs.close(); // Cierra el ResultSet si está abierto
                if (ps != null) ps.close(); // Cierra el PreparedStatement si está abierto
                if (con != null) con.close(); // Cierra la conexión si está abierta
            } catch (SQLException e) {
            }
        }

        return registro; // Retorna el objeto REG1 encontrado o null si no se encontró
    }
public boolean EliminarREG1(int numid) {
    String sql = "DELETE FROM guatavita_reg1 WHERE numid = ?";


    try {
        con = (Connection) cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, numid); // Establece el valor del num_id
        int rowsAffected = ps.executeUpdate(); // Ejecuta la actualización
        return rowsAffected > 0; // Retorna true si se eliminó al menos un registro
    } catch (SQLException e) { // Imprime el error en la consola
        // Imprime el error en la consola
        return false; // Retorna false si ocurrió un error
    } finally {
        try {
            if (ps != null) ps.close(); // Cierra PreparedStatement
            if (con != null) con.close(); // Cierra la conexión
        } catch (SQLException e) {
            // Imprime el error en la consola si ocurre al cerrar
            
        }
    }
}


public boolean ActualizarREG1(REG1 cl) {
    String sql = "UPDATE guatavita_reg1 SET cedula_catastral = ?, num_orden = ?, nombre = ?, tipo_doc = ?, num_doc = ?, direccion = ?, area_terreno = ?, area_construida = ?, avaluo = ?, vigencia = ? WHERE numid = ?";
    try {
        con = (Connection) cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, cl.getCedula_catastral());
        ps.setInt(2, cl.getNum_orden());
        ps.setString(3, cl.getNombre());
        ps.setString(4, cl.getTipo_doc());
        ps.setInt(5, cl.getNum_doc());
        ps.setString(6, cl.getDireccion());
        ps.setBigDecimal(7, cl.getArea_terreno());
        ps.setBigDecimal(8, cl.getArea_construida());
        ps.setBigDecimal(9, cl.getAvaluo());
        ps.setDate(10, (java.sql.Date) cl.getVigencia()); // Asegúrate de que cl.getVigencia() sea del tipo correcto
        ps.setInt(11, cl.getNumid()); // Establece el numid al final
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


