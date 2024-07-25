package linkedList;

public class BinaryToDecimalExample {

	public static void main(String[] args) {

		// ---------------
		// Convert 1011 to 11
		// ---------------
		BinaryToDecimal list1 = new BinaryToDecimal(1);
		list1.append(0);
		list1.append(1);
		list1.append(1);
		System.out.println("Convert 1011 to 11:");
		System.out.println("Input: 1 -> 0 -> 1 -> 1");
		System.out.println("Output: " + list1.binaryToDecimal());
		System.out.println("---------------");

		// ---------------
		// Convert 1100 to 12
		// ---------------
		BinaryToDecimal list2 = new BinaryToDecimal(1);
		list2.append(1);
		list2.append(0);
		list2.append(0);
		System.out.println("Convert 1100 to 12:");
		System.out.println("Input: 1 -> 1 -> 0 -> 0");
		System.out.println("Output: " + list2.binaryToDecimal());
		System.out.println("---------------");

		// ---------------
		// Convert 1 to 1
		// ---------------
		BinaryToDecimal list3 = new BinaryToDecimal(1);
		System.out.println("Convert 1 to 1:");
		System.out.println("Input: 1");
		System.out.println("Output: " + list3.binaryToDecimal());
		System.out.println("---------------");

		// ---------------
		// Convert empty list to 0
		// ---------------
		BinaryToDecimal list4 = new BinaryToDecimal(0);
		list4.makeEmpty();
		System.out.println("Convert empty list to 0:");
		System.out.println("Input: empty");
		System.out.println("Output: " + list4.binaryToDecimal());
		System.out.println("---------------");
	}
}
