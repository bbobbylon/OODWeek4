package com.week3controldesignpattern.java;
public class SetVCROnCommand implements Command {
    SetVCR setVCR;

  

	public SetVCROnCommand(SetVCR setVCR){
        this.setVCR = setVCR;
    }

    @Override
    public void execute(){
        setVCR.on();
        setVCR.setChannel(23);
        setVCR.setVolume(11);
    }
    
}
