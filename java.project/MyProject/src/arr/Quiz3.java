package arr;

public class Quiz3 {
	public static void showArr(int[][] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
//		showArr(arr);
		
		int[] temp = new int[arr[0].length];
		
		for(int i=0;i<temp.length;i++) {
			temp[i] = arr[arr.length-1][i];	
		}
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = arr[i-1][j];
			}
		
		}
		for(int k=0;k<temp.length;k++) {
			arr[0][k] = temp[k];
		}
		showArr(arr);
	}
	

}
