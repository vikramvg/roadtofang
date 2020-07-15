package io.learneternal.leetcode.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Map<Integer, Boolean> numberMap = new HashMap<>();
		List<Integer> resultList = new ArrayList<>();
		int lengthOfInputArray = nums.length;
		
		for(Integer i : nums) {
			if(numberMap.get(i) == null) {
				numberMap.put(i, true);
			}
		}
		
		for(int i = 1; i < lengthOfInputArray; i++) {
			if(numberMap.get(i) == null) {
				resultList.add(i);
			}
		}
		
		return resultList;
	}
	
	public static void main(String[] args) {
		int[] inputArray = new int[]{4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(inputArray));
		inputArray = new int[]{ 4, 3, 6, 2, 1, 1 };
		System.out.println(findDisappearedNumbers(inputArray));
		inputArray = new int[]{3, 1, 3};
		System.out.println(findDisappearedNumbers(inputArray));
	}
}
