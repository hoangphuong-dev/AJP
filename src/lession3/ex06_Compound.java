package lession3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
- Nhập n phần tử của mảng  
- Ghi n và (n phần tử mảng vào file name : data3.txt)
- Đọc dữ liệu từ file -> đưa vào mảng ArrayList
- Sắp xếp mảng theo thứ tự tăng dần -> in mảng sau sắp xếp 
*/
public class ex06_Compound {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập phần tử cảu mảng : ");
		int n = input.nextInt();
		File file = new File("D:/DataForAJP/data5.txt");
		file.delete();
		try {
			file.createNewFile();
			String str = String.valueOf(n) + "\n";
			FileWriter fw = new FileWriter(file);
			fw.write(str);

			int arr[] = new int[n];
			inputArr(arr, n);

			for (int i = 0; i < arr.length; i++) {
				str = String.valueOf(arr[i]) + "\n";
				fw.write(str);
			}
			System.out.println("Writen Success ... ");
			fw.close();

			BufferedReader br = new BufferedReader(new FileReader(file));
			String bt;
			ArrayList<Integer> arl = new ArrayList<>();
			while ((bt = br.readLine()) != null) {
				arl.add(Integer.parseInt(bt));
			}
			arl.remove(0);
			System.out.println("Các phần tử của mảng : ");
			System.out.println(arl);
			// sắp xếp mảng tăng dần
			arl.sort((o1, o2) -> o1 - o2);
			System.out.println("Mảng sau khi sắp xếp là : ");
			System.out.println(arl);
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end main

	static void inputArr(int arr[], int n) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = ", (i + 1));
			arr[i] = input.nextInt();
		}
	}
}
