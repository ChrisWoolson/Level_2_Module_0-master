package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> st = new ArrayList<String>();
		//2. Add five Strings to your list
		st.add("hi");
		st.add("chris");
		st.add("CE");
		st.add("StringE");
		st.add("str");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < st.size(); i++) {
			String s = st.get(i);
			System.out.println(s);
		
			
			}
		for (int i = 0; i < st.size(); i++) {
			String s = st.get(i);
			if (i%2 == 0) {
				System.out.println(s);
			}
	
		
		}
		//4. Print all the Strings using a for-each loop
		//
		//5. Print only the even numbered elements in the list.
	//
		//6. Print all the Strings in reverse order.
		for (int i = st.size()-1; i >= 0; i--) {
			String s = st.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < st.size(); i++) {
			String s = st.get(i);
			
			if(s.contains("e")) {
			System.out.println(s);;
			
			}
		
			
		}
	}
}
