class StaticBlock3 {
		static int x = StaticBlock3.m1();

		public static void main(String[] args) {
			System.out.println(StaticBlock3.x);
		}

		static int m1() {
			StaticBlock3.x = 10;

			return StaticBlock3.m2();
		}

		static int m2() {
			System.out.println(StaticBlock3.x);
			return 20;
		}
	}