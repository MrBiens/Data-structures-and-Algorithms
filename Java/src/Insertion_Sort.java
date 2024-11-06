public class Insertion_Sort {

public static void Insertion_Sort(int arr[], int n){
    for(int i=1;i<n;i++){
        int j=i;
        while(j>0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1]=temp;
            j--; // vd 1 2 0 -> sẽ lặp thành 1 0 2  và lại lặp thành 0 1 2 ( đến khi j = 0 sẽ dừng ) 
        }
    }
}
public static void test(int arr[], int n){
    for(int i=1;i<n;i++){
        while(i>0 && arr[i] < arr[i-1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]=temp; // sẽ đúng khi i chỉ < i-1 , sẽ không lặp lại các pt phía sau i -1 ; 
            
        }
    }
}


public static void main(String[] args) {
    int arr[] = {2,1,4,3,5,8,6,0};
    int arr_test[] = {2,1,4,3,5,8,6,0};
    int n = arr.length;
    System.out.println("Trước khi sắp xếp:");
    for(int a : arr){

        System.out.println(a);
    }

   
    test(arr_test,n);
    System.out.println("-------------");
    System.out.println("Sau khi sắp xếp arr_test:");
    for(int a : arr_test){
        System.out.println(a);
    }

    Insertion_Sort(arr, n);
    System.out.println("-------------");
    System.out.println("Sau khi sắp xếp arr:");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    
}
}
