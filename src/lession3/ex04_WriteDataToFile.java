package lession3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex04_WriteDataToFile {
	public static void main(String[] args) {
		File file = new File("D:/DataForAJP/data2.txt");
		file.delete(); // nếu có thì xoá file 
		try {
			file.createNewFile(); // tạo một file mới
			String str = "Đay là chuỗi sau khi ghi vào file";
			FileWriter fw = new FileWriter(file);
			fw.write(str);
			str = "\nĐây là chuỗi thứ hai";
			fw.write(str);
			
			System.out.printf("Written in %s " , file.getName());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
