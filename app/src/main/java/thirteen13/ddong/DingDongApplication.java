package thirteen13.ddong;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;

public class DingDongApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this,
                "eT8HUCePhitJSxgQSQOjRFko38GIbNUJu9AxNGeE",
                "h05Qv9mz2A0oZK3Jq7cDuwaDdRIXtbbUqVcbalj7");

        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

}
