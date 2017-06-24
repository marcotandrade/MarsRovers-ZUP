package zup.mars.rovers.service;

import zup.mars.rovers.model.Rover;

public class RoverService implements IRover {

	public void command(String command, Rover rover) {

		for (int i = 0; i < command.length(); i++) {

			boolean number = isNumber(command.charAt(i));
				
			if (number) {
				rover.setX(Integer.valueOf(command.substring(i, i + 1)));
				i++;
				rover.setY(Integer.valueOf(command.substring(i, i + 1)));

			} else if (!number) {
				switch (command.substring(i, i + 1)) {
				case "L":
					spinLeft(rover);
					break;
				case "R":
					spinRight(rover);
					break;
				case "M":
					move(rover);
					break;
				case "N":
					setOrientation(rover, "N");
					break;
				case "S":
					setOrientation(rover, "S");
					break;
				case "W":
					setOrientation(rover, "W");
					break;
				case "E":
					setOrientation(rover, "E");
					break;

				default:
					System.out.println("ok");
				}

			}

		}

	}

	public void spinRight(Rover rover) {

		switch (rover.getFacing()) {
		case "N":
			setOrientation(rover, "E");
			break;
		case "E":
			setOrientation(rover, "S");
			break;
		case "S":
			setOrientation(rover, "W");
			break;
		case "W":
			setOrientation(rover, "N");
			break;
		}

	}

	public void spinLeft(Rover rover) {

		switch (rover.getFacing()) {
		case "N":
			setOrientation(rover, "W");
			break;
		case "W":
			setOrientation(rover, "S");
			break;
		case "S":
			setOrientation(rover, "E");
			break;
		case "E":
			setOrientation(rover, "N");
			break;
		}

	}

	public void move(Rover rover) {
		switch (rover.getFacing()) {
		case "N":
			rover.setY(rover.getY() + 1);
			break;
		case "W":
			rover.setX(rover.getX() - 1);
			break;
		case "S":
			rover.setY(rover.getY() - 1);
			break;
		case "E":
			rover.setX(rover.getX() + 1);
			break;
		}

	}

	public void setPosition(Rover rover, Integer x, Integer y) {
		rover.setX(x);
		rover.setY(y);

	}

	public void setOrientation(Rover rover, String facing) {
		rover.setFacing(facing);

	}

	public void printPosition(Rover rover) {
		System.out.println("Rover: " + rover.getName());
		System.out.println(" Current Position: (" + rover.getX() + "," + rover.getY() + ")" + rover.getFacing());
	}

	public boolean isNumber(char ch) {
		boolean isNumber = true;
		isNumber = Character.isDigit(ch);
		return isNumber;
	}
}
