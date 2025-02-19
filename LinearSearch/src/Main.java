//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] array={9,5,2,3,5,3,5,2};

int index= linerSearch(array,5);
if (index!=-1){
    System.out.printf("number found at %d",+index);
}
else {
    System.out.println("value not found");
}
    }

    private static int linerSearch(int[] array, int value) {
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==value) return i;
        }
        return -1;
    }
}