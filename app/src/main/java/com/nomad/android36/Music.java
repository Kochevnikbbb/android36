package com.nomad.android36;

public class Music {
    private Integer count;
    private String time;
    private String singer;
    private String nameMusic;

    public Music(Integer count, String time, String singer, String nameMusic) {
        this.count = count;
        this.time = time;
        this.singer = singer;
        this.nameMusic = nameMusic;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }
}
