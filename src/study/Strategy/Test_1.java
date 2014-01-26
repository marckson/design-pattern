package study.Strategy;

public class Test_1 {
	
	public static void main(String[] args) {
		work (Occupation_1.PROGRAMMERS);
	}
	
	private static void work (Occupation_1 occupation) {
		if (occupation.equals(Occupation_1.DESIGNERS)){
			System.out.println("Designers working...");
		}else if (occupation.equals(Occupation_1.INTERNS)){
					System.out.println("Interns working...");
			  }else if (occupation.equals(Occupation_1.PROGRAMMERS)){
				  		 System.out.println("Programmers working...");
			  		} else if (occupation.equals(Occupation_1.SALES)){
			  					System.out.println("Sales working...");
			  			   } else if (occupation.equals(Occupation_1.WRITERS)){
			  				   			System.out.println("Writers working...");
			  			   		  }
	}

}
