package mx.unam.deapanassignment02w03.mail;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by Roy on 23/06/2016.
 */
public class SendMail extends AsyncTask<Void, Void, Void> {

    private Context context;
    private Session session;

    private String name;
    private String email;
    private String message;

    private ProgressDialog progressDialog;

    public SendMail(Context context, String name, String email, String message){
        this.context = context;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
        progressDialog = ProgressDialog.show(context, "Enviando mensaje", "Espera...", false, false);
    }

    @Override
    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);
        progressDialog.dismiss();
        Toast.makeText(context, "Mensaje enviado", Toast.LENGTH_LONG).show();
    }

    @Override
    protected Void doInBackground(Void... params){
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        session = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(Config.EMAIL, Config.PASSWORD);
            }
        });

        try {
            MimeMessage mm = new MimeMessage(session);

            mm.setFrom(new InternetAddress(Config.EMAIL));
            mm.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            mm.setSubject(name);
            mm.setText(message);

            Transport.send(mm);
        } catch (MessagingException e){
            e.printStackTrace();
        }

        return null;

    }



}
