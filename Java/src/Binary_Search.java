import java.util.Scanner;

public class Binary_Search {
    public static int Binary_Search(int arr[],int K,int n){
        int left=0,right=n;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==K){
                return mid;
            }
            if(arr[mid]<K){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;

    }
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng:");
        int n=sc.nextInt();
        int[] arr = new int[n];//chỉ dùng cho mảng đã sắp xếp
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            arr[i]=sc.nextInt();
        }
        int k=7;
        System.out.println(Binary_Search(arr,k,n));
        
        /*St1: mid = 0 + 9(arr.length) /2 = 4 (4.5 -> int =4)
         *      mid[4]=3;
         *      if(3<7) -> left = mid +1; = [5]=4
         *St2: mid = 4+9/2=7 
                mid[7]=7 => mid=k(value) return mid = 7
         */     
       
    }
}
