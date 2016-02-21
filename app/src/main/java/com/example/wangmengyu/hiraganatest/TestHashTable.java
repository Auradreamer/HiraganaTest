package com.example.wangmengyu.hiraganatest;

import java.util.Hashtable;

/**
 * Created by wangmengyu on 2016-02-21.
 */
public class TestHashTable {

    public Hashtable TestHashTable() {

        Hashtable<String,String> hashtable = new Hashtable<>();

        hashtable.put("a","あ");
        hashtable.put("i","い");
        hashtable.put("u","う");
        hashtable.put("e","え");
        hashtable.put("o","お");
        return hashtable;

    }
}
