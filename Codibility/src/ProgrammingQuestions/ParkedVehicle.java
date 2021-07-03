package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ParkedVehicle {

	public static void main(String[] args) 
	{

		List<Vehicles> list1 = new ArrayList<Vehicles>();
		List<Vehicles> list2 = new ArrayList<Vehicles>();
		
		Vehicles v1 = new Vehicles(100, "NB769", 45);
		Vehicles v2 = new Vehicles(290, "GVC502", 20);
		Vehicles v3 = new Vehicles(456, "IUH234", 30);
		Vehicles v4 = new Vehicles(789, "QAS564", 56);
		Vehicles v5 = new Vehicles(130, "WE789", 78);
		Vehicles v6 = new Vehicles(160, "SDF789", 40);
		Vehicles v7 = new Vehicles(170, "POI567", 42);
		Vehicles v8 = new Vehicles(190, "LKJ654", 90);
		Vehicles v9 = new Vehicles(134, "BG456", 90);
		Vehicles v10 = new Vehicles(123, "KJ897", 41);
		
		list1.add(v1);
		list1.add(v2);
		list1.add(v3);
		list1.add(v4);
		list1.add(v5);
		list2.add(v6);
		list2.add(v7);
		list2.add(v8);
		list2.add(v9);
		list2.add(v10);
		
		list1.addAll(0, list2);
		Vehicles highV = list1.get(0);
		for(Vehicles v : list1)
		{
			if(v.getTotalDuration() > highV.getTotalDuration())
			{
				highV = v;
			}
		}
		
		System.out.println("Highest Parked Hour Of the Vehicle:: "+highV);
		
	}

}
