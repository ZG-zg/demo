package com.demo.zg.demo.net;

import com.android.volley.VolleyError;

import org.json.JSONException;

/**
 * Created by ZG on 2018/3/25.
 */

public interface Observe {
    void onSuccess(String response);
    void onError(VolleyError error);
}
