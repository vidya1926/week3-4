package assignmentcodesweek3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesfromSentence {

	
		String text = "We learn java basics as part of java sessions in java week1 sessions";
		String[] str = text.split(" ");
		
		public void learnset() {
			
			Set<String> setsStr= new LinkedHashSet<String>();			
		   for(String s:str)			
					{
			setsStr.add(s);
		      }
		System.out.println("The sentence without duplication : " +setsStr);
		}
		
		
		
		
		
		
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		public void list() {
		for (int i = 0; i < str.length; i++) {
			if (list1.contains(str[i])) {
				list2.add(str[i]);
			} 
			else {
				list1.add(str[i]);
			}
		 }
	
		System.out.println("String using list : "+ list1);
		
		}
						
		
		public static void main(String[] args) {
			DuplicatesfromSentence ob=new DuplicatesfromSentence();
			ob.list();
			ob.learnset();
}
}