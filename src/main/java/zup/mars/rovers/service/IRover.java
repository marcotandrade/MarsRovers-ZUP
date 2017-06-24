package zup.mars.rovers.service;

import zup.mars.rovers.model.Rover;

public interface IRover {

	public void command(String command, Rover rover);
	public void spinRight(Rover rover);
	public void spinLeft(Rover rover);
	public void move(Rover rover);
	public void setPosition(Rover rover, Integer x, Integer y);	
	public void setOrientation(Rover rover,String facing);
	public void printPosition(Rover rover);
	public boolean isNumber(char str);
}
