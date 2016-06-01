package com.mcsearchin.mexicanlunch;

/**
 * Created by tbrock on 5/29/16.
 */
public class LunchRemainderCalculator {

    static final int MAX_TOTAL_CHIP_CONSUMPTION_TIME = 100;
    static final int MAX_BASKET_CONSUMPTION_TIME = 30;
    static final int BASKET_CONSUMPTION_INCREMENT = 5;
    static final int BURRITO_TO_CHIP_BASKETS = 4;
    static final int NON_IMPACTING_CHIP_BASKETS = 1;

    public static double calculate(double burritoDeliveryTime, double chipWaitTime) {
        int totalChipConsumptionTime = MAX_TOTAL_CHIP_CONSUMPTION_TIME;
        int basketConsumptionTime = MAX_BASKET_CONSUMPTION_TIME;
        int numberOfBaskets = NON_IMPACTING_CHIP_BASKETS + BURRITO_TO_CHIP_BASKETS;
        while (burritoDeliveryTime < totalPossibleChipTime(totalChipConsumptionTime, chipWaitTime, numberOfBaskets)) {
            totalChipConsumptionTime -= basketConsumptionTime;
            basketConsumptionTime -= BASKET_CONSUMPTION_INCREMENT;
            numberOfBaskets--;
        }
        double percentageFromWholeBaskets = 1.0 * (numberOfBaskets - NON_IMPACTING_CHIP_BASKETS) / BURRITO_TO_CHIP_BASKETS;
        double percentageOfLastBasket =
                (burritoDeliveryTime - totalChipConsumptionTime - chipWaitTime * numberOfBaskets)
                        / (basketConsumptionTime + BASKET_CONSUMPTION_INCREMENT);
        double remainingBurritoPercentage = percentageFromWholeBaskets + (percentageOfLastBasket / BURRITO_TO_CHIP_BASKETS);

        return remainingBurritoPercentage > 0.0 ? remainingBurritoPercentage : 0.0;
    }

    private static double totalPossibleChipTime(int burritoDeliveryThreshold, double chipDeliveryTime, int numberOfBaskets) {
        return burritoDeliveryThreshold + chipDeliveryTime * numberOfBaskets;
    }
}
