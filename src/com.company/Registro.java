package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Registro {

    private static final String dbName = "prueba";
    private static final String dbUser = "root";
    private static final String dbPwd = "Nacho_2013";


    public static List<Libro> getProductos() {
        List<Libro> productos = new ArrayList<>();

        ConexionDB conexion = new ConexionDB(dbName, dbUser, dbPwd);
        ResultSet rs = conexion.consultar("SELECT * FROM productos WHERE stock > 0;");
        if (rs != null)
            try {
                while (rs.next()) {
                    productos.add(new Libro(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3)
                    ));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                conexion.cerrar();
            }
        return productos;
    }}
//public static void getTitulo(Integer IDlibro) {
//     String titulo = "";
//     String sql = "SELECT * FROM libros WHERE IDlibro = ?";
//     ConexionDB conexionDB = new ConexionDB(dbName, dbUser, dbPwd, sql);
//     PreparedStatement pstmt = conexionDB.getPstmt();
//     try {
//         pstmt.setInt(1, IDlibro);
//         ResultSet rs = pstmt.executeQuery();
//         if (rs.next())
//             titulo = rs.getString("titulo");
//     } catch (SQLException e) {
//         e.printStackTrace();
//     } finally {
//         conexionDB.cerrar();
//     }
// }

