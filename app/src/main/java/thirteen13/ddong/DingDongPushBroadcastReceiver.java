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
        MediaPlayer mPlayer = MediaPlayer.create(context, R.raw.doorbell);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            int n = 0;

            @Override
            public void onCompletion(MediaPlayer mp) {
                n++;
                if (n < 3) {
                    mp.start();
                }
            }
        });
        
        mPlayer.start();

        super.onPushReceive(context, receivedIntent);

    }

}
