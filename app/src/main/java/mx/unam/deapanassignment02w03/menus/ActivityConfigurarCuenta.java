package mx.unam.deapanassignment02w03.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mx.unam.deapanassignment02w03.R;
import mx.unam.deapanassignment02w03.restApi.ConstantesRestApi;

public class ActivityConfigurarCuenta extends AppCompatActivity {

    private EditText editTextConfigurarCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_configurar_cuenta);

        editTextConfigurarCuenta = (EditText) findViewById(R.id.inputConfigurarCuenta);
    }

    public void guardarCuenta(View v){
        Button botonGuardarCuenta = (Button) findViewById(R.id.botonGuardarCuenta);

        Toast.makeText(this, "Espere por favor", Toast.LENGTH_SHORT).show();

        String configurarCuenta = editTextConfigurarCuenta.getText().toString().trim();

        //ConstantesRestApi.KEY_GET_RECENT_MEDIA_USER.s

        // Pendiente método para cambiar los id de KEY_GET_RECENT_MEDIA_USER en la clase ConstantesRestApi.java
    }

}
