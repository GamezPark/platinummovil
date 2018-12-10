package upch.movil.platinum.platinummovilupch;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFireBaseMessaginServices extends FirebaseMessagingService {
    public static final String TAG = "Notificaciones";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String from = remoteMessage.getFrom();

        Log.d(TAG,"Mensaje Recibido: "+from);

        if(remoteMessage.getNotification() != null){
            Log.d(TAG,"Notificacion: "+remoteMessage.getNotification().getBody());
        }
    }
}
