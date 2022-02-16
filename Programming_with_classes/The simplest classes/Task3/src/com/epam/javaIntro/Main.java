package com.epam.javaIntro;

/*
 * 3.Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *   Создайте массив из десяти элементов такого типа.
 *   Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Student[] students = new Student[] {
				new Student("Petrov A.B.", 1, new int[] {5, 7, 5, 8, 9}),
				new Student("Ivanov A.F.", 2, new int[] {8, 9, 8, 10, 9}),
				new Student("Kovalev O.A.", 2, new int[] {9, 9, 10, 9, 10}),
				new Student("Kovalev K.A.", 1, new int[] {8, 9, 9, 10, 9}),
				new Student("Melnikov A.A.", 1, new int[] {6, 8, 9, 9, 6}),
				new Student("Kasperov S.O.", 2, new int[] {9, 9, 9, 9, 9}),
				new Student("Holad I.A.", 1, new int[] {5, 4, 3, 5, 6}),
				new Student("Kazmerchuk V.L.", 2, new int[] {10, 9, 10, 9, 10}),
				new Student("Bohonko R.A.", 2, new int[] {9, 9, 9, 9, 8}),
				new Student("Lazarenko N.M.", 1, new int[] {7, 9, 10, 10, 10})
		};
		
		printExcellentStudents(students);
	}	
	
	
	public static void printExcellentStudents(Student[] students) {
		
		for (Student student : students) {
			boolean isExcellent = true;
			for (int mark : student.getMarks()) {
				if (mark < 9) {
					isExcellent = false;
					break;
				}
			}
			if (isExcellent) {
				System.out.println(student.getName() + " from group is " +
														student.getGroup());
			}
		}
	}

}
