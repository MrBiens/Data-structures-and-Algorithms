import java.util.Scanner;

public class TimKiemTuanTu {
	public static int TimKiemTuanTu(int[] arr, int k) {
		// tim kiem tuyen tinh -linear search
		// duyet cac phan tu trong mang tu dau den cuoi
		// neu co se in ra vi tri phan tu do. khong thi se in ra -1
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap k:");
		k = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;

	}

	public static int TimKiemTuanTu_LinhCanh(int[] arr, int k) {
	
		int n = arr.length;
		arr[n] = k;
		
//		 int[] extendedArr = new int[n + 1];
//		 System.arraycopy(arr, 0, extendedArr, 0, n);
//		 extendedArr[n] = k;
		 
		 // mang co 6 pt => a[6]=k
		int i = 0;
		while (arr[i] != k) {
			i = i + 1;
		}
		// vd a[0]!=6 => 0=0+1; i=i+1=1
		// a[1]!=6=> i=i+1=2;
		// a[2]!=6=> i=i+1=3;
		// a[3]!=6 => i=i+1=4;
		// a[4] !=6 = > i=i+1=5;
		// a[5]==6 => stop => i=5
		if (i < n) { // neu tim duoc i se auto nho hon n - vi xet pt cua mang arr ( di tu 0) con n =
						// do dai cua mang
			return i; // vi tri cua pt
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=6;
		int arr[] = { 3, 5, 7, 1, 8, 9 ,2,k};
		// tim kiem tuan tu khong linh canh
//		int result=TimKiemTuanTu(arr, k);
//		if(result==-1) {
//			System.out.println("Trong mang khong co key can tim kiem");
//		}else {
//			System.out.println("Key o vi tri thu "+result+" trong mang");
//		}
		
		// tim kiem tuan tu linh canh
		int result = TimKiemTuanTu_LinhCanh(arr, k);
		if (result == -1) {
			System.out.println("Trong mang khong co key can tim kiem");
		} else {
			System.out.println("Key o vi tri thu " + result + " trong mang");
		}

	}

}
