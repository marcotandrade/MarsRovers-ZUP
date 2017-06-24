package zup.mars.rovers.model;

public class Rover {

	public String name;
	public Integer x = 0;
	public Integer y = 0;
	public String facing = "N";

	public Rover() {
	}

	public Rover(String name, Integer x, Integer y, String facing) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.facing = facing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

}
