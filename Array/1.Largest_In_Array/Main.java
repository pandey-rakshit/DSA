import java.util.*;
class Main{
	
	public static int largest(ArrayList<Integer> arr, int size_of_array){

		int max = 0;
				
		for(int i=0; i<size_of_array; i++){
			if(max < arr.get(i)){
				max = arr.get(i);
			}
			else{
				continue;
			}

		}
		return max;		
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
		System.out.print("The Maximum in dataset is: ");
		System.out.println(largest(al , size_of_array));





	}
}