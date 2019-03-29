package com.Class12;

public class ForEach2D {

	public static void main(String[] args) {
		// create grocery list: fruits, vegetables, dairy. 
		// retrieve value using 2 different ways
		
		String[][] grocery= {
				{"bananas", "apples", "oranges", "kiwi"},
				{"cucumbers", "tomatoes", "kale", "carrots"},
				{"milk", "cheese", "yogurt", "butter"}
		};
		for(String[] singleArray:grocery) {
			for(String list:singleArray) {
				System.out.println(list);
			}
		}
		for(int i=0; i<grocery.length; i++) {
			for (int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j]+" ");
			}
			System.out.println();
		}

}
}
