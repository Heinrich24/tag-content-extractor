package com.heinrich24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * The following project will extract the content between two valid XML tags.
 */
public class MyMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			boolean matchFound = false;
			Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = r.matcher(line);

			while (m.find()) {
				System.out.println(m.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}
			testCases--;
		}
	}

}
