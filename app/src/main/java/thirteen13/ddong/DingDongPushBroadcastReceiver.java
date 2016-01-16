package thirteen13.ddong;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by jseba on 17/01/16.
 */
public class DingDongPushBroadcastReceiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushReceive(Context context, Intent receivedIntent) {
        Log.d("FOO", "onPushReceive");
        Intent intent = new Intent();
        intent.setClassName("thirteen13.ddong", "thirteen13.ddong.DingDong");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
