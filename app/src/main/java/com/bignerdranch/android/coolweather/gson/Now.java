package com.bignerdranch.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 诺哥 on 2018/3/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
