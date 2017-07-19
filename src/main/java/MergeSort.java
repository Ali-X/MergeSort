public class MergeSort {

    private int[] numbers;
    private int[] temp;

    public int[] sort(int[] numbers) {
        this.numbers = numbers;
        temp = new int[numbers.length];
        mergeSort(0, numbers.length - 1);
        return numbers;
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = numbers[i];
        }
        int leftPartPosition = low;
        int rightPartPosition = middle + 1;
        int currentPosition = low;

        while (leftPartPosition <= middle && rightPartPosition <= high) {
            if (temp[leftPartPosition] <= temp[rightPartPosition]) {
                numbers[currentPosition] = temp[leftPartPosition];
                leftPartPosition++;
            } else {
                numbers[currentPosition] = temp[rightPartPosition];
                rightPartPosition++;
            }
            currentPosition++;
        }

        while (leftPartPosition <= middle) {
            numbers[currentPosition] = temp[leftPartPosition];
            currentPosition++;
            leftPartPosition++;
        }
    }
}
