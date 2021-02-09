package com.week3controldesignpattern.java;
public class User {
    public static void main(String[] args){
        RemoteControl remote = new RemoteControl();//remote 
        SetVCR setVCR = new SetVCR();
        TV tv = new TV();
        //SetVCROnCommand setVCROnCommand = new SetVCROnCommand();
       

        
        
        
        
        //for some reason, the VCRCommands are throwing a Syntax error, type annotations are illegal here error
        
        
        
        
        
        remote.setCommand(new SetVCROnCommand (setVCR));
        remote.pressButton();
        
      // remote.setCommand(new SetVCROffCommand setVCR);
        
        
        
        
        
        remote.setCommand(new TVOn(tv));
        remote.pressButton();
        
        
        remote.setCommand(new TVOff(tv));
        remote.pressButton();
    }

   
}
