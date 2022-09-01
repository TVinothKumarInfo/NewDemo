package masi;

import java.util.ArrayList;
import java.util.HashMap;


public class UseCouples {
	public static void main(String[] args) {
		Couples c1=new Couples("Ashok","Seetha,Rani",18);
		Couples c2=new Couples("Vinoth","Divya,kaviya,Renu,Selvi",22);
		Couples c3=new Couples("Mani","Jeni",1);
		Couples c4=new Couples("Marimaran","Kavitha",3);
		Couples c5=new Couples("Kalyan","Keerthi",2);
		HashMap<String,Couples>details=new HashMap<>();
		details.put(c1.getName(), c1);details.put(c2.getName(),c2);details.put(c3.getName(), c3);
		details.put(c4.getName(), c4);details.put(c5.getName(), c5);
		for(String i:details.keySet()) {
			if(details.get(i).getNoOfLovers()==18) {
				System.err.println("Legend of Love->"+details.get(i).getName()+" future is "+details.get(i).getLoverName());
			}else if(details.get(i).getNoOfLovers()>20) {
				System.err.println("King of Love->"+details.get(i).getName()+" future is "+details.get(i).getLoverName());
			}else {
				System.out.println("Simply Waste-> "+ details.get(i).getName());
			}
		}
		ArrayList<Couples>num=new ArrayList<>();
		for(Couples a:details.values()) {
			num.add(a);
		}
		num.stream().filter(x->x.getLoverName().equalsIgnoreCase("keerthi")).forEach(y->System.out.println(y));
	}

}
