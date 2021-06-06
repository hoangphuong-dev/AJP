package lession3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
TH1 : 
	- Tạo một List các số nguyên ( đọc từ file)
	- Sắp xếp các phần tử trong List theo thứ tự tăng dần 
	(Bubble sort/ innertion sort/ Qiuck sort/ Tree sort)
	- print all
*/
public class ex07_Compound {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		File file = new File("D:/DataForAJP/data6.txt");
		String str;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((str = br.readLine()) != null) {
				list.add(Integer.parseInt(str));
			}
			// in ra danh sách các phần tử trong list 
			System.out.println("Các phần tử trong list là : " + list);
			System.out.print("Các phần tử sau khi sắp xếp là : ");
			Collections.sort(list);
			for (Integer i : list) System.out.print("  " + i);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
