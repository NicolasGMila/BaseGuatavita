package baseguatavita;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private int ID; 
    private String Nombre;
    private String Correo;
    private String Contraseña;
    private String Privilegio;

    public Login() {}

    public Login(int ID, String Nombre, String Correo, String Contraseña, String Privilegio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.Privilegio = Privilegio;
    }

    // Getters y Setters
    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }
    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public String getCorreo() { return Correo; }
    public void setCorreo(String Correo) { this.Correo = Correo; }
    public String getContraseña() { return Contraseña; }
    public void setContraseña(String Contraseña) { this.Contraseña = Contraseña; }
    public String getPrivilegio() { return Privilegio; }
    public void setPrivilegio(String Privilegio) { this.Privilegio = Privilegio; }

    // Método para autenticar y obtener privilegio
    public String autenticarUsuario(String correo, String contraseña) {
        String privilegio = null;
        String sql = "SELECT Privilegio FROM usuarios WHERE Correo = ? AND Contraseña = ?";

        try (Connection conn = BaseGuatavita.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, correo);
            ps.setString(2, contraseña);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    privilegio = rs.getString("Privilegio");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al autenticar el usuario: " + e.getMessage());
        }

        return privilegio; // Devuelve el privilegio o null si no se encontró
    }
}
