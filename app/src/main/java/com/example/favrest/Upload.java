package com.example.favrest;

public class Upload {

    private String mName;
    private String mImageUrl;

    public Upload()
    {

    }

    public Upload(String Name, String ImageUrl)
    {
        mName = Name;
        mImageUrl= ImageUrl;
    }

    private void setName(String name)
    {
        mName = name;
    }

    private String getName()
    {
        return mName;
    }

    private void setImageUrl(String imageUrl)
    {
        mImageUrl=imageUrl;
    }

    private String getImageUrl()
    {
        return mImageUrl;
    }


}
