package cl.inacap.carroproductos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

import cl.inacap.carroproductos.adapters.ProductosListAdapter;
import cl.inacap.carroproductos.dao.ProductosDAO;
import cl.inacap.carroproductos.dao.ProductosDAOLista;
import cl.inacap.carroproductos.dto.Producto;

public class MainActivity extends AppCompatActivity {

    private List<Producto> productos;
    private ProductosDAO prodDAO = ProductosDAOLista.getInstance();
    private ListView productosLV;
    private ProductosListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        this.productos = this.prodDAO.getAll();
        this.productosLV = findViewById(R.id.productos_lv);
        this.adapter = new ProductosListAdapter(this, R.layout.productos_list,this.productos);
        this.productosLV.setAdapter(this.adapter);
        this.productosLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Producto producto = productos.get(i);

                Intent intent = new Intent(MainActivity.this, ProductoViewActivity.class);
                intent.putExtra("producto",producto);
                startActivity(intent);
            }
        });
    }
}