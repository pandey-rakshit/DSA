import java.util.*;

public class Main{

	public static int Slargest(ArrayList<Integer> arr , int size_of_array){
		int largest = 0;
		int slargest = -1;

		for(int i=0; i<size_of_array; i++){
			if(largest < arr.get(i)){
				slargest = largest;
				largest = arr.get(i);
			}
			else{
				continue;
			}
		}
		return slargest;
	}


	public static void main(String [] args){
		Random random = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int size_of_array = random.nextInt(20) + 6;
		for (int i=0; i<size_of_array; i++){
			al.add(random.nextInt(1000));
		}

		System.out.print("The size of dataset: ");
		System.out.println(size_of_array);
		System.out.println("The dataset used is: ");
		System.out.println(al);
		System.out.print("The Second Maximum in dataset is: ");
		System.out.println(Slargest(al , size_of_array));
	}
}