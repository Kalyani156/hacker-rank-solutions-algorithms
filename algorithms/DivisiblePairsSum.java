import java.util.Scanner;

public class DivisiblePairsSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && i < j) {
					if ((arr[i] + arr[j]) % k == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
