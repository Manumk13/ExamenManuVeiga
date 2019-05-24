
package tk.examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBBDD {
   
    protected Connection conexion;
    
    public GestorBBDD () throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost:8889/biblioteca","PF_2019","AX_2019_P");
    }
    
    public void cerrarConexion() throws SQLException{
    
    conexion.close();
    
    }
}