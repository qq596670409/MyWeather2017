package com.kongque.android.myweather2017.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/6.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public More mMore;

    @SerializedName("cond")
    public Temperature mTemperature;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
