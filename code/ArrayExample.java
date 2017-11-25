class ArrayExample{
	public static void main(String[] args){
		int[] x = {10,20,30,40,40};
		
		int sum = 0;
		
		for(int i =0; i<x.length; i++){
			sum = sum + x[i];
		}
		System.out.println("Sum of the elements in the array : "+sum);
		
		System.out.println("even position");
		for(int i =0; i<x.length; i+=2){
			sum = sum + x[i];
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\nodd position");
		for(int i =1; i<x.length; i+=2){
			sum = sum + x[i];
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\nreverse");
		for(int i =x.length-1; i>=0; i--){
			System.out.print(x[i]+" ");
		}
		
		
	}
}
