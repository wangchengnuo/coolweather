package com.bignerdranch.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 诺哥 on 2018/3/28.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
