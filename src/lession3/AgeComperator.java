package lession3;

import java.util.*;

public class AgeComperator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}
}