package com.bugchain.youtubeplayerapi;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by POSEIDON on 23/9/2558.
 */
public class PlayerInActivity extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener,
        YouTubePlayer.PlayerStateChangeListener {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.player_in_activity);

        YouTubePlayerView playerView = (YouTubePlayerView)findViewById(R.id.youtube_player_view);
        playerView.initialize(Config.YOUTUBE_API_KEY,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer youTubePlayer, boolean wasRestored) {
        youTubePlayer.setPlaybackEventListener(this);
        youTubePlayer.setPlayerStateChangeListener(this);
//        youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        if(!wasRestored){
            youTubePlayer.cueVideo(Config.YOUTUBE_VIDEO_ID);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult youTubeInitializationResult) {

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }
}
