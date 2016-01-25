package thirteen13.ddong;
import android.content.Context;
import android.media.MediaPlayer;

public class DingDongMediaPlayer implements DingDongPlayer {

    private MediaPlayer mp;

    public DingDongMediaPlayer(Context context, int resid) {
        this.mp = MediaPlayer.create(context, resid);
    }

    @Override
    public void start() {
        mp.start();
    }
}
