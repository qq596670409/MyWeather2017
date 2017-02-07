package com.kongque.android.myweather2017.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/6.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More mMore;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
