public class binarySearch {
    public static void main(String[] args) {
        int [] array = new int[50000];
        int target =500;
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }

        int result =  binarysearch(array, target);
        if(result!=0) System.out.println("target not found");
        else System.out.println("target found at :" +result);
    }

    private static int binarysearch(int[] array, int target) {
        int low=0;
        int high =array.length-1;
        while (low<=high){
            int middle=(low+high)/2;
          int middleValue=array[middle];
          if (target<middleValue)  high=middle-1;
          else if (target>middleValue) { low =middle+1;}
          else return middleValue;
        }

        return -1;
    }
}
