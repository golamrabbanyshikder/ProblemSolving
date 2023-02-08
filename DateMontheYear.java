package java_row_code;

import java.util.Scanner;

public class DateMontheYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String data = input.next();
		String date, mon, yr = null;
		
		if (data.length() == 7) {

			String cenCount = data.substring(0, 1);
			
			String cen = null;
			mon = (data.substring(3, 5));
			date = (data.substring(5, data.length()));
			
			if (cenCount.equals("1")) {
				cen = "20";
			} else if (cenCount.equals("0")) {
				cen = "19";
			}
			
			yr = cen + data.substring(1, 3);
			
			System.out.printf("%s-%s-%s", date, mon, yr);
			
		} else if (data.length() == 6) {
			yr = "19" + data.substring(0, 2);
			mon = (data.substring(2, 4));
			date = (data.substring(4, data.length()));
			System.out.printf("%s-%s-%s", date, mon, yr);
		}

		input.close();
	}
}