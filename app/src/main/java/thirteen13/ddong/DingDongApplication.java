package thirteen13.ddong;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class DingDongApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("FOO", "onCreate");

        Parse.initialize(this,
                "eT8HUCePhitJSxgQSQOjRFko38GIbNUJu9AxNGeE",
                "h05Qv9mz2A0oZK3Jq7cDuwaDdRIXtbbUqVcbalj7");

        ParseInstallation.getCurrentInstallation().saveInBackground();
        
    }

    public void onPushReceive() {
        Log.d("FOO", "onPushReceive");
    }

}
