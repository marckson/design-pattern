package study.Strategy;

public enum Occupation_3 {
	
	SALES {
		@Override
		public void work() {
			System.out.println("Sales working...");
			
		}
	}, PROGRAMMERS {
		@Override
		public void work() {
			System.out.println("Programmers working...");
			
		}
	}, DESIGNERS {
		@Override
		public void work() {
			System.out.println("Designers working...");
			
		}
	}, WRITERS  {
		@Override
		public void work() {
			System.out.println("Writers working...");
			
		}
	}, INTERNS {
		@Override
		public void work() {
			System.out.println("Interns working...");
			
		}
	};
	
	public abstract void work();

}
