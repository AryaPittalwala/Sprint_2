public class sum_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if(arr[i]+arr[j]==5){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
