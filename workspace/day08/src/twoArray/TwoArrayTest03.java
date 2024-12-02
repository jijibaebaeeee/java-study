package twoArray;

public class TwoArrayTest03 {
	public static void main(String[] args) {
	      //1      2      3      4
	      //5      6      7      8
	      //9      10      11      12

	      //1. 값 넣고 각 값을 출력하기 ar1
	      int[][] ar1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
	      
	      // (1) for문으로 출력
	      for(int i = 0; i < ar1.length; i++) {
	    	  for(int j = 0; j < ar1[i].length; j++) {
	    		  System.out.printf("%d\t",ar1[i][j]);
	    	  }
	    	  System.out.println();
	      }
	      
	      // (2) for-each문으로 출력
	      for(int[] data : ar1) {
	    	  for(int data1 : data) {
	    		  System.out.print(data1 + "\t");
	    	  }
	    	  System.out.println();
	      }
	      
	      
	      //2. 칸수만 알도록 선언 후 값 대입 후 출력하기 ar2
	      int[][] ar2 = new int[4][3];
	      
	      int cnt = 1;
	      
	      // 값 대입
	      for(int i = 0; i < ar2.length; i++) {
	    	  for(int j = 0; j < ar2[i].length; j++) {
	    		  ar2[i][j] = cnt++;
	    	  }
	      }
	      
	      // 출력
	      for(int i = 0; i < ar2.length; i++) {
	    	  for(int j = 0; j < ar2[i].length; j++) {
	    		  System.out.printf("%d\t",ar2[i][j]);
	    	  }
	    	  System.out.println();
	      }
	      
  }
}