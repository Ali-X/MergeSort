/*
 * in-place merge sorting
 */
public class MergeSort {

    private int[] numbers;

    public int[] sort(int[] array) {
        numbers = array;
        mergeSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void mergeSort(int[] array, int first, int last) {
        int middle;
        int leftPartPosition;
        int rightPartPosition;
        int temp;

        if (first >= last) return;

        middle = (first + last) / 2;

        mergeSort(array, first, middle);
        mergeSort(array, middle + 1, last);

        leftPartPosition = first;
        rightPartPosition = middle + 1;

        if (array[middle] <= array[rightPartPosition])
            return;

        while (leftPartPosition <= middle && rightPartPosition <= last) {

            if (array[leftPartPosition] <= array[rightPartPosition]) {
                leftPartPosition++;
            } else {
                temp = array[rightPartPosition];
                System.arraycopy(array, leftPartPosition, array, leftPartPosition + 1, rightPartPosition - leftPartPosition);
                array[leftPartPosition] = temp;
                leftPartPosition++;
                middle++;
                rightPartPosition++;
            }
        }
    }
}
