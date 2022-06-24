public class FindMax {

    public static void main(String[] args){
        int[] arr={56,999,123,57,-100};
        int max=findMaxNum(arr);
        System.out.println(max);
    }

    public static int findMaxNum(int[] arr){
        int max= arr[0];
        for(int num:arr){
            max=num>=max?num:max;
        }
        return max;
    }

}
