package MainClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TripReportAvance[] name = new TripReportAvance[3];
		
		//TripReportAvance tra = new TripReportAvance(1, "125", "569", "874");
		//TripReportAvance tra1 = new TripReportAvance(21, "1225", "5269", "8274");
		
		name[0] = new TripReportAvance(1, "125", "569", "874");
		name[1] = new TripReportAvance(178, "1798925", "52135469", "86674");
		
		System.out.println(name[1].dateOfReport);
		
		
		ArrayList<TripReportAvance> list = new ArrayList<TripReportAvance>();
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).dateOfReport);
		}
		
		
		
		Scanner in = new Scanner(System.in);
        System.out.print("¬ведите им€: ");
        String name1 = in.nextLine();
        System.out.print("¬ведите им€2: ");
        String name2 = in.nextLine();
		
		System.out.println(name1 + " " + name2);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		String f;			
		do {			
			int a = list.size() + 1;
			System.out.print("String codeName");
	        String b = in.nextLine();
	        System.out.print("String dateOfReport");
	        String c = in.nextLine();
	        System.out.print("String nameOfEngineer");
	        String d = in.nextLine();
	        
	        
	        TripReportAvance tra = new TripReportAvance(a, b, c, d);
	        
	        list.add(tra);
	        
	        System.out.println(list.size());
	        
	        System.out.print("More? Y/N");
	        f = in.nextLine();
	        
		} while (f.contains("Y"));
		
		
		

	}

}
