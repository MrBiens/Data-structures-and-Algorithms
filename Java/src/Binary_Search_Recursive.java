import java.util.Scanner;

public class Binary_Search_Recursive {

    public static int Binary_Search(int a[],int k,int n,int left, int right){
            if(left==right){
                if(a[left]==k){
                    return left;
                }else{
                    return -1;
                }
            }
            else{
                int mid=(left+right)/2;
                if(a[mid]==k){
                    return mid;
                }else { 
                        if(a[mid]<k){
                            return  Binary_Search(a, k, n,mid+1, right);
                        } else{
                            return  Binary_Search(a, k, n,left, mid -1);
                        }
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Nhập số phần tử :");
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("I["+i+"]=");
            arr[i]=sc.nextInt();
        }


        System.out.print("Nhập số cần tìm :");
        int k=sc.nextInt();
        System.out.println(Binary_Search(arr, k ,n, 0, n-1));

    }

}

