//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = interpolationSearch(array, 8);
        if (index != -1) {
            System.out.println("element found " + index);
        }

    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int prob = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("prob: " + prob);
            if (array[prob] == value) return prob;
            else if (array[prob] < value) {
                low = prob + 1;
            } else {
                high = prob - 1;
            }

        }
        return -1;
    }
}