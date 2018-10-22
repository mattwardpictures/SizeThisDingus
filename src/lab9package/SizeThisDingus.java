package lab9package;

import java.util.Scanner;

public class SizeThisDingus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("        OOOOOO        ");
		System.out.println("    OOOO      OOOO    ");
		System.out.println("  OOO            OOO  ");
		System.out.println(" oO      SIZE      Oo ");
		System.out.println("oOO                OOo");
		System.out.println("OO       THIS       OO");
		System.out.println("OO                  OO");
		System.out.println("oOO     DINGUS     OOo");
		System.out.println(" oO                Oo ");
		System.out.println("  OOO            OOO  ");
		System.out.println("    OOOO      OOOO    ");
		System.out.println("        OOOOOO        ");
		System.out.println("\n  You know, for kids!");
		System.out.println("  ==================  ");

		String continueManufacture;

		do {
			double userInput = Validator.getDouble(scan, "\nTo get the size of your dingus, please enter a radius: ");
			Circle hulaHoop = new Circle(userInput);
			System.out.println("\nFor a radius of " + userInput
					+ " your new Hula Hoop \nshall be manufactured to the following measurements:");
			System.out.println(" ");
			System.out.println(hulaHoop.toString());
			System.out.println(hulaHoop.getCompliment());
			System.out.println("\nDo you want to extrude another dingus? (y/n)");
			continueManufacture = scan.next();
		} while (continueManufacture.charAt(0) == 'y');
		System.out.println("\nExtrusion Ceasing...");
		System.out.println("So long, until next business day!");
		System.out.println("\nExtruded Plastic Dingus aka Hula Hoop \n©HUDSUCKER INDUSTRIES. ALL RIGHTS RESERVED.");
		System.out.println("============================================");
		System.out.println("50 years to get to the top, 30 seconds to come back down.");
		System.out.println("In loving memory of Waring Hudsucker---gone but not forgotten.");
	}

}
