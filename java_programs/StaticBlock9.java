class StaticBlock9 {
		static int a = 50;

		public static void main(String[] args) {
			int a = 60;

			a = a;

			System.out.println(a);
			System.out.println(StaticBlock9.a); 
		}
	}