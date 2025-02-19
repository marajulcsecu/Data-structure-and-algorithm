public class question1 {
    public static void main(String[] args) {

        int[] Arr ={2,4,1,6,3,8,5,7};

        Quicksort(Arr,0, Arr.length-1);

        for (int i : Arr) {
            System.out.print(i+" ");

        }

    }

    public static void Quicksort(int[] arr, int start, int end){

        if (end <= start) return;

        int P_index = Partition(arr, start, end) ;
        Quicksort(arr, start, P_index-1);
        Quicksort(arr, P_index+1,end);

    }
    public static int Partition(int[] Arr, int start, int end){
        int pivot= Arr[end];
        int i = start -1;
        for (int j = start; j <=end; j++) {

            if (Arr[j]<pivot){
                i++;
                int temp = Arr[i];
                Arr[i]=Arr[j];
                Arr[j]= temp;
            }

        }
        i++;
        int temp=Arr[i];
        Arr[i]=Arr[end];
        Arr[end]=temp;
        return i;
    }

}
