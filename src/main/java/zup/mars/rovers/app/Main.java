package zup.mars.rovers.app;

import java.util.Scanner;

import zup.mars.rovers.model.Rover;
import zup.mars.rovers.service.RoverService;

public class Main {

	public static void main(String[] args) {
		
		Rover rover1 = new Rover();
		RoverService rservice = new RoverService();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome do Rover: ");
		rover1.setName(scanner.next());
		System.out.println("Posição inicial ajustada para : (0,0) N ");
		rover1.setFacing("N");
		rover1.setX(0);
		rover1.setY(0);
		System.out.println("Digite os comandos: ");
		rservice.command(scanner.next(), rover1);
		rservice.printPosition(rover1);
		
		
		
		
	}

}
