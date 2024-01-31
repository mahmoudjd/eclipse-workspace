package BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestBinarySearch
{
    @Test
    public void test1()
    {
        int[] array = {0,1,2,3,4,5,6,7};
        int result = BinarySearch.binarySearch(array, 1);
        assertEquals(1, result);
    }

    @ParameterizedTest
    @MethodSource("proviedParametersSearchBinaryTest")
    public void GenerateWithNumberReturnExpectedList(int number, int expectedValue)
    {
        int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

        int result = BinarySearch.binarySearch(array, number);
        assertEquals(expectedValue, result);
    }

    private static Stream<Arguments> proviedParametersSearchBinaryTest()
    {
        return Stream.of(Arguments.of(-11, -1), 
                         Arguments.of(-546, -1), 
                         Arguments.of(1, 0), 
                         Arguments.of(2, 1), 
                         Arguments.of(3, 2), 
                         Arguments.of(4, 3), 
                         Arguments.of(5, -1), 
                         Arguments.of(6, 4), 
                         Arguments.of(7, 5), 
                         Arguments.of(8, 6), 
                         Arguments.of(9, 7),
                         Arguments.of(10, 8),
                         Arguments.of(100, -1), 
                         Arguments.of(100001, -1)

        );
    }
    
    

    @ParameterizedTest
    @DisplayName("GenerateNumberValueSourceParameterList")
    @ValueSource(ints = {-100, -10, 0,1, 2, 2, 3, 4, 5, 6, 7, 8, 9 })
    public void GenerateWithNumberReturnExcpected(Integer number)
    {
        int[] array = {0,1,2,3,4,5,6,7};
        int result = BinarySearch.binarySearch(array, number);
        switch (number)
        {
            case 0:
                assertEquals(0, result);
                break;
            case 1:
                assertEquals(1, result);
                break;
            case 2:
                assertEquals(2, result);
                break;
            case 3:
                assertEquals(3, result);
                break;
            case 4:
                assertEquals(4, result);
                break;
            case 5:
                assertEquals(5, result);
                break;
            case 6:
                assertEquals(6, result);
                break;
            case 7:
                assertEquals(7, result);
                break;
            default:
                assertEquals(-1, result);
        }

    }

}
