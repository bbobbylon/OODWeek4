package com.week3controldesignpattern.java;
public class SetVCROffCommand  implements Command{

    SetVCR setVCR;

    public SetVCROffCommand(SetVCR setVCR){
        this.setVCR = setVCR;
    }

    @Override
    public void execute(){
        setVCR.off();
    }
    
}
