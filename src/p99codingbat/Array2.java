package p99codingbat;
/*
 * CodingBat - code practice
 * https://codingbat.com/java/Array-2
 */
public class Array2 {	
	public int matchUp(int[] nums1, int[] nums2) {
		int cnt = 0;
		for (int i = 0; i < nums1.length; i++) {
			int val = Math.abs(nums1[i] - nums2[i]);
			if (val <= 2 && val != 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public boolean either24(int[] nums) {
		boolean either = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i] == 2 && nums[i + 1] == 2) || (nums[i] == 4 && nums[i + 1] == 4)) {
				if (!either) {
					either = true;
				} else {
					either = false;
				}
			}
		}
		return either;
	}

	public boolean isEverywhere(int[] nums, int val) {
		boolean every = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val) {
				every = false;
			}
		}
		return every;
	}

	public boolean no14(int[] nums) {
		boolean ints = true;
		int a = 0;
		for (int num : nums) {
			if (a == 0 && (num == 1 || num == 4)) {
				a = num;
			}
			if (a == 1 && num == 4) {
				ints = false;
			}
			if (a == 4 && num == 1) {
				ints = false;
			}
		}
		return ints;
	}

	public String[] fizzArray2(int n) {
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.toString(i);
		}
		return arr;
	}

	public boolean only14(int[] nums) {
		boolean only = true;
		for (int num : nums) {
			if (num != 1 && num != 4) {
				only = false;
			}
		}
		return only;
	}

	public int[] fizzArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public boolean more14(int[] nums) {
		int a = 0;
		int b = 0;
		for (int num : nums) {
			if (num == 1) {
				a++;
			}
			if (num == 4) {
				b++;
			}
		}
		return (a > b) ? true : false;
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			if (num == 2) {
				sum += num;
			}
		}
		return sum == 8 ? true : false;
	}

	public boolean lucky13(int[] nums) {
		boolean lucky = true;
		for (int num : nums) {
			if (num == 1 || num == 3) {
				lucky = false;
			}
		}
		return lucky;
	}

	public boolean has22(int[] nums) {
		boolean has = false;
		int before = 0;
		for (int num : nums) {
			if (num == 2 && before == 2) {
				has = true;
			}
			before = num;
		}
		return has;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean stop = false;
		for (int num : nums) {
			if (num == 6) {
				stop = true;
			}
			if (!stop) {
				sum += num;
			}
			if (num == 7) {
				stop = false;
			}
		}
		return sum;
	}

	public int sum13(int[] nums) {
		int sum = 0;
		int before = 0;
		for (int num : nums) {
			if (num != 13 && before != 13) {
				sum += num;
			}
			before = num;
		}
		return sum;
	}

	public int centeredAverage(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			sum += num;
		}
		sum = sum - max - min;
		return sum / (nums.length - 2);
	}

	public int bigDiff(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		return max - min;
	}

	public int countEvens(int[] nums) {
		int cnt = 0;
		for (int num : nums) {
			if ((num % 2) == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
