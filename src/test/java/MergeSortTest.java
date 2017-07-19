import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    private int[] source;
    private int[] expected;
    private int[] actual;

    @Before
    public void setUp() throws Exception {
        source = new int[] {10, -10, 5, 3, -3, -5, 0};
        expected = new int[] {-10, -5, -3, 0, 3, 5, 10};
    }

    @Test
    public void testMergeSort() {
        MergeSort sort = new MergeSort();
        actual = sort.sort(source);
        assertArrayEquals(expected, actual);
    }


}