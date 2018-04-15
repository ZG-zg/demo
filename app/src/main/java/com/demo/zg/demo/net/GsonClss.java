package com.demo.zg.demo.net;

import java.util.List;

/**
 *
 */

public class GsonClss {
    private String date;
    private String message;
    private int status;
    private  String city;
    private int count;
    private Data data;

    public class Data {
        private String shidu;
        private int pm25;
        private int pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private Yesterday yesterday;
        List<Forecast> forecast;

        public List<Forecast> getList() {return forecast;}
        public void setList(List<Forecast> forecast) {this.forecast = forecast;}

        public String getShidu() {return shidu;}
        public void setShidu(String shidu) {this.shidu = shidu;}

        public int getPm25() {return pm25;}
        public void setPm25(int pm25) {this.pm25 = pm25;}

        public int getPm10() {return pm10;}
        public void setPm10(int pm10) {this.pm10 = pm10;}

        public String getQuality() {return quality;}
        public void setQuality(String quality) {this.quality = quality;}

        public String getWendu() {return wendu;}
        public void setWendu(String wendu) {this.wendu = wendu;}

        public String getGanmao() {return ganmao;}
        public void setGanmao(String ganmao) {this.ganmao = ganmao;}

        public Yesterday getYesterday() {return yesterday;}
        public void setYesterday(Yesterday yesterday) {this.yesterday = yesterday;}
    }
    public class Yesterday{
        private String date;
        private String high;
        private String low;
        private String fx;
        private String fl;
        private String type;
        private String notice;

        public String getDate() {return date;}
        public void setDate(String date) {this.date = date;}

        public String getHigh() {return high;}
        public void setHigh(String high) {this.high = high;}

        public String getLow() {return low;}
        public void setLow(String low) {this.low = low;}

        public String getFx() {return fx;}
        public void setFx(String fx) {this.fx = fx;}

        public String getFl() {return fl;}
        public void setFl(String fl) {this.fl = fl;}

        public String getType() {return type;}
        public void setType(String type) {this.type = type;}

        public String getNotice() {return notice;}
        public void setNotice(String notice) {this.notice = notice;}
    }
    public class Forecast{
        private String date;
        private String high;
        private String low;
        private String fx;
        private String fl;
        private String type;
        private String notice;

        public String getDate() {return date;}
        public void setDate(String date) {this.date = date;}

        public String getHigh() {return high;}
        public void setHigh(String high) {this.high = high;}

        public String getLow() {return low;}
        public void setLow(String low) {this.low = low;}

        public String getFx() {return fx;}
        public void setFx(String fx) {this.fx = fx;}

        public String getFl() {return fl;}
        public void setFl(String fl) {this.fl = fl;}

        public String getType() {return type;}
        public void setType(String type) {this.type = type;}

        public String getNotice() {return notice;}
        public void setNotice(String notice) {this.notice = notice;}
    }


    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

    public int getStatus() {return status;}
    public void setStatus(int status) {this.status = status;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}

    public Data getData() {return data;}
    public void setData(Data data) {this.data = data;}
    /*
    private int status;
    private String message;
    private Data data;
    public static class Data{
        private int years;
        private int months;
        private int day;
        private int lunarYear;
        private int lunarMonth;
        private int lunarDay;
        private String cnyear;
        private String cnmonth;
        private String cnday;
        private String hyear;
        private String cyclicalYear;
        private String cyclicalMonth;
        private String cyclicalDay;
        private String suit;
        private String taboo;
        private String animal;
        private String week;
        private String festivalList;
        private Jieqi jieqi;

        private int maxDayInMonth;
        private  boolean leap;
        private  boolean bigMonth;
        private String lunarYearString;
        public static class Jieqi{
            private String four;

            public String getFour() {return four;}

            public void setFour(String four) {this.four = four;}
        }


        public int getYears() {return years;}

        public void setYears(int years) {this.years = years;}

        public int getMonths() {return months;}

        public void setMonths(int months) {this.months = months;}

        public int getDay() {return day;}

        public void setDay(int day) {this.day = day;}

        public int getLunarYear() {return lunarYear;}

        public void setLunarYear(int lunarYear) {this.lunarYear = lunarYear;}

        public int getLunarMonth() {return lunarMonth;}

        public void setLunarMonth(int lunarMonth) {this.lunarMonth = lunarMonth;}

        public int getLunarDay() {return lunarDay;}

        public void setLunarDay(int lunarDay) {this.lunarDay = lunarDay;}

        public String getCnyear() {return cnyear;}

        public void setCnyear(String cnyear) {this.cnyear = cnyear;}

        public String getCnmonth() {return cnmonth;}

        public void setCnmonth(String cnmonth) {this.cnmonth = cnmonth;}

        public String getCnday() {return cnday;}

        public void setCnday(String cnday) {this.cnday = cnday;}

        public String getHyear() {return hyear;}

        public void setHyear(String hyear) {this.hyear = hyear;}

        public String getCyclicalYear() {return cyclicalYear;}

        public void setCyclicalYear(String cyclicalYear) {this.cyclicalYear = cyclicalYear;}

        public String getCyclicalMonth() {return cyclicalMonth;}

        public void setCyclicalMonth(String cyclicalMonth) {this.cyclicalMonth = cyclicalMonth;}

        public String getCyclicalDay() {return cyclicalDay;}

        public void setCyclicalDay(String cyclicalDay) {this.cyclicalDay = cyclicalDay;}

        public String getFestivalList() {return festivalList;}

        public void setFestivalList(String festivalList) {this.festivalList = festivalList;}

        public String getSuit() {return suit;}

        public void setSuit(String suit) {this.suit = suit;}

        public String getTaboo() {return taboo;}

        public void setTaboo(String taboo) {this.taboo = taboo;}

        public String getAnimal() {return animal;}

        public void setAnimal(String animal) {this.animal = animal;}

        public String getWeek() {return week;}

        public void setWeek(String week) {this.week = week;}

        public int getMaxDayInMonth() {return maxDayInMonth;}

        public void setMaxDayInMonth(int maxDayInMonth) {this.maxDayInMonth = maxDayInMonth;}

        public boolean isLeap() {return leap;}

        public void setLeap(boolean leap) {this.leap = leap;}

        public boolean isBigMonth() {return bigMonth;}

        public void setBigMonth(boolean bigMonth) {this.bigMonth = bigMonth;}

        public String getLunarYearString() {return lunarYearString;}

        public void setLunarYearString(String lunarYearString) {this.lunarYearString = lunarYearString;}
    }





    public int getStatus() {return status;}

    public void setStatus(int status) {this.status = status;}

    public String getMessage() {return message;}

    public void setMessage(String message) {this.message = message;}
*/

    }
