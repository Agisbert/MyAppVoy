package voy.bert.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Adrian on 07/09/14.
 */
public class SharedUtil {

    public final static String IDCGM = "IDGCM";

    private Context context;

    public SharedUtil (Context context){
        this.context = context;
    }

    public void guardaDatoSharedString(String clave, String valor){
        SharedPreferences preferencias = context.getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString(clave, valor);
        editor.commit();
    }

    public String dameDatoSharedString(String clave){
        SharedPreferences preferencias = context.getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        return preferencias.getString(clave, "");
    }
}
