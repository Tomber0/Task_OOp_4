package bntu.task.g1072117.t4;

public class FindLine {

	void FindIt(int[][] Array, int n, int m) {
		int[][] Series = new int[n][2];// [величина, длина]
		int notLast = 9999998;
		int dl = 0;
		int why = n * m;
		int sch = 0;
		int NewMax;
		int Min = FindMin(Array, n, m);
		NewMax = FindNextMax(Array, n, m, notLast);
		// System.out.println(NewMax);
		for (int i = 0; i < n; i++) {
			Series[i][1] = 0;
		}
		NewMax = FindNextMax(Array, n, m, notLast);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {

				if (Array[i][j] == NewMax && Array[i][j] == Array[i][j + 1]) {
					// System.out.println(i - 1);
					Series[i][0] = Array[i][j];
					Series[i][1] += 1;
					dl += 1;

				}
				// NewMax = FindNextMax(Array, n, m , notLast);

			}
			if (dl == 0 && i == n - 1 && Min != NewMax) {
				notLast = NewMax;
				NewMax = FindNextMax(Array, n, m, notLast);
				i = 0;
				// System.out.println(NewMax);

			}
		}
		ShowRes(Series, n);
		/*for (int i = 0; i < n; i++) {

			// if (Series[i][1] != 0) {
			System.out.print("\n " + Series[i][0]);
			System.out.print(Series[i][1] + " \n");
			// }
		}*/
		// return 0;
	}

	void ShowRes(int[][] Series, int n) {
		int minLen = 2392039;
		int maxEl = -1212121;
		int maxElI = 0;
		for (int i = 0; i < n; i++) {
			if (maxEl < Series[i][0]) {

				maxEl = Series[i][0];
				// maxElI=i;
			}

		}
		for (int i = 0; i < n; i++) {
			if (maxEl == Series[i][0]) {
					if(minLen > Series[i][1]) {
						minLen = Series[i][1];
						maxElI = i;
					}
				// maxElI=i;
			}

		}
		// System.out.print(Series[maxLenI][0]);
		System.out.println(maxElI+1);
	}

	int FindNextMax(int[][] Array, int n, int m, int notLast) {
		int NewMax = -9999999;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (NewMax < Array[i][j] && Array[i][j] < notLast) {
					NewMax = Array[i][j];
				}

			}
		}

		return NewMax;
	}

	int FindMin(int[][] Array, int n, int m) {
		int NewMin = 9999999;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (NewMin > Array[i][j]) {
					NewMin = Array[i][j];
					// System.out.println(NewMax);
				}
			}
		}

		return NewMin;
	}
}
