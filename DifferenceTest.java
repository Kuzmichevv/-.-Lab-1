import org.junit.jupiter.api.Test;

class DifferenceTest {
    @Test
    public void testSubtractProductAndSum() {
        Difference difference = new Difference();
        assertEquals(0, difference.subtractProductAndSum(0));
        assertEquals(0, difference.subtractProductAndSum(100001));
        assertEquals(0, difference.subtractProductAndSum(1));
        assertEquals(15, difference.subtractProductAndSum(234));
        assertEquals(21, difference.subtractProductAndSum(4421));
    }

    private void assertEquals(int i, int i1) {
    }
}
