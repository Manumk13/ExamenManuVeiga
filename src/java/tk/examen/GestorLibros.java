/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.examen;

/**
 *
 * @author cice
 */
import java.io.FileNotFoundException;// este y el de debajo son los de almacenar
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorLibros extends GestorBBDD {

    public GestorLibros() throws ClassNotFoundException, SQLException {
        super();
    }

    public void registrar(Libros nuevoLibros) throws SQLException {
        String sql = "INSERT INTO libros(titulo, autor, ISBN, pvp) VALUES(?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nuevoLibros.getTitulo());
        ps.setString(2, nuevoLibros.getAutor());
        ps.setString(3, nuevoLibros.getISBN());
        ps.setFloat(4, nuevoLibros.getPvp());
        ps.executeUpdate();
        cerrarConexion();

    }

    public ResultSet getLibros() throws SQLException {

        String sql = "SELECT * FROM libros";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        return resultado;

    }
}
