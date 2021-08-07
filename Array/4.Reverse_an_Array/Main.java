import java.util.*;

public class Main{

	public static ArrayList<Integer> Rarray(ArrayList<Integer> arr , int size_of_array){
		int max = size_of_array-1;
		for(int i=0; i<size_of_array/2; i++){
			int temp = arr.get(max);
			arr.set(max, arr.get(i));
			arr.set(i , temp);
			max -= 1;

		}
		return arr;
	}


	public static void main(String args []){
		Random random = new Random();
		int size_of_array = random.nextInt(20) + 6;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<size_of_array; i++){
			al.add(random.nextInt(1000));
		}
		
		System.out.print("The size of dataset: ");
		System.out.println(size_of_array);
		System.out.println("The dataset used is: ");
		System.out.println(al);
		System.out.println("The Reverse of dataset is: ");
		System.out.println(Rarray(al , size_of_array));
	
	}
}