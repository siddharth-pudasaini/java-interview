public class Sort {


    public static void main(String[] args){

        int[] arr={78,7,5,3,1,0,-1};
        int[] sortedArray=sort(arr);

        for(int num:sortedArray){
            System.out.println(num);
        }


    }

    public static int[] sort(int[] arr){
        int[] sortedArray=new int[arr.length];

        //Grabbing element from array
        for(int i=0;i<arr.length;i++){
            int max=arr[i];

            //Comparing it to rest of the array to find the max element
            for(int j=i;j<arr.length;j++){
                if(arr[j]>=max) max=arr[j];
            }

            //Pushing max element to the new sorted array
            sortedArray[i]=max;
        }
        return sortedArray;

    }


}
