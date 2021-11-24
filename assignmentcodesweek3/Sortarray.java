package assignmentcodesweek3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortarray {

	public static void main(String[] args) {
List<String> company=new ArrayList<String>();
company.add("Wipro");
company.add("TCS");
company.add("HCL");
company.add("Aspire Systems");

System.out.println(company);
Collections.reverse(company);
System.out.println(company);
}
}