package blackhat.com.mkstudio.team.toasterlibrary;


import android.content.Context;
import android.widget.Toast;

/**
 * Created by Tushar Murkute on 08/07/2019.
 */

public class Toaster {

    public static void toaster(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();


    }
}
