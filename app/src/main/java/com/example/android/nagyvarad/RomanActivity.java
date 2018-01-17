package com.example.android.nagyvarad;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    private AudioManager mAudioManager;

    private AudioManager.OnAudioFocusChangeListener mOnFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);}
                else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
                mMediaPlayer.start();
            }
            else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                    releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<RomanContent>content = new ArrayList<RomanContent>();

        content.add(new RomanContent("Unde este cea mai apropiata sectie de politie?", "Where is the nearest police station?", R.raw.politie));
        content.add(new RomanContent("Este scumpa calatoria cu tramvaiul in acest oras?", "Is it expensive to travel by tram in this town?", R.raw.tramvai));
        content.add(new RomanContent("Aveti farmacie non-stop in acest oras?", "Excuse me! Do you have a non-stop pharmacy in this town?", R.raw.farmacie));
        content.add(new RomanContent("Cum pot sa ajung la aeroport?", "How can I get to the airport?", R.raw.aeroport));
        content.add(new RomanContent("Cum pot sa ajung la spital?", "How can I get to the hospital", R.raw.spital));
        content.add(new RomanContent("Va rog sa-mi chemati un taxi!", "PLease, call me a taxi as soon as posible!", R.raw.taxi));
        content.add(new RomanContent("Scuzati-ma! Bacsisul este inclus in nota de plata?", "Excuse me! Is it the tip on the bill?", R.raw.bacsis));

        RomanContentAdapter adapter = new RomanContentAdapter(RomanActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();

                RomanContent myContent = content.get(position);

                int result = mAudioManager.requestAudioFocus(mOnFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){

                    mMediaPlayer = MediaPlayer.create(RomanActivity.this, myContent.getAudioId());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if (mMediaPlayer !=null){
            mMediaPlayer.release();
            mMediaPlayer=null;
            mAudioManager.abandonAudioFocus(mOnFocusChangeListener);
        }
    }
}
