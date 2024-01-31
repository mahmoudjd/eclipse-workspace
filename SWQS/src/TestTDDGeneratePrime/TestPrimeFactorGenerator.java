package TestTDDGeneratePrime;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import TDDGeneratePrime.PrimeFactorGenerator;

public class TestPrimeFactorGenerator
{

    @Test
    public void GenerateWithNumberOne_Return_EmptyList()
    {
        ArrayList<Integer> result = PrimeFactorGenerator.Generate(1);

        assertEquals(Collections.EMPTY_LIST, result);
    }

    

    @Test
    public void GenerateWithNumberTwo_ReturnListContainingTwo()
    {
        ArrayList<Integer> result = PrimeFactorGenerator.Generate(2);
        ArrayList<Integer> excpected = new ArrayList<Integer>(Arrays.asList(2));
        assertEquals(excpected, result);
    }
    
    
    @ParameterizedTest
    @DisplayName("GenerateNumberValueSourceParameterList")
    @ValueSource(ints = { 1, 2 })
    public void GenerateWithNumberReturnExcpected(Integer number)
    {
        ArrayList<Integer> result = PrimeFactorGenerator.Generate(number);
        switch (number)
        {
            case 1:
                assertEquals(Collections.EMPTY_LIST, result);
                break;
            case 2:
                assertEquals(new ArrayList<Integer>(Arrays.asList(2)), result);
                break;
            default:
                fail();
        }

    }
    
    @ParameterizedTest
    @MethodSource("proviedParametersGenerateTest")
    public void  GenerateWithNumberReturnExpectedList(Integer number,
                    ArrayList<Integer> expectedList)
    {
        ArrayList<Integer> result = PrimeFactorGenerator.Generate(number);
        assertEquals(expectedList, result);
    }
    
    private static Stream<Arguments> proviedParametersGenerateTest()
    {
        return Stream.of(
                        Arguments.of(1, new ArrayList<Integer>()),
                        Arguments.of(2, new ArrayList<Integer>(Arrays.asList(2))),
                        Arguments.of(3, new ArrayList<Integer>(Arrays.asList(3))),
                        Arguments.of(4, new ArrayList<Integer>(Arrays.asList(2,2))),
                        Arguments.of(5, new ArrayList<Integer>(Arrays.asList(5))),
                        Arguments.of(6, new ArrayList<Integer>(Arrays.asList(2,3))),
                        Arguments.of(7, new ArrayList<Integer>(Arrays.asList(7))),
                        Arguments.of(8, new ArrayList<Integer>(Arrays.asList(2,2,2))),
                        Arguments.of(9, new ArrayList<Integer>(Arrays.asList(3,3))),
                        Arguments.of(100, new ArrayList<Integer>(Arrays.asList(2,2,5,5))),
                        Arguments.of(100001, new ArrayList<Integer>(Arrays.asList(11,9091)))
                        
                         );
    }
    

}
