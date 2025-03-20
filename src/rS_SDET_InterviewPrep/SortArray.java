package rS_SDET_InterviewPrep;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 9, 2, 0, 1, 5, 7, 8, 9, 10, 2, 4, 40 };
		SortArray sort = new SortArray();
		sort.ascendingOrder(arr);
		System.out.println("-------------------------------------------------------------------");
		sort.descendingOrder(arr);
	}

	public void descendingOrder(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);

		}
	}

	public void ascendingOrder(int[] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a) System.out.println(i);
	}
}
