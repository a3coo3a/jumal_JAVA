package ex;
// 입력 예시

import java.util.Arrays;

// int[] numbers = {2,1,3,4,1};
// int[] numbers = {5,0,2,7};

public class Solution {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		int size = 0;
		int index = 0;
		for (int i = numbers.length - 1; i > 0; i--) {
			size += i;
		}
		answer = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			go :for (int j = i + 1; j < numbers.length; j++) {
				answer[index] = numbers[i] + numbers[j];
				for (int k = 0; k <= index; k++) {
					if (answer[index]) {
						continue go;
					} else {
						index++;
					} 
				}
			}
		}
		
		return answer;
	}
}
