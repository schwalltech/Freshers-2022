package java1;

public class Array {
	
		public static void main(String[] args) {
			int arr[]= {5,50,49,51,58,15};
			for(int i=0;i < arr.length;i++) 
			{
				for(int j=i+1;j<arr.length;j++) 
				
				{
					int temp=0;
					if(arr[i]>arr[j])     //arr[i]>a[j]+1
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						System.out.println(arr);
					}
				}
				System.out.println(arr[i]);
			}
					
		}
}
