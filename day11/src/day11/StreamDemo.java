package day11;
import java.util.ArrayList;
import java.util.function.Consumer;
public class StreamDemo {

	public static void main(String[] args) {


		ArrayList<String> namelist = new ArrayList<>();  //initial capacity 10
		namelist.add("Raju"); // 0
		namelist.add("Raki"); // 1
		namelist.add("bala"); // 2
		 // 2
		
	namelist.forEach(name->{ System.out.println(name);});
	System.out.println();
	System.out.println("starting with letter r which contain 4 lettwrs");
		namelist.stream()
			.filter(name->name.contains("R") || name.contains("r"))
				.forEach(name->{
					if(name.length()>4)
						
				System.out.println(name);
				});
		
		
	
				
	}

}