import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testInPlace() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  }

  @Test
  public void testReverse() {
    int[]input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testZeroAndOneElemForAvg() {
    double[] input1 = {1.0};
    double[] input2 = {};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0, 0);
    assertEquals(ArrayExamples.averageWithoutLowest(input2), 0, 0);
  }

  @Test
  public void testAvgLowestPosition() {
    double[] lowestFirst = {1.0, 2.5, 3.5};
    double [] lowestMiddle = {2.5, 1.0, 3.5};
    double [] lowestEnd = {2.5, 3.5, 1.0};

    assertEquals(ArrayExamples.averageWithoutLowest(lowestFirst), 3.0, 0);
    assertEquals(ArrayExamples.averageWithoutLowest(lowestMiddle), 3.0, 0);
    assertEquals(ArrayExamples.averageWithoutLowest(lowestEnd), 3.0, 0);
  }

  @Test
  public void testAvg2Lowest() {
    double[] twoLowest = {2.0, 2.0, 2.5, 3.5};

    assertEquals(ArrayExamples.averageWithoutLowest(twoLowest), 3.0, 0);
  }
}
