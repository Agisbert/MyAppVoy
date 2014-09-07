package voy.bert.http;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import java.io.IOException;

import voy.bert.util.ContactUtil;
import voy.bert.util.SharedUtil;

/**
 * Created by Adrian on 07/09/14.
 */
public class TareaRegistroGCM  extends AsyncTask<String,Integer,String> {

    private final static String SENDER_ID = "434606552167";
    public final static String TAG_LOG_GCM = "GCMLOG";
    private GoogleCloudMessaging gcm;
    private Context context;

    public TareaRegistroGCM(Context contexto) {
        context = contexto;
    }

    @Override
    protected String doInBackground(String... params) {
        try {

            SharedUtil shUtil = new SharedUtil(context);
            ContactUtil cntUtil = new ContactUtil(context);

           // if (gcm!=null) {
                gcm = GoogleCloudMessaging.getInstance(context);
           // }

            //Nos registramos en los servidores de GCM
            String regId = gcm.register(SENDER_ID);

            Log.d(TAG_LOG_GCM, "Registrado en GCM: registration_id=" + regId);

            shUtil.guardaDatoSharedString(shUtil.IDCGM, regId);

            //cntUtil.registraUsuario(regId);

        }
        catch (IOException ex)
        {
            Log.d(TAG_LOG_GCM, "Error registro en GCM:" + ex.getMessage());
        }

        return "OK";
    }

}
