package cl.inacap.carroproductos.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductos.dto.Producto;

public class ProductosDAOLista implements ProductosDAO {

    private List<Producto> productos = new ArrayList<>();

    private static ProductosDAOLista instancia;

    public static ProductosDAOLista getInstance(){
        if(instancia==null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca-Cola");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut maximus dui vitae feugiat consequat. Nunc felis erat, faucibus id fringilla quis, viverra et mauris.");
        p.setPrecio(1000);
        p.setFoto("https://www.elcontainer.cl/2096-large_default/pack-24-o-48-latas-mini-de-coca-cola.jpg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Chocolito");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut maximus dui vitae feugiat consequat. Nunc felis erat, faucibus id fringilla quis, viverra et mauris.");
        p.setPrecio(800);
        p.setFoto("https://www.savory.cl/sites/default/files/clasicos_solo-para-mi--chocolito.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("Super 8");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut maximus dui vitae feugiat consequat. Nunc felis erat, faucibus id fringilla quis, viverra et mauris.");
        p.setPrecio(250);
        p.setFoto("https://bugs.cl/wp-content/uploads/2018/04/fc_super8-500x500.jpg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Completo");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut maximus dui vitae feugiat consequat. Nunc felis erat, faucibus id fringilla quis, viverra et mauris.");
        p.setPrecio(1200);
        p.setFoto("https://www.dateate.cl/web/wp-content/uploads/2017/05/DoggisD%C3%ADadelCompleto2017.jpg");
        productos.add(p);


    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }

    @Override
    public List<Producto> getAll() {
        return productos;
    }
}
