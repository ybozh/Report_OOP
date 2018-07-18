package MainClasses;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Object[] name = new Object[10];
		
		TripReportAvance tra = new TripReportAvance(1, "125", "569", "874");
		TripReportAvance tra1 = new TripReportAvance(21, "1225", "5269", "8274");
		
		ArrayList<TripReportAvance> list = new ArrayList<TripReportAvance>();
		list.add(tra);
		list.add(tra1);
		
		
		System.out.println(list.get(0).reportId);
		System.out.println(list.get(1).reportId);
		
		
		System.out.println(list.get(0).nameOfEngineer);
		System.out.println(list.get(1).nameOfEngineer);
		

	}

}
