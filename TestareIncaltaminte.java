import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TestareIncaltaminte {
	
	
	
	public static Incaltaminte adaugare_incaltaminte() {
		
		Scanner sc = new Scanner(System.in);
		
		
		String ID = sc.nextLine();
		String tip = sc.nextLine();
		Double marime = sc.nextDouble();
		int nrBucati = sc.nextInt();
		String model = sc.nextLine();
		
		sc.close();
		
		return new Incaltaminte(ID, tip, marime, nrBucati , model);
	}
	
	
	
	
	public static boolean NrPrim( int nr) {
		
		if(nr < 2 )
		{
			return false;
		}
		
		for( int i = 2;i*i<=nr;i++)
		{
			if(nr % i == 0)
				return false;
		}
		return true;
	}
	
	public static void customSort1( ArrayList<Incaltaminte>arr) {
		
		for(int i =0; i<arr.size();i++)
		{
			for(int j = i+1;j<arr.size();j++)
			{
				if(arr.get(i).convertIDtoInt() > arr.get(j).convertIDtoInt()){
					Incaltaminte aux;
					aux = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, aux);
					
					
				}
			}
		}
		
	}

	
	public static void customSort( ArrayList<Incaltaminte>arr) {
		
		for(int i =0; i<arr.size();i++)
		{
			for (int j = i+1;j<arr.size();j++)
			{
				if(arr.get(i).getNrBucati() > arr.get(j).getNrBucati())
				{
					Incaltaminte  aux;
					aux = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, aux);
				}
			}
		}
		
	}

		
		
	
	

	
	public static void main(String[] args) {
		
		
		Incaltaminte c1 = new Incaltaminte("123" , "air" ,40.5, 3, "Triple White");
		
		System.out.println(c1);
		
		ArrayList <Incaltaminte> shop = new ArrayList <Incaltaminte>();
		shop.add(new Incaltaminte("143" , "Air Max" ,41, 8, "97"));
		shop.add(new Incaltaminte("12233" , "AF1" ,45, 10, "Triple White"));
		shop.add(new Incaltaminte("1786" , "Air Max" ,40.5, 1, "95"));
		shop.add(new Incaltaminte("122" , "Jordan" ,44.5, 23, "Air Jordan 1"));
		shop.add(new Incaltaminte("17" , "AF1" ,39.5, 17, "Mid"));
		shop.add(new Incaltaminte("13" , "Jordan" ,37, 7, "Retro 4"));
		
		for(int i=0;i<shop.size();i++)
			System.out.println(shop.get(i));
		
		System.out.println(" ");
		
		System.out.println("Incaltamintea cu ID urile nr prime");
		for(int i =0 ;i<shop.size();i++) {
			if(NrPrim(shop.get(i).convertIDtoInt())) {
				
				System.out.println(shop.get(i));
			}
		
		
		}
		System.out.println(" ");
		
		System.out.println("Incaltamintea cu Marimea cu numerele prime: ");
		
		for(int i = 0;i<shop.size();i++)
		{
			if(NrPrim(shop.get(i).getNrBucati()))
			{
				System.out.println(shop.get(i));
			}
			
		
			
			
		}
		
		System.out.println(" ");
		
		//Sortarea dupa nr de buc
		
		System.out.println("Sortarea dupa nr de bucati este: ");
		
		Collections.sort(shop, new ComparatorcuNrBucati ());
		
		for(int i = 0 ;i<shop.size();i++)
		{
			System.out.println(shop.get(i));
		}
		
		
		System.out.println(" ");
		
		System.out.println("Sortarea dupa id este: ");
		
		Collections.sort(shop, new ComparareID ());
		
		for(int i = 0;i<shop.size();i++){
			
			System.out.println(shop.get(i));
		}

		
		System.out.println("Adaugare incaltaminte in magazin: ");
		
		Incaltaminte c3 = adaugare_incaltaminte();
		
		System.out.println(c3);

	}
}
		
		
		

		
		
	

