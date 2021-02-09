package com.week3controldesignpattern.java;
public class SetVCR {
    public void on(){
        System.out.println("Turn on VCR");
    }

    public void off(){
        System.out.println("Turn off VCR");
    }

    public void setChannel(int startingChannel){
        System.out.println("Set to channel" + startingChannel);
    }

    public void setVolume(int volume){
        System.out.println("Volume set to " + volume);
    }
    
}
