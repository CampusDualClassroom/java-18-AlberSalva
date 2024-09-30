package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		int value = com.campusdual.util.Utils.integer();
		int[] array = createAndInitializeArray(value);
		showInlineArray(array);
	}
	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = (i + 1);
		}
		return intArray;
	}

	public static void showInlineArray(int[] array) {
		StringBuilder arrString = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			arrString.append(array[i]);
			if (array.length - i > 1) {
				arrString.append(" ");
			}

		}
		System.out.println(arrString);
	}

}
