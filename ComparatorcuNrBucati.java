import java.util.Comparator;

public class ComparatorcuNrBucati implements Comparator<Incaltaminte> {
	
	
	public int compare(Incaltaminte o1, Incaltaminte o2) {
		if(o1.getNrBucati()>o2.getNrBucati())
			return 1;
		if(o1.getNrBucati() < o2.getNrBucati())
			return -1;
		
		return 0;
		
	}

	
}
	
