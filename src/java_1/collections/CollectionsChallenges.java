package java_1.collections;

import java.util.*;

public class CollectionsChallenges {

	public static void main(String[] args) {
//		Complete the code challenges for the following static methods

		System.out.println("findVal() Method: ");
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(7);
		findVal(4, arrList);

		System.out.println("convertArrToList() Method: ");
		Object[] arr = new Object[0];
		convertArrToList(arr);

		System.out.println("listToSet() Method: ");
		List<String> statesList = Arrays.asList("Arizona", "California", "Colorado", "Delaware", "Georgia", "New Mexico", "Texas");
		listToSet(statesList);

		System.out.println("addToList() Method: ");
		ArrayList<Integer> listy = new ArrayList<>();
		listy.add(3);
		listy.add(4);
		listy.add(5);
		listy.add(6);
		addToList(44, listy);

		System.out.println("removeFromList() Method: ");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		removeFromList(7, list);

		System.out.println("insertIntoList() Method: ");
		ArrayList<Integer> insertList = new ArrayList<>();
		insertList.add(4);
		insertList.add(5);
		insertList.add(6);
		insertList.add(7);
		insertList.add(8);
		insertIntoList(9, 10, insertList);

		System.out.println("reverseNums() Method: ");
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		reverseNums(numberList);

		System.out.println("reverseLinkedList() Method: ");
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Christopher");
		linkedList.add("Dionne");
		linkedList.add("Etta");
		linkedList.add("Fiona");
		reverseLinkedList(linkedList, true);

	}


	static Integer findVal(int val, ArrayList<Integer> arrList) {
//		find a value in the input array list.  return it if found.  If not, return 0.
		for(Integer i : arrList){
			if(val == i){
				System.out.println(i);
			}
			else{
				continue;
			}
		}
		return 0;
	}

	static List convertArrToList(Object[] array) {
//		convert the array to a list and return it.
		Object[] arr = new Object[]{"Christopher", "Mindy", "Barbara", "Whitney", "Jennifer"};
		List<Object> list = Arrays.asList(arr);
		System.out.println("The following list has been returned: " + list);
		return list;
	}

	static Set<String> listToSet(List<String> states) {
//		convert a list of US states to a set.  return the set.
		Set<String> set1 = new HashSet<>(states);
		System.out.println(set1);
		return null;
	}

	static int addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if successfully added.
		numList.add(x);
		System.out.println("The following value has been added to the list, and returned: " + x);
		return x;
	}

	static void removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
		System.out.println(numList);
		numList.removeIf(num -> num.equals(x));
		System.out.println(numList);
	}

	static int insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
		System.out.println(numList);
		if(i <= numList.size()){
			numList.add(i, x);
		}
		else{
			numList.add(numList.size(), x);
		}
		System.out.println(numList);
		return x;
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/
		System.out.println(nums);
		Collections.reverse(nums);
		System.out.println("The following list is returned and reversed: " + nums);
		return nums;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		System.out.println(linkedList);
		if(!mutate) {
			LinkedList<String> reversedList = new LinkedList<>();
			for (int i = linkedList.size() - 1; i >= 0; i--) {
				reversedList.add(linkedList.get(i));
			}
			System.out.println(reversedList);
		}
		else{
			Collections.reverse(linkedList);
			System.out.println(linkedList);
		}
		return linkedList;
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		return names;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.

		return null;
	}

}
