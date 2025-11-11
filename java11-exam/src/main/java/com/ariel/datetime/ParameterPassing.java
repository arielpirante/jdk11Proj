package com.ariel.datetime;

public class ParameterPassing {

	static void change(int[] nums) {
		nums[0] = 999;
	}

	static void reassign(int[] nums) {
		nums = new int[] { 7, 7, 7 };
	}

	static class Person {
		String name;

		Person(String name) {
			this.name = name;
		}
	}

	static void modify(Person[] people) {
		people[0].name = "Evelyn"; // changes the object it points to
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		change(arr);
		System.out.println(arr[0]);

		int[] arr2 = { 1, 2, 3 };
		reassign(arr2);
		System.out.println(arr2[0]);

		Person[] arrx = { new Person("Ariel"), new Person("Sky") };
		modify(arrx);
		System.out.println(arrx[0].name); // Evelyn
	}
}
