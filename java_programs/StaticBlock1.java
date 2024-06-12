class StaticBlock1 {
		static {
			int x = 10;
			StaticBlock1.x = x+x;
		}

		static int x;
		
		public static void main(String[] args) {
			System.out.println("Class Level X : "+StaticBlock1.x);
		}

		static {
			x = x+StaticBlock1.x;
		}
	}