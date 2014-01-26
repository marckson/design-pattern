package study.Strategy;

public class Test_2 {
	
	public static void main(String[] args) {
		work (Occupation_1.WRITERS);
	}
	
	private static void work (Occupation_1 occupation) {
		switch (occupation) {
		case DESIGNERS:
			System.out.println("Designers working...");
			break;
		case INTERNS:
			System.out.println("Interns working...");
			break;
		case SALES:
			System.out.println("Sales working...");
			break;
		case WRITERS:
			System.out.println("Writers working...");
			break;
		case PROGRAMMERS:
			System.out.println("Programmers working...");
			break;
		default:
			break;
		}
		
	
	}

}
