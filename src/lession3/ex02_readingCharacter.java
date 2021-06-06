package lession3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02_readingCharacter {
	public static void main(String[] args) {
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
