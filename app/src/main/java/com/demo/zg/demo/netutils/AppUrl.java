package com.demo.zg.demo.netutils;

/**
 * Created by ZG on 2018/4/1.
 */

public class AppUrl {
    private static String baseurl = "https://www.sojson.com/open/api/weather/json.shtml?city=";

    public  static String getUrl(String city){
        return baseurl+city;
    }
}
