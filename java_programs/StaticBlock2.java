class StaticBlock2 {
		static int a;
		
		public static void main(String[] args) {
			System.out.println(StaticBlock2.a);
			StaticBlock2.a = StaticBlock2.initialize();
			System.out.println(StaticBlock2.a);
		}

		static int initialize() {
			StaticBlock2.a = 50;
			return 60;
		}
		
	}