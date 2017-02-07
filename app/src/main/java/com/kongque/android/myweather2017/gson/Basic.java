package com.kongque.android.myweather2017.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update mUpdate;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
