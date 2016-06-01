package com.mcsearchin.mexicanlunch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tbrock on 5/29/16.
 */
public class LunchRemainderCalculatorTest {

    static final double EPSILON = 0.0000000001;

    @Test
    public void shouldBe0PercentWhenNoChipsAreConsumed() {
        assertEquals(0.0, LunchRemainderCalculator.calculate(0, 0), EPSILON);
    }

    @Test
    public void shouldBe100PercentWhenBurritoTimeEqualsConsumptionTimeForFiveBasketsOfChipsWithNoWait() {
        assertEquals(1.0, LunchRemainderCalculator.calculate(100, 0), EPSILON);
    }

    @Test
    public void shouldBe100PercentEvenWhenWaitTimeIsAbsurdForABurritoWithOnlyTheInitialBasketOfChips() {
        assertEquals(0.0, LunchRemainderCalculator.calculate(100, 90), EPSILON);
    }

    @Test
    public void shouldBe0PercentWhenThereIsTimeToConsumeExactlyOneBasketOfChipsWithNoWait() {
        assertEquals(0.0, LunchRemainderCalculator.calculate(10, 0), EPSILON);
    }

    @Test
    public void shouldBe0PercentWhenThereIsTimeToConsumeExactlyOneBasketOfChipsWithAWait() {
        assertEquals(0.0, LunchRemainderCalculator.calculate(11, 1), EPSILON);
    }

    @Test
    public void shouldBe25PercentWhenThereIsTimeToConsumeExactlyTwoBasketsOfChipsWithNoWait() {
        assertEquals(0.25, LunchRemainderCalculator.calculate(25, 0), EPSILON);
    }

    @Test
    public void shouldBe25PercentWhenThereIsTimeToConsumeExactlyTwoBasketsOfChipsWithAWait() {
        assertEquals(0.25, LunchRemainderCalculator.calculate(27, 1), EPSILON);
    }

    @Test
    public void shouldBe1PercentWhenThereIsTimeToConsumeFourPercentOfTheSecondBasketOfChips() {
        assertEquals(0.01, LunchRemainderCalculator.calculate(10.6, 0), EPSILON);
    }

    @Test
    public void shouldBe50PercentWhenThereIsTimeToConsumeExactlyThreeBasketsOfChipsWithNoWait() {
        assertEquals(0.5, LunchRemainderCalculator.calculate(45, 0), EPSILON);
    }

    @Test
    public void shouldBe50PercentWhenThereIsTimeToConsumeExactlyThreeBasketsOfChipsWithAWait() {
        assertEquals(0.5, LunchRemainderCalculator.calculate(48, 1), EPSILON);
    }

    @Test
    public void shouldBe30PercentWhenThereIsTimeToConsumeTwentyPercentOfTheThirdBasketOfChips() {
        assertEquals(0.3, LunchRemainderCalculator.calculate(31, 1), EPSILON);
    }

    @Test
    public void shouldBe75PercentWhenThereIsTimeToConsumeExactlyFourBasketsOfChipsWithNoWait() {
        assertEquals(0.75, LunchRemainderCalculator.calculate(70, 0), EPSILON);
    }

    @Test
    public void shouldBe75PercentWhenThereIsTimeToConsumeExactlyFourBasketsOfChipsWithAWait() {
        assertEquals(0.75, LunchRemainderCalculator.calculate(74, 1), EPSILON);
    }

    @Test
    public void shouldBe99PercentWhenThereIsTimeToConsumeNineteenPercentOfTheFifthBasketOfChips() {
        assertEquals(0.99, LunchRemainderCalculator.calculate(98.8, 0), EPSILON);
    }

    @Test
    public void shouldBe99PercentWhenThereIsTimeToConsumeNineteenPercentOfTheFifthBasketOfChipsWithAWait() {
        assertEquals(0.99, LunchRemainderCalculator.calculate(102.8, 1), EPSILON);
    }

    @Test
    public void shouldBe100PercentWhenBurritoTimeEqualsConsumptionTimeForFiveBasketsOfChipsIncludingWait() {
        assertEquals(1.0, LunchRemainderCalculator.calculate(125, 5), EPSILON);
    }
}
