package voy.bert.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by Adrian on 07/09/14.
 */
public class ContactUtil {

    private Context context;

    public ContactUtil(Context context){
        context = context;
    }

    public void registraUsuario(String idGCM){
        TelephonyManager tMgr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        String mPhoneNumber = tMgr.getLine1Number();

        //TODO: Registrar con el telefono y el id de google

    }
}
