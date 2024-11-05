package baseguatavita;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Busqueda {
    
public DefaultTableModel buscarPer(String buscar) {
    String[] nombreColumna = {"numid", "cedula_catastral", "num_orden", "nombre", "tipo_doc", "num_doc", "direccion", "area_terreno", "area_construida", "avaluo", "vigencia"};
    String[] registros = new String[11];
    DefaultTableModel modelo = new DefaultTableModel(null, nombreColumna);


    if (buscar == null || buscar.trim().isEmpty() || buscar.length() < 5) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de búsqueda de al menos 5 dígitos.");
        return modelo;
    }

    String sql;
    int numDoc;

    try {
        // Intentar convertir la entrada a Integer
        numDoc = Integer.parseInt(buscar);
        sql = "SELECT * FROM guatavita_reg1 WHERE num_doc = ?;";
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para num_doc.");
        return modelo;
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    BaseGuatavita bs = new BaseGuatavita();

    try {
        conn = bs.getConnection();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, numDoc);

        rs = ps.executeQuery();

        while (rs.next()) {
            registros[0] = rs.getString("numid");
            registros[1] = rs.getString("cedula_catastral");
            registros[2] = rs.getString("num_orden");
            registros[3] = rs.getString("nombre");
            registros[4] = rs.getString("tipo_doc");
            registros[5] = rs.getString("num_doc");
            registros[6] = rs.getString("direccion");
            registros[7] = rs.getString("area_terreno");
            registros[8] = rs.getString("area_construida");
            registros[9] = rs.getString("avaluo");
            registros[10] = rs.getString("vigencia");
            modelo.addRow(registros);
        }

    } catch (SQLException e) {
        System.out.println(e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    return modelo;
}

public DefaultTableModel buscarPer2(String buscar2) {
    String[] nombreColumna = {"numid", "cedula_catastral", "matricula_inmobiliaria", "aterreno", "aconstruida", "vigencia"};
    String[] registros = new String[6];
    DefaultTableModel modelo2 = new DefaultTableModel(null, nombreColumna);

    if (buscar2 == null || buscar2.trim().isEmpty()) {
        return modelo2;
    }

    String sql;
    if (buscar2.length() > 30) {
        sql = "SELECT * FROM guatavita_reg2 WHERE cedula_catastral LIKE ?;";
    } else {
        sql = "SELECT * FROM guatavita_reg2 WHERE cedula_catastral = ?;";
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    BaseGuatavita bs = new BaseGuatavita();

    try {
        conn = bs.getConnection();
        ps = conn.prepareStatement(sql);

        if (buscar2.length() > 30) {
            ps.setString(1, "%" + buscar2 + "%");
        } else {
            ps.setString(1, buscar2);
        }

        rs = ps.executeQuery();

        while (rs.next()) {
            registros[0] = rs.getString("numid");
            registros[1] = rs.getString("cedula_catastral");
            registros[2] = rs.getString("matricula_inmobiliaria");
            registros[3] = rs.getString("aterreno");
            registros[4] = rs.getString("aconstruida");
            registros[5] = rs.getString("vigencia");
            modelo2.addRow(registros);
        }

    } catch (SQLException e) {
        System.out.println("Error en buscarPer2: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Error cerrando recursos en buscarPer2: " + e.getMessage());
        }
    }

    return modelo2;
}

public DefaultTableModel buscarPer3(String buscar2) {
    String[] nombreColumna = {"z_fis1", "z_fis2", "z_econ1", "z_econ2", "habitaciones1", "habitaciones2", "habitaciones3", 
                              "banos1", "banos2", "banos3", "locales1", "locales2", "locales3", "pisos1", "pisos2", 
                              "pisos3", "estrato1", "estrato2", "estrato3", "destino1", "destino2", "destino3", 
                              "puntaje1", "puntaje2", "puntaje3"};
    String[] registros = new String[25];
    DefaultTableModel modelo3 = new DefaultTableModel(null, nombreColumna);

    if (buscar2 == null || buscar2.trim().isEmpty()) {
        return modelo3; 
    }

    String sql;
    if (buscar2.length() > 30) {
        sql = "SELECT * FROM guatavita_reg2 WHERE cedula_catastral LIKE ?;";
    } else {
        sql = "SELECT * FROM guatavita_reg2 WHERE cedula_catastral = ?;";
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    BaseGuatavita bs = new BaseGuatavita();

    try {
        conn = bs.getConnection();
        ps = conn.prepareStatement(sql);

        if (buscar2.length() > 30) {
            ps.setString(1, "%" + buscar2 + "%");
        } else {
            ps.setString(1, buscar2);
        }

        rs = ps.executeQuery();

        while (rs.next()) {
            registros[0] = rs.getString("z_fis1");
            registros[1] = rs.getString("z_fis2");
            registros[2] = rs.getString("z_econ1");
            registros[3] = rs.getString("z_econ2");
            registros[4] = rs.getString("habitaciones1");
            registros[5] = rs.getString("habitaciones2");
            registros[6] = rs.getString("habitaciones3");
            registros[7] = rs.getString("banos1");
            registros[8] = rs.getString("banos2");
            registros[9] = rs.getString("banos3");
            registros[10] = rs.getString("locales1");
            registros[11] = rs.getString("locales2");
            registros[12] = rs.getString("locales3");
            registros[13] = rs.getString("pisos1");
            registros[14] = rs.getString("pisos2");
            registros[15] = rs.getString("pisos3");
            registros[16] = rs.getString("estrato1");
            registros[17] = rs.getString("estrato2");
            registros[18] = rs.getString("estrato3");
            registros[19] = rs.getString("destino1");
            registros[20] = rs.getString("destino2");
            registros[21] = rs.getString("destino3");
            registros[22] = rs.getString("puntaje1");
            registros[23] = rs.getString("puntaje2");
            registros[24] = rs.getString("puntaje3");
            modelo3.addRow(registros);
        }

    } catch (SQLException e) {
        System.out.println("Error en buscarPer3: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Error cerrando recursos en buscarPer3: " + e.getMessage());
        }
    }

    return modelo3;
}

}
