package com.example.auser.java_171205_01;

/**
 * Created by auser on 2017/12/5.
 */

public class Elevation {
    public MyResult[] results;
    public String status;
}

class MyLocation
{
    public double lat;
    public double lng;
}

class MyResult
{
    public double elevation;
    public MyLocation location;
    public double resolution;
}