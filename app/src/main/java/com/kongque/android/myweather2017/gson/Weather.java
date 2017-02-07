package com.kongque.android.myweather2017.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/2/6.
 */

public class Weather {

    public String status;
    public Basic mBasic;
    public AQI mAQI;
    public Now mNow;
    public Suggestion mSuggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}
