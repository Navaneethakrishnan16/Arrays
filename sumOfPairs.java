public class SumOfPairs {

	public static void main(String[] args) {
	
	int arr[]= {7,2,3,1,8,4,9}, sum=10;
	
	for(int i =0 ;i<arr.length;i++) {
	
		for(int j = i+1;j<arr.length;j++) {
		
			int temp = arr[i]+arr[j];
			
			if(temp == sum) {
			
				System.out.println(arr[i] + ","+ arr[j]);
			}
		}
	}
}
}