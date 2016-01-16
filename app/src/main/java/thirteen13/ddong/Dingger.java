package thirteen13.ddong;

import android.content.Context;
import android.os.AsyncTask;
import android.media.MediaPlayer;

public class Dingger extends AsyncTask<Void, Void, Void> {

    Context mContext;
    boolean mFinished = false;

    public Dingger(Context context) {
        mContext = context;
    }

    @Override
    protected Void doInBackground(Void... params) {

        MediaPlayer mPlayer = MediaPlayer.create(mContext, R.raw.doorbell);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            int n = 0;

            @Override
            public void onCompletion(MediaPlayer mp) {
                n++;
                if (n < 3) {
                    mp.start();
                } else {
                    Dingger.this.mFinished = true;
                }
            }
        });

        mPlayer.start();

        while(!mFinished) {
            try {
                synchronized (mPlayer) {
                    mPlayer.wait(30);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
