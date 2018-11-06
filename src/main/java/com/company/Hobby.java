package com.company;

public abstract class Hobby {
    protected String name;
    protected int hours;

    private byte byte_param;
    private char char_param;
    private short short_param;
    private float float_param;
    private int int_param;
    private long long_param;
    private double double_param;
    private boolean boolean_param;

    public String toString(){
        return "My hobby is " + name +  ", hours = " + hours;
    }

    public Hobby() {
    }

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(int hours) {
        this.hours = hours;
    }

    public Hobby(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public Hobby(byte byte_param, char char_param, short short_param, float float_param, int int_param, long long_param, double double_param, boolean boolean_param) {
        this.byte_param = byte_param;
        this.char_param = char_param;
        this.short_param = short_param;
        this.float_param = float_param;
        this.int_param = int_param;
        this.long_param = long_param;
        this.double_param = double_param;
        this.boolean_param = boolean_param;
    }

    public abstract void tellAboutHobby();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public byte getByte_param() {
        return byte_param;
    }

    public void setByte_param(byte byte_param) {
        this.byte_param = byte_param;
    }

    public char getChar_param() {
        return char_param;
    }

    public void setChar_param(char char_param) {
        this.char_param = char_param;
    }

    public short getShort_param() {
        return short_param;
    }

    public void setShort_param(short short_param) {
        this.short_param = short_param;
    }

    public float getFloat_param() {
        return float_param;
    }

    public void setFloat_param(float float_param) {
        this.float_param = float_param;
    }

    public int getInt_param() {
        return int_param;
    }

    public void setInt_param(int int_param) {
        this.int_param = int_param;
    }

    public long getLong_param() {
        return long_param;
    }

    public void setLong_param(long long_param) {
        this.long_param = long_param;
    }

    public double getDouble_param() {
        return double_param;
    }

    public void setDouble_param(double double_param) {
        this.double_param = double_param;
    }

    public boolean isBoolean_param() {
        return boolean_param;
    }

    public void setBoolean_param(boolean boolean_param) {
        this.boolean_param = boolean_param;
    }
}