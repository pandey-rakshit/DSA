import java.util.*;
public class Main{

	public static ArrayList<Integer> Rduplicate(ArrayList<Integer> arr){

		for(int i=1; i<arr.size(); i++){
			if(arr.get(i) == arr.get(i-1)){
				arr.remove(i);
				i=i-1;
			}
		}
		return arr;	
	}

	public static void main(String args []){
		Random random = new Random();
		int size_of_array = random.nextInt(15) + 6;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int min = 0;
		int max = size_of_array;
		for(int i=0; i<size_of_array; i++){
			int element = random.nextInt(max - min + 1 ) + min;
			al.add(element);
			min = element;
			max += 2; 
		}

		System.out.print("The size of dataset: ");
		System.out.println(size_of_array);
		System.out.println("The dataset used is: ");
		System.out.println(al);
		al = Rduplicate(al);
		System.out.println("The Size of dataset after removing Duplicates");
		System.out.println(al.size());
		System.out.println("The dataset after removing Duplicates: ");
		System.out.println(al);
	
	}
}