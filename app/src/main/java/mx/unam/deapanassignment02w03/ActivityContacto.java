package mx.unam.deapanassignment02w03;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class ActivityContacto extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextMessage;

    private Button botonEnviarComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_contacto);

        editTextName = (EditText) findViewById(R.id.inputNombre);
        editTextEmail = (EditText) findViewById(R.id.inputCorreo);
        editTextMessage = (EditText) findViewById(R.id.inputMensaje);

        botonEnviarComentario = (Button) findViewById(R.id.botonSiguiente);
        botonEnviarComentario.setOnClickListener(this);

    }

    private void sendEmail(){
        String name = editTextName.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String message = editTextMessage.getText().toString().trim();
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }
}
