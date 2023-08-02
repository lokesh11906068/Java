package com.lumen.methodreferences;

import java.util.Arrays;
import java.util.List;

interface ICourseDetails{
	 List<String> showCourses();
}

public class MethRefConst {

	public static void main(String[] args) {
		ICourseDetails iCourseDetails=()->
		{
			return Arrays.asList("java","sql");
		};
		System.out.println(iCourseDetails.showCourses());
	
}

}