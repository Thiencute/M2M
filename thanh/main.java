import java.util.HashMap;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.print("Nhap chuoi: ");
		String input = sc.nextLine();
		Integer count = 0;
		
		HashMap<String, Integer> data = new HashMap<>();
		// Bài 1
		for (int i = 0; i < input.length(); i++) {
			if (data.containsKey(Character.toString(input.charAt(i)))) {
				int tmp = data.get(Character.toString(input.charAt(i)));
				data.put(Character.toString(input.charAt(i)), tmp + 1);
			}
			else {
				data.put(Character.toString(input.charAt(i)), 1);
			}
		}
		//Bài 2
		for (int i = 0; i < input.length(); i++) {
			if ((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90) {
				if (!data.containsKey(Character.toString(input.charAt(i)))) {
					data.put(Character.toString(input.charAt(i)), 1);
				}
				count++;
			}
		}
	
		for (String key : data.keySet()) {
			System.out.print("Bai 1: " + data.get(key) + key + " ");
			System.out.print("Bai 2: " + count + key);
	    }
		
	}
}
