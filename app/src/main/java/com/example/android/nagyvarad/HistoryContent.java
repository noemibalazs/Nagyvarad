package com.example.android.nagyvarad;

import java.net.PortUnreachableException;

/**
 * Created by Noemi on 12/4/2017.
 */

public class HistoryContent  {

    private String mTurId;

    private String mLinkId;

    private int mPhotoId;

    public HistoryContent(String turId, String linkId, int photoId){
        mTurId = turId;
        mLinkId = linkId;
        mPhotoId = photoId;
    }

    public String getTurId(){
        return mTurId;
    }

    public String getLinkId(){
        return mLinkId;
    }

    public int getPhotoId(){
        return mPhotoId;
    }
}
