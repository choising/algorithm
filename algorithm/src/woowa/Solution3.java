package woowa;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Solution3 {

	public int solution(int[] A, int[] B, int M, int X, int Y) {
		// write your code in Java SE 8
		int count = 0;

		List<Person> people = new ArrayList<>();
		createPeople(A, B, people);

		List<Person> inElevator = new ArrayList<>();

		while (!people.isEmpty()) {
			Person p = people.get(0);
			inElevator.add(p);
			if (!check(inElevator, X, Y)) {
				inElevator.remove(p);
				count += run(inElevator);
			} else {
				people.remove(p);
			}
		}

		if (!inElevator.isEmpty())
			count += run(inElevator);

		return count;
	}

	private void createPeople(int[] A, int[] B, List<Person> people) {
		for (int i = 0; i < A.length; i++) {
			people.add(new Person(A[i], B[i]));
		}
	}

	private int run(List<Person> inElevator) {
		int count = 0;
		Set<Integer> visit = new HashSet<>();
		for (Person passenger : inElevator) {
			visit.add(passenger.getDestination());
		}
		count += visit.size();
		count += 1;

		inElevator.clear();
		return count;
	}

	private boolean check(List<Person> people, int X, int Y) {
		return checkCount(people, X) && checkWeight(people, Y);
	}

	private boolean checkCount(List<Person> people, int limit) {
		return people.size() <= limit;
	}

	private boolean checkWeight(List<Person> people, int limit) {
		int sum = 0;
		for (Person p : people) {
			sum += p.getWeight();
			if (sum > limit)
				return false;
		}
		return true;
	}
	
	@Test
	public void test() {
		int a = 1000000000;
		System.out.println(a);
	}
}

class Person {
	private int weight;
	private int destination;

	public Person(int weight, int destination) {
		this.weight = weight;
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public int getDestination() {
		return destination;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", destination=" + destination + "]";
	}
}
