package com.wss.httpclients.factory;

public class Config {
    //连接建立的超时时间
    public static int getHttpConnectTimeout(){
        return 5000;
    }
    //请求获取数据的超时时间
    public static int getHttpSocketTimeout(){
        return 8000;
    }
    //最大连接数
    public static int getHttpMaxPoolSize(){
        return 50;
    }
    //空闲连接超时时间
    public static int getHttpIdelTimeout(){
        return 5000;
    }
    //初始化延时
    public static int getHttpMonitorInterval(){
        return 30 * 1000;
    }

}
