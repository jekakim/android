package com.akim.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Alex on 12/16/2014.
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;
    private int curPos;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c) {
        stop();

        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });

        mPlayer.seekTo(curPos);
        mPlayer.start();
    }

    public void pause() {
        mPlayer.pause();
        curPos = mPlayer.getCurrentPosition();
    }
}
