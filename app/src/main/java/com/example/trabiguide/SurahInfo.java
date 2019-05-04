package com.example.trabiguide;

public class SurahInfo {

    public String SurahList,SurahName,url;

    public SurahInfo(){

    }

    public SurahInfo(String surahList, String surahName, String url) {
        SurahList = surahList;
        SurahName = surahName;
        this.url = url;
    }

    public String getSurahList() {
        return SurahList;
    }

    public String getSurahName() {
        return SurahName;
    }

    public String getSurahUrl() {
        return url;
    }
}
