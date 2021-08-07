import java.util.*;

public class Main{

	public static String Issorted(ArrayList<Integer> arr , int size_of_array){
		
		for ( int i=1; i < size_of_array; i++){
			if(arr.get(i) < arr.get(i-1)){
				return "Unsorted";
			}
		}
		return "sorted";
	}


	public static ArrayList<Integer> generator(int value , int size_of_array){
		Random random = new Random();
		ArrayList<Integer> al= new ArrayList<Integer>();

		if (value == 0){
			
			// sorted array generation
			

			int min = 0;
			int max = 500;
			for(int i=0; i<size_of_array; i++){
				int element = random.nextInt(max - min + 1) + min;
				min = element;
				max += 10;
				al.add(element);
			}
			return al;
		}

		else{

			// Unsorted array

			for(int i=0; i<size_of_array; i++){
				al.add(random.nextInt(700));
			}
			return al; 
		}

	}

	public static void main(String args []){
		Random random = new Random();
		int size_of_array = random.nextInt(20) + 6;
		int generator_value = random.nextInt(2);
		
		ArrayList<Integer> al = generator(generator_value , size_of_array);

		System.out.print("The size of dataset: ");
		System.out.println(size_of_array);
		System.out.println("The dataset used is: ");
		System.out.println(al);
		System.out.print("The dataset is: ");
		System.out.println(Issorted(al , size_of_array));
		

	}
}