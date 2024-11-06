package baseguatavita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseGuatavita {
    private static Connection conn; // Cambiado a static

    public BaseGuatavita() {
        // Constructor para inicializar la conexión
        getConnection();
    }

    public static Connection getConnection() { // Cambiado a static
        // Verifica si la conexión ya está establecida
        if (conn == null || !isConnectionValid()) {
            try {
                // Conexión a la base de datos
                String url = "jdbc:postgresql://dpg-cslb04m8ii6s73d9f1dg-a.oregon-postgres.render.com:5432/baseguatavita";
                String user = "baseguatavita_user";
                String password = "mPPu2DJmPpG36dJhqGkQEN5jwMPZYHkg";
                conn = DriverManager.getConnection(url, user, password);
                
                // Establecer el esquema
                String schema = "guatavita";
                PreparedStatement stmt = conn.prepareStatement("SET search_path TO " + schema);
                stmt.execute();
                
                System.out.println("Conexión establecida y esquema configurado correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    // Método para verificar si la conexión es válida
    private static boolean isConnectionValid() { // Cambiado a static
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para cerrar la conexión, debe ser llamado al final de la aplicación
    public static void closeConnection() { // Cambiado a static
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn = null; // Asegúrate de que el objeto de conexión se libere
            }
        }
    }
}
