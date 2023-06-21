package in.ineuron.pptAssignment17;

public class UnableToEatSandwiches_3 {
	public static int countStudents(int[] students, int[] sandwiches) {
		int[] preferenceCount = new int[2]; // Count of students preferring each type of sandwich

		for (int student : students) {
			preferenceCount[student]++;
		}

		for (int sandwich : sandwiches) {
			if (preferenceCount[sandwich] == 0) {
				break;
			}
			preferenceCount[sandwich]--;
		}

		return preferenceCount[0] + preferenceCount[1];
	}

	public static void main(String[] args) {
		int[] students = { 1, 1, 1, 0, 0, 1 };
		int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
		int unableToEat = countStudents(students, sandwiches);
		System.out.println("Number of students unable to eat: " + unableToEat);
	}
}
