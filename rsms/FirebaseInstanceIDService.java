package fiveteam.com.rsms;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by bon200-29 on 2016-06-13.
 */
public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d("check", token);

            /*registerToken(token);*/

    }

 /*

 private void registerToken(String token) {

    try {
        String requestURL = "http://107.161.27.109/Home/token?Token="+token;

        Log.d("check", requestURL);

        URL url = new URL(requestURL);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();

    } catch (Exception e) {
        Log.d("check","Server Request failed");
    }
}

*/

}
