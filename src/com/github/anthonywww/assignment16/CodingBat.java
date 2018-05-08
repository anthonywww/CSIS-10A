package com.github.anthonywww.assignment16;

public class CodingBat {

	public int[] maxEnd3(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[0] > max) {
				max = nums[0];
			}
			if (nums[nums.length - 1] > max) {
				max = nums[nums.length - 1];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = max;
		}
		return nums;
	}

	public int[] swapEnds(int[] nums) {
		int temp = 0;
		temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}

	public int[] withoutTen(int[] nums) {
		// assuming jvm will initialize with 0's
		int[] newArray = new int[nums.length];
		int nextVal = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				newArray[nextVal] = nums[i];
				nextVal++;
			}
		}
		return newArray;
	}

}
