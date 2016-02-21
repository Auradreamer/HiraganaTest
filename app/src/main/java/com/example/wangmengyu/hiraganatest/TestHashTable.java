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
        hashtable.put("ka","か");
        hashtable.put("ki","き");
        hashtable.put("ku","く");
        hashtable.put("ke","け");
        hashtable.put("ko","こ");
        return hashtable;

    }
}
