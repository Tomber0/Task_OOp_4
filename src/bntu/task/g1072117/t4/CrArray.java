package bntu.task.g1072117.t4;
import java.util.Random;

public class CrArray {
	final Random random = new Random();
	 
	int randomMaMi(int max, int min) {
		
		int sred = max - min;
		Random random = new Random();
		int i = random.nextInt(sred + 1);
		i += min;
		
		
		return i;
	}
	int [][] CreateArray(int n,int m) {
    
		int[][] array = new int[n][m];
		for (int i = 0; i < n ; i++) {
		
		
		for (int j = 0; j < m ; j++) {
			array[i][j] =randomMaMi(3,0);
			//array[i][j] = random.nextInt();
			System.out.print(array[i][j]);
			System.out.print("   ");
			
			}
		System.out.println();
		}
		
    
    
    	return array;
	}
	
}
/*
 * 
 * JUnitCore runner = new JUnitCore();
        Result result = runner.run(MathFuncTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
 * */
