package com.tnsif.one;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 5.0;
		double y = 0.0;
		double ans;
		ans = x/y ;  //result is Infinity
		System.out.println(ans);


		x = -5.0;
		ans = x/y;  //result is -Infinity
		System.out.println(ans);


		x = 0.0;
		ans = x/y;  //result is NAN
		System.out.println(ans);

		int a = 5;
		int b = 0;
		int result = a/b;    //Throw ArithmeticException:/by zero
		System.out.println(result);


	}

}
