	class StaticBlock4 {
		static int x = m1();

		public static void main(String[] args) {
			System.out.println(StaticBlock4.x);
		}

		static {
			System.out.println(x);
			StaticBlock4.x = x+20;
		}

		static int m1() {
			StaticBlock4.x = 50;
			return m2();		
		} 

		static int m2() {
			System.out.println(StaticBlock4.x);
			return 100;
		}
	}