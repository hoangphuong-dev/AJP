package lession3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex03_ReadDataFromFile {
	public static void main(String[] args) {
		try {
			File file = new File("D:/DataForAJP/data.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = null;
//			str = br.readLine(); // đọc 1 dòng ( nếu không có trả về null)
//			System.out.println(str);
			if (file.exists()) { // kiểm tra xem file có tồn tại hay ko
				System.out.println("File name : " + file.getName());
				System.out.println("Absolute parth : " + file.getAbsolutePath());
				System.out.println("Writeable : " + file.canWrite());
				System.out.println("Readable : " + file.canRead());
				System.out.println("File size in bytes : " + file.length());
				System.out.println("Content of file : ");
				while ((str = br.readLine()) != null) { // đọc nhiều dòng
					System.out.println(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
