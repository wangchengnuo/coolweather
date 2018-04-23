package com.bignerdranch.android.coolweather.gson;

/**
 * Created by 诺哥 on 2018/3/28.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
