package com.class11;

public class TwoDimensionalArrayTasks {

	public static void main(String[] args) {
		// 1.
		// Mr, Mrs, Ms, Miss
		// Smith, Jordan, Jackson, Obama.
		//output: Mrs Smith, Mr Obama, Ms Jackson
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		System.out.println(names[0][1]+" "+names[1][0]); 
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		
		//2. first row: 4 names, second row: grades.
		// print out student who have A and B grades
		int i;
		
		String[][] students= {
				{"Adrian", "Fabi", "Anastasia", "Denis"},
				{"C", "B", "A", "A"}
		};
		System.out.println(students[0][1]+" "+students[0][2]+" "+students[0][3]);
		for(i=0; i<=3; i++) {
			if(students[1][i].equals("A")||students[1][i].equals("B")){
				System.out.println(students[0][i]);
			}

	}
	}
}
