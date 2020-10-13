package cl.inacap.carroproductos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import cl.inacap.carroproductos.dto.Producto;

public class ProductoViewActivity extends AppCompatActivity {

    TextView nombreProdTv;
    TextView descripcionProdTv;
    ImageView imagenProd;
    TextView precioProdTv;
    Producto producto;
    Toolbar toolbar;
    TextView tituloToolbarTv;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_view);
        this.toolbar = findViewById(R.id.toolbar);
        this.tituloToolbarTv = findViewById(R.id.titulo_toolbar_txt);
        this.setSupportActionBar(this.toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);

        this.nombreProdTv = findViewById(R.id.nombre_prod_view_txt);
        this.imagenProd = findViewById(R.id.image_prod_view);
        this.descripcionProdTv = findViewById(R.id.des_prod_view);
        this.precioProdTv = findViewById(R.id.precio_prod_view);

        if(getIntent().getExtras() != null){
            this.producto =(Producto) getIntent().getSerializableExtra("producto");
            this.tituloToolbarTv.setText(this.producto.getNombre());
            this.nombreProdTv.setText(this.producto.getNombre());
            Picasso.get().load(this.producto.getFoto()).resize(500,500)
                    .centerCrop().into(this.imagenProd);
            this.descripcionProdTv.setText(this.producto.getDescripcion());
            this.precioProdTv.setText("$ " + this.producto.getPrecio());

        }
    }
}