package com.example.android.nagyvarad;

/**
 * Created by Noemi on 12/7/2017.
 */

public class RomanContent {

    private String mRomanId;

    private String mEnglishId;

    private int mAudioId;

    public RomanContent(String romanId, String englishId, int audioId){
        mEnglishId = englishId;
        mRomanId = romanId;
        mAudioId = audioId;
    }

    public String getRomanId(){ return  mRomanId;}

    public String getEnglishId(){ return  mEnglishId;}

    public int getAudioId(){ return mAudioId;}

}
