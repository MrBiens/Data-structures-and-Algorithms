public class Selection_Sort {
    public static void Selection_Sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int i_min=i;
            int v_min=arr[i];
            for(int j=i;j<n;j++){ // vì arr[j] to <n ; pt cuối cùng, cho nên sẽ chỉ duyệt đến pt gần cuối
                if(arr[j] < v_min){  // nếu a[j](pt cuối cùng) < pt gần cuối thì sẽ đổi chỗ , không thì đứng im
                    v_min=arr[j];   //cho nên không phải duyệt đến cuối cùng
                    i_min=j;
                }
            }
            // Ra ngoài for để đảm bảo duyệt hết và lấy pt nhỏ nhất từ pt hiện tại đến cuối
            int temp = arr[i];
            arr[i] = arr[i_min];
            arr[i_min] = temp;
        }
    }
    public static void main(String[] args) {
        int arr_test[] = {2,1,4,3,5,8,6,0};
        int n = arr_test.length;

        Selection_Sort(arr_test, n);
        for(int i : arr_test){
            System.out.println(i);
        }
    }
}
