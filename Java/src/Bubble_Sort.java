
import java.util.Scanner;

public class Bubble_Sort {
    public static void bubble_Sort(int arr[ ]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){ //a[3]
                if(arr[j]>arr[j+1]){ //a[3] > a[4]
                    int temp=arr[j];
                    arr[j]=arr[j+1]; //pt a[3]=a[4]
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int n=sc.nextInt();

        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("I["+i+"]=");
            arr[i]=sc.nextInt();
        }
        bubble_Sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
