package hola_mundo;

/**
 *
 * @author keno
 */
public class DB {
    private String conexion;

    public DB(String conexion) {
        this.conexion = conexion;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    
    
}
