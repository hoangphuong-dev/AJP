package lession3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 - Nhập n phần tử của mảng  
 - Ghi n và (n phần tử mảng vào file name : data3.txt)
 - Đọc dữ liệu từ file -> đưa vào mảng 
 - Sắp xếp mảng theo thứ tự tăng dần -> in mảng sau sắp xếp 
 */

public class ex05_Compound {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu cua mang : ");
		n = input.nextInt();
		int arr [] = new int[n];
		inputArr(arr, n); // gọi đến hàm nhập dữ liệu
		
		File file = new File("D:/DataForAJP/data3.txt");
		file.delete();
		try {
			file.createNewFile();
			// ghi dữ liệu vào file
			String str = String.valueOf(n) + "\n";
			FileWriter fw = new FileWriter(file);
			fw.write(str);
			for(int i = 0; i < arr.length; i++) {
				str = String.valueOf(arr[i]) + "\n";
				fw.write(str);
			}
			fw.close();
			// đọc dữ liệu từ file đưa vào mảng 
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			int so_phan_tu = ((st = br.readLine()) != null)? Integer.parseInt(st) : 0;
			int arr1 [] = new int[so_phan_tu];
			for(int i = 0; i < arr1.length; i++) {
				st = br.readLine();
				arr1[i] = Integer.parseInt(st);
			}
			System.out.println("Các phần tử của mảng là : ");
			outputArr(arr1, so_phan_tu);
			// sắp xếp các phần tử của mảng
			int temp = arr1[0];
	        for (int i = 0 ; i < arr1.length - 1; i++) {
	            for (int j = i + 1; j < arr1.length; j++) {
	                if (arr1[i] > arr1[j]) {
	                    temp = arr1[j];
	                    arr1[j] = arr1[i];
	                    arr1[i] = temp;
	                }
	            }
			}
			System.out.println("\nCác phần tử sau khi sắp xếp là : ");
			outputArr(arr1, so_phan_tu);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end main
	
	static void inputArr(int array[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Nhập array[%d] : " , (i+1));
			array[i] = input.nextInt();
		}
	}
	static void outputArr(int array[], int n) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%4d" , array[i]);
		}
	}
	

}
