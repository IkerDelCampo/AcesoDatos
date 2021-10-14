
package accesodatos;

public class ImplementacionMsql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insetando desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Mysql");
    }
    
}
