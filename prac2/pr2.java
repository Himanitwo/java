package prac2;

public class pr2 {
	static void bsort(int[]arr) {
		int n=arr.length;
		int temp = 0;
			for (int i=0;i<n;i++) {
				for(int j=1;j<(n-i);j++) {
					if(arr[j-1]>arr[j]) {
						//swap elements
						temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
	}

public static void main(String[]args) {
	int arr[]= {5,61,35,2,45,11,1};
	System.out.println("array before bubble sort"); 
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"");
	}
	System.out.println();
	bsort(arr);
	System.out.println("array after bsort");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"");
	}
}
}