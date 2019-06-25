
public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Project 3: CharSet");
		System.out.println("By Mai Pham\n");
		
		//ORIGINAL TEST CASES BY PROF.T.VO
		CharSet s1, s2, s3, s4, s5;
		String values = "abc";
		s1 = new CharSet(); 							// s1 is an empty set, {}
		s2 = new CharSet('a'); 						// s2 is now {a}
		s1.insert('b'); 								// s1 is now {b}
		s3 = new CharSet(values); 					// s3 is now {abc}
		s3 = s1.clone(); 							// s3 is now {b}
		s4 = s1.union(s2); 							// s4 is now {ab} and s1 is still {b}
		s1.insert('B'); 								// s1 is now {Bb}
		s4.insert('8'); 								// s4 is now {8ab}
		s4.remove('b'); 								// s4 is now {8a}
		s5 = s4; 									// s5 references s4
		System.out.println("s5: " + s5); 			// s5: {8a}
		System.out.println(s5.size()); 				// output 2
		System.out.println(s3.subset(s4)); 			// output false
		System.out.println(s2.subset(s4)); 			// output true
		s5.clear(); 									// s4 and s5 both reference same empty set, {}
		char c = (char)227; 							// character for PI
		s1.insert(c); 								// invalid element so ignore, s1 is still {b}
		s1.remove(c); 								// invalid element so ignore, s1 is still {b}
		System.out.println("s1: " + s1); 			// s1: {Bb}
		System.out.println("s2: " + s2); 			// s2: {a}
		System.out.println("s3: " + s3); 			// s3: {b}
		System.out.println("s4: " + s4); 			// s4: {}
		System.out.println("s5: " + s5); 			// s5: {}
		
		//EXTRA CREDIT 2 & additional test cases
		CharSet s6 = new CharSet("abcdefg");
		CharSet s7 = new CharSet("mnopqstruv");
		CharSet s8 = new CharSet("def");
		System.out.println("s6: " + s6); 			
		System.out.println("s7: " + s7); 			
		System.out.println("s8: " + s8); 	
		System.out.println("The largest CharSet is: " + Compare3.largest(s6, s7, s8));
		
		System.out.println(s2.equal(s3));			// output false
		System.out.println(s4.equal(s5));			// output true
		System.out.println(s3.superset(s1)); 		// output false
		System.out.println(s6.superset(s8)); 		// output true
		
		System.out.println(s6.isElement('t'));		// output false
		System.out.println(s7.isElement('t'));		// output true
		System.out.println(s6.intersection(s8));		// output {def}
	}

}
