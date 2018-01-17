package com.example.android.nagyvarad;

import org.w3c.dom.ProcessingInstruction;

/**
 * Created by Noemi on 12/4/2017.
 */

public class Content {
    private String mNameId;

    private String mAddressId;

    private String mTelephoneId;

    private String mWebPageId;

    private int mImageResourceId;

    public Content (String nameId, String addressId, String telephoneId, String webPageId, int imageResourceId){
        mNameId = nameId;
        mAddressId = addressId;
        mTelephoneId = telephoneId;
        mWebPageId = webPageId;
        mImageResourceId = imageResourceId;
    }

    public String getNameId(){
        return mNameId;
    }

    public String getAddressId(){
        return mAddressId;
    }

    public String  getTelephoneId(){
        return mTelephoneId;
    }

    public String getWebPageId(){return mWebPageId;}

    public int getImageResourceId(){ return mImageResourceId;}
}


