package arr;

public class Quiz2 {
	public static void addOneDArr(int[] arr, int add) {
		for(int i=0;i<arr.length;i++) {
			arr[i] += add;
		}
	}
	
	public static void addOneDArr(int[][] arr, int add) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] += add;
			}
		}	
	}

	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,3,4,5,6,7,8};
		addOneDArr(arr1, 3);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");	
		}
		int[][] arr2 = new int[][]{{1,2,3},{4,5,6,},{7,8,9}};
		addOneDArr(arr2, 2);
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
			
	}
}
