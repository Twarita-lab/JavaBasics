package hackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

class DayCalculatorMethod {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		String dayOfWeek = "";
		Calendar cal = Calendar.getInstance();

		// Month in calendar object starts from 0
		
		cal.set(year, month - 1, day);
		int dayOfWeekNumber = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		dayOfWeek = days[dayOfWeekNumber - 1];
		
		System.out.println(dayOfWeek);

		return dayOfWeek;

	}

}

public class GetDayOfWeekFromGivenDate {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = DayCalculatorMethod.findDay(month, day, year);

		/*
		 * bufferedWriter.write(res); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */ }
}
