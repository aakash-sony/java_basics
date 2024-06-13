class StaticBlock5 {
		int x =10;
		static void m1() {
			System.out.println("StaticBlock6 : m1()");
		}
		static {
			System.out.println("StaticBlock6 : SB1 called");
		}
	}
	class StaticBlock6 extends StaticBlock5 {
		static int x =20;
		static {
			System.out.println("Test15Sub : SB1 called");
		}
		static void m2(){
			m1();
			System.out.println("Test15Sub : m2()");
		}
		public static void main(String[] args) {
			m2();
		}
	}