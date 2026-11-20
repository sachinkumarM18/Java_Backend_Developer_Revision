package com.coding.Challenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		List<Integer> productIds = List.of(101, 102, 103, 104, 102, 105, 101, 106, 103);
		Set<Integer> seen = new HashSet<Integer>();

		productIds.stream().filter(p -> !seen.add(p)).distinct().forEach(e -> System.out.println(e));
	}

}
