package thirteen13.ddong;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.media.MediaPlayer;

import com.parse.ParsePushBroadcastReceiver;

public class DingDongPushBroadcastReceiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushReceive(Context context, Intent receivedIntent) {
        Log.d("FOO", "onPushReceive");

        DingDongMediaPlayer mp = new DingDongMediaPlayer(context, R.raw.doorbell);
        ThreadedDingger d = new ThreadedDingger(mp);
        Thread dings = new Thread(d);
        dings.start();

        super.onPushReceive(context, receivedIntent);

    }
}
