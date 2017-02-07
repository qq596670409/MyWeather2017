package com.kongque.android.myweather2017.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/6.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort mComfort;

    @SerializedName("cw")
    public Carwash mCarwash;

    @SerializedName("sport")
    public Sport mSport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class Carwash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
