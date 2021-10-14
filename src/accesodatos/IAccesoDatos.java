
package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO =10;
    
    void insertar();//Por defecto son abstractos y publicos
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
