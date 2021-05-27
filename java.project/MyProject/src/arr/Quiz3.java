package arr;

public class Quiz3 {
	static void showArr(int[][] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	static int[][] moveArr(int[][] arr) {
		int[] tmp = arr[arr[0].length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = tmp;
		return arr;
	}
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		showArr(arr);
		System.out.println();
		
		moveArr(arr);
		showArr(arr);
	}
	

}
