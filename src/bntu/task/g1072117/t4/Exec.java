package bntu.task.g1072117.t4;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrArray arrs = new CrArray();
		int n = 10;
		int m = 10;
		int[][] MyArray = arrs.CreateArray(n, m);
		FindLine findArraySerr = new FindLine();
		findArraySerr.FindIt(MyArray, n, m);

	}

}
