class Test {
	static int Break(int n) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				temp = i * n;
			}
		}
		return temp;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		int break1 = Test.Break(10);
		System.out.println(break1);
	}
}