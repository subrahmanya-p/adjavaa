package recursionn;

public class parameterrized {
	public static void sum(int i, int sum) {
		if (i < 1) {
			System.out.println(sum);
		}

		sum(i - 1, sum + i);

	}

	public static void main(String[] args) {

	}
}
