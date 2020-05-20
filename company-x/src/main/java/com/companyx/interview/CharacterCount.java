package com.companyx.interview;

/**
 * @author akadir
 * Date: 15.05.2020
 * Time: 18:50
 */
public class CharacterCount {
    private String s;
    private int count;

    public CharacterCount(String s) {
        this.s = s;
        this.count = 0;
    }

    public void incrementCount() {
        count = count + 1;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}