package lession3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
- Tạo một lớp student (id, name, age) 
- Tạo một List các student 
	1. Nhập student vào list
	2. Hiển thị danh sách 
	3. Tìm kiếm student có age < inputAge (inputAge nhập từ bàn phím), 
	4. Sắp xếp các student theo 
		age -> tăng dần 
		age -> giảm dần 
	5. Thoát 
*/
public class ex08_Compound {
	public static void main(String[] args) {
		int luaChon;
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		do {
			System.out.println("1. Nhập danh sách học sinh ");
			System.out.println("2. Hiển thị danh sách học sinh");
			System.out.println("3. Tìm kiếm student có age < inputAge");
			System.out.println("4. Sắp xếp các student theo age");
			System.out.println("5. Nhập phím khác để thoát");
			System.out.println("Mời bạn chọn : ");
			luaChon = input.nextInt();
			switch (luaChon) {
			case 1: {
				Student st = new Student();
				st.inputInfo();
				list.add(st);
				break;
			}

			case 2: {
				for (int i = 0; i < list.size(); i++) {
					list.get(i).outputInfo();
				}
				break;
			}

			case 3: {
				int inputAge;
				System.out.println("Nhập inputAge : ");
				inputAge = input.nextInt();
				System.out.println("Những sinhh viên có age < InputAge là : ");
				for (int i = 0; i < list.size(); i++) {
					if (inputAge > list.get(i).getAge()) {
						list.get(i).outputInfo();
					}
				}
				break;
			}

			case 4: {
				int chon;
				System.out.println("1. Age tăng dần ");
				System.out.println("2. Age giảm dần ");
				System.out.println("Mời chọn : ");
				chon = input.nextInt();
				if (chon == 1) {
					System.out.println("Thong tin sau khi sắp xếp theo tuổi tăng là : ");
					Collections.sort(list, new AgeComperator());
				} else if (chon == 2) {
					System.out.println("Thong tin sau khi sắp xếp theo tuổi giảm là : ");
					Collections.sort(list, new AgeDecrease());
				} else {
					System.out.println("Lựa chọn không phù hợp");
					break;
				}
				for (Student st : list) {
					System.out.println(st.getId() + "   " + st.getName() + "   " + st.getAge());
				}
				break;
			}
			default:
				System.out.println("Bạn vừa chọn thoát !");
				flag = false;
				break;
			}
		} while (flag);

	}
}
