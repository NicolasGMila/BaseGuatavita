
package baseguatavita;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LOGINDAO {
   Connection conn;
   PreparedStatement ps;
   ResultSet rs;
   BaseGuatavita bs = new BaseGuatavita();
     public Login log(String Correo, String Contraseña, String Privilegio){
     Login l = new Login();
   
     String sql = "SELECT * FROM usuarios WHERE Correo = ? AND Contraseña = ? AND Privilegio = ?";
     try {
         conn = bs.getConnection();
         ps = conn.prepareStatement(sql);
         ps.setString(1, Correo);
         ps.setString(2, Contraseña);
         ps.setString(3, Privilegio);
         rs = ps.executeQuery();
         if (rs.next())
         {
             l.setID(rs.getInt("ID"));
             l.setNombre(rs.getString("Nombre"));
             l.setCorreo(rs.getString("Correo"));
             l.setContraseña(rs.getString("Contraseña"));
             l.setPrivilegio(rs.getString("Privilegio"));
                      }
         
     } catch (SQLException e){
         System.out.println(e.toString());
              }
       return l;
     }
}
