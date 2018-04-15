package com.demo.zg.demo;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.demo.zg.demo.net.GsonClss;
import com.demo.zg.demo.net.Mynet;
import com.demo.zg.demo.net.Observe;
import com.demo.zg.demo.netutils.AppUrl;
import com.demo.zg.demo.netutils.ParseData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends Activity {
    private static final  String TAG = "MainActivity";
    private Button bt;
    private TextView tvShow_city,tvShow1,tvShow_today,tvShow_now;
    private EditText editCity;
    private ImageView img_today,img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiview();
   }
    private void intiview() {
        editCity = findViewById(R.id.cityEdit);
        tvShow_city =  findViewById(R.id.textShow_city);
        tvShow1 = findViewById(R.id.tvShow1);
        tvShow_now = findViewById(R.id.tv_now);
        tvShow_today =findViewById(R.id.textShow_today);
        //img_today = findViewById(R.id.img_today);
        img1  = findViewById(R.id.img1);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();//获取接口数据
            }
        });
    }

    private void getData() {
        //获取用户输入框的值
        String city = editCity.getText().toString().trim();
        String url= AppUrl.getUrl(city);//获取我们的接口url
        Mynet.requestGet(this,url, new Observe() {
            @Override
            public void onSuccess(String response) {
                Log.d(TAG, "onSuccess: " + response);

                //用Gson解析数据
                Gson gson = new Gson();//实例化gson对象
                //Domain domain = gson.fromJson(response,Domain.class);//解析数据到实体类中
                // Log.d(TAG, "onSuccess: "+domain.getNature());
                GsonClss gc = gson.fromJson(response,GsonClss.class);
                tvShow_city.setText(gc.getCity());

                tvShow_now.setText(gc.getData().getWendu());
                tvShow_today.setText("PM2.5     :"+gc.getData().getPm10()+"\n");
                tvShow_today.append("湿度      ："+gc.getData().getShidu()+"\n");
                tvShow_today.append("空气质量："+gc.getData().getQuality());

                tvShow1.setText("");
                for(int i=0;i<4;i++) {
                    tvShow1.append(gc.getData().getList().get(i).getDate()+"   ");
                    tvShow1.append(gc.getData().getList().get(i).getLow()+"/");
                    tvShow1.append(gc.getData().getList().get(i).getHigh()+"\n");
                }


                /*
                //解析基本数据类型（封装）
                String city = ParseData.parseString(response,"city");
                tvShow_city.setText(city);
                //解析对象中的对象属性
                JSONObject data = ParseData.parseObject(response, "data");
                String shidu = data.optString("shidu");
                String pm = data.optString("pm25");
                String quality = data.optString("quality");
                String wendu = data.optString("wendu");
                tvShow_now.setText(wendu);
                tvShow_today.setText("PM2.5     :"+pm+"\n");
                tvShow_today.append("湿度      ："+shidu+"\n");
                tvShow_today.append("空气质量："+quality);
                //解析对象中数组对象
                JSONArray array = ParseData.parseObjectArray(data, "forecast");
                tvShow1.setText("");
                for(int i=0;i<array.length();i++) {
                    String date1 = array.optJSONObject(i).optString("date");
                    String low = array.optJSONObject(i).optString("low");
                    String high = array.optJSONObject(i).optString("high");
                    tvShow1.append(date1+"   ");
                    tvShow1.append(low+"/");
                    tvShow1.append(high+"\n");
                }*/

            }
            @Override
            public void onError(VolleyError ve) {
                Log.d(TAG, "onError: "+ve.toString());
            }
        });
    }










/*
    private void getData() {
        String url = "https://www.sojson.com/open/api/weather/json.shtml?city=北京";
        Mynet.requestGet(this, url, new Observe() {
            @Override
            public void onSuccess(String response) {
                Log.d(TAG,"onResponse"+response);


                // 解析数据：
                try {
                    JSONObject object = new JSONObject(response);
                    final   String errMsg = object.getString("errMsg");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tvShow.setText(errMsg);
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onError(VolleyError ve) {
                Log.d(TAG,"onErrorResponse:"+ve.toString());
            }
        });
    }

*/
/*
    private void getData(){
        String url = "https://hao.360.cn/?wd=1000";
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                Log.d(TAG,"onResponse"+response);
                try {
                    JSONObject object = new JSONObject(response);
                    final String errMsg  = object.getString("errMsg");
                    runOnUiThread(new Runnable(){
                        @Override
                        public void run(){
                            tvShow.setText(errMsg);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError volleyError){
                Log.d(TAG,"onErrorResponse:"+volleyError.toString());
                //tvShow.setText("vcv");
            }
        });
        requestQueue.add(stringRequest);
        requestQueue.start();
    }*/
}
