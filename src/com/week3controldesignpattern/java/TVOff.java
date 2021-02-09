package com.week3controldesignpattern.java;

public class TVOff implements Command{
	TV tv;
	public TVOff(TV tv) {this.tv = tv;}
	public void execute() {tv.off();}

}
