import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortTest {

    private List<Integer> getProblemList() {
        return Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    private List<Integer> getAnswerList() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void bubbleSort() {
        List<Integer> list = getProblemList();
        List<Integer> sorted = new BubbleSort().sort(list);
        assertEquals(getAnswerList(), sorted);
    }

    @Test
    void insertSort() {
        List<Integer> list = getProblemList();
        List<Integer> sorted = new InsertSort().sort(list);
        assertEquals(getAnswerList(), sorted);
    }

    @Test
    void selectionSort() {
        List<Integer> list = getProblemList();
        List<Integer> sorted = new SelectionSort().sort(list);
        assertEquals(getAnswerList(), sorted);
    }

    @Test
    void quickSort() {
        List<Integer> list = getProblemList();
        List<Integer> sorted = new QuickSort().sort(list);
        assertEquals(getAnswerList(), sorted);
    }

    @Test
    void mergeSort() {
        List<Integer> list = getProblemList();
        List<Integer> sorted = new MergeSort().sort(list);
        assertEquals(getAnswerList(), sorted);
    }
}