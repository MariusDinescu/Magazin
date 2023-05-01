import java.util.Comparator;


public class ComparareID  implements Comparator <Incaltaminte> {
	
	
	public int compare (Incaltaminte o1,Incaltaminte o2) {
		 
		if(o1.convertIDtoInt()>o2.convertIDtoInt())
			return 1;
		if(o1.convertIDtoInt()<o2.convertIDtoInt())
			return -1;
		
		return 0;
		
	}

}
