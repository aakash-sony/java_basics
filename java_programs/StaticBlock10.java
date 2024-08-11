class StaticBlock10 {
		static {
			StaticBlock10.a = m1();
		}

		static int a = 50;

		public static void main(String[] args) {
			System.out.println(a);
		}

		static {
			StaticBlock10.a = StaticBlock10.a+m1();
		}

		static int m1() {
			StaticBlock10.a = 30;
			return m2();
		}

		static int m2() {
			System.out.println(a);
			return StaticBlock10.a+20;
		}
	}