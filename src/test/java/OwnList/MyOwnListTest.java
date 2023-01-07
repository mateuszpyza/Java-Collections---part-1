package OwnList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyOwnListTest {


    @Test
    void shouldVerifyNullListSizeMethod() {
        //given
        MyOwnList myOwnList = new MyOwnList();
        Integer expected = 0;
        //when
        Integer result = myOwnList.size();
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldReturnListSize() {
        //given
        Integer table[] = new Integer[]{1, 3, 4, 56, 3};
        MyOwnList myOwnList = new MyOwnList(table);
        Integer expected = 5;
        //when
        Integer result = myOwnList.size();
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldVerifyNullListIsEmptyMethod() {
        //given
        MyOwnList myOwnList = new MyOwnList();
        boolean expected = true;
        //when
        boolean result = myOwnList.isEmpty();
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldReturnTrueIfLengthEqualsZero() {
        //given
        Integer table[] = new Integer[]{,};
        MyOwnList myOwnList = new MyOwnList(table);
        boolean expected = true;
        //when
        boolean result = myOwnList.isEmpty();
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldReturnFalseIsEmptyMethod() {
        //given
        Integer table[] = new Integer[]{1};
        MyOwnList myOwnList = new MyOwnList(table);
        boolean expected = false;
        //when
        boolean result = myOwnList.isEmpty();
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldVerifyAdditionIfListIsNull() {
        //given
        MyOwnList myOwnList = new MyOwnList();
        //when
        myOwnList.add(777);
        Integer result = myOwnList.get(0);
        Integer expected = 777;
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldVerifyAdditionIfListIsNotNull() {
        //given
        Integer table[] = new Integer[]{2, 4, 777};
        MyOwnList myOwnList = new MyOwnList(table);
        //when
        myOwnList.add(777);
        Integer result = myOwnList.get(2);
        Integer expected = 777;
        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideDataGet")
    void shouldVerifyNumberReturnedByGet(Integer input, Integer expected) {
        //given
        Integer table[] = new Integer[]{2, 4, 777, 666, 222, 1};
        MyOwnList myOwnList = new MyOwnList(table);
        //when
        Integer actualValue = myOwnList.get(input);
        //then
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideDataGet() {
        return Stream.of(
                Arguments.of("2", "777"),
                Arguments.of("4", "222"),
                Arguments.of("-5", "0"),
                Arguments.of("10", "0")

        );
    }


    @ParameterizedTest
    @MethodSource("provideDataAdd")
    void shouldVerifyAdd(MyOwnList inputOwnList, Integer inputIndex, Integer inputElementToAdd, MyOwnList expectedList) {
        inputOwnList.add(inputIndex, inputElementToAdd);
        for (int i = 0; i < expectedList.size(); i++) {
            Integer expected = expectedList.get(i);
            Integer result = inputOwnList.get(i);
            Assertions.assertEquals(expected, result);
        }
    }

    private static Stream<Arguments> provideDataAdd() {
        MyOwnList firstMyOwnList = new MyOwnList(new Integer[]{2, 3, 4, 5});
        Integer firstAddIndex = 2;
        Integer firstElementToAdd = 666;
        MyOwnList firstExpectedList = new MyOwnList(new Integer[]{2, 3, 666, 4, 5});

        MyOwnList secondMyOwnList = new MyOwnList(new Integer[]{1, 1, 1, 1});
        Integer secondAddIndex = -2;
        Integer secondElementToAdd = 666;
        MyOwnList secondExpectedList = new MyOwnList(new Integer[]{1, 1, 1, 1});

        MyOwnList thirdMyOwnList = new MyOwnList(new Integer[]{2, 2, 2, 2});
        Integer thirdAddIndex = 10;
        Integer thirdElementToAdd = 666;
        MyOwnList thirdExpectedList = new MyOwnList(new Integer[]{2, 2, 2, 2});

        return Stream.of(
                Arguments.of(firstMyOwnList, firstAddIndex, firstElementToAdd, firstExpectedList),
                Arguments.of(secondMyOwnList, secondAddIndex, secondElementToAdd, secondExpectedList),
                Arguments.of(thirdMyOwnList, thirdAddIndex, thirdElementToAdd, thirdExpectedList)

        );
    }


    @ParameterizedTest
    @MethodSource("provideDataRemove")
    void shouldVerifyRemove(MyOwnList inputOwnList, Integer inputIndex, MyOwnList expectedList) {
        inputOwnList.remove(inputIndex);
        for (int i = 0; i < expectedList.size(); i++) {
            Integer expected = expectedList.get(i);
            Integer result = inputOwnList.get(i);
            Assertions.assertEquals(expected, result);
        }
    }

    private static Stream<Arguments> provideDataRemove() {
        MyOwnList firstMyOwnList = new MyOwnList(new Integer[]{2, 3, 4, 5});
        Integer firstRemoveIndex = 1;

        MyOwnList firstExpectedList = new MyOwnList(new Integer[]{2, 4, 5});

        MyOwnList secondMyOwnList = new MyOwnList(new Integer[]{1, 1, 1, 1});
        Integer secondRemoveIndex = -2;
        MyOwnList secondExpectedList = new MyOwnList(new Integer[]{1, 1, 1, 1});

        MyOwnList thirdMyOwnList = new MyOwnList(new Integer[]{2, 2, 2, 2});
        Integer thirdRemoveIndex = 10;
        MyOwnList thirdExpectedList = new MyOwnList(new Integer[]{2, 2, 2, 2});

        return Stream.of(
                Arguments.of(firstMyOwnList, firstRemoveIndex, firstExpectedList),
                Arguments.of(secondMyOwnList, secondRemoveIndex, secondExpectedList),
                Arguments.of(thirdMyOwnList, thirdRemoveIndex, thirdExpectedList)

        );
    }
}