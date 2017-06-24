package zup.mars.rovers.model.test;

import org.junit.Test;

import junit.framework.Assert;
import zup.mars.rovers.model.Rover;
import zup.mars.rovers.service.RoverService;

@SuppressWarnings("deprecation")
public class RoverTest {

	@Test
	public void testRoverMovement() {
		Rover testRover1 = new Rover("Zup 1", 0, 0, "N");
		RoverService rservice = new RoverService();
		
		rservice.command("5512NLMLMLMLMM", testRover1);
		
		Assert.assertEquals("N", testRover1.getFacing());
		Assert.assertEquals("1", testRover1.getX().toString());
		Assert.assertEquals("3", testRover1.getY().toString());
		
		
		Rover testRover2 = new Rover("Zup 2", 0, 0, "N");
		rservice.command("33EMMRMMRMRRM", testRover2);
		
		Assert.assertEquals("E", testRover2.getFacing());
		Assert.assertEquals("5", testRover2.getX().toString());
		Assert.assertEquals("1", testRover2.getY().toString());
		

	}

}
