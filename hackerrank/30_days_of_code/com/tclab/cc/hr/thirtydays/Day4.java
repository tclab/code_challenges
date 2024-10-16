package com.tclab.cc.hr.thirtydays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-class-vs-instance/problem
public class Day4 {

	public static class Person4 {
		private int age;

		public Person4(int initialAge) {
			if(initialAge >= 0 ){
				this.age = initialAge;
			} else {
				System.out.println("Age is not valid, setting age to 0.");
				this.age = 0;
			}
		}

		public void amIOld() {
			String result = "";
			if(age < 13){
				result = "You are young.";
			} else if( age>=13 && age<18){
				result = "You are a teenager.";
			} else {
				result = "You are old.";
			}

			System.out.println(result);
		}

		public void yearPasses() {
			age++;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Person4 p = new Person4(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
			}
			sc.close();
		}
	}

}


