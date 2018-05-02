import java.util.*;

    public class Solution {

        public static int getMaxProfit(int[] stockPricesYesterday) {

            int maxProfit = 0;

            // go through every time
            for (int outerTime = 0; outerTime < stockPricesYesterday.length; outerTime++) {

                // for every time, go through every other time
                for (int innerTime = 0; innerTime < stockPricesYesterday.length; innerTime++) {

                    // for each pair, find the earlier and later times
                    int earlierTime = Math.min(outerTime, innerTime);
                    int laterTime   = Math.max(outerTime, innerTime);

                    // and use those to find the earlier and later prices
                    int earlierPrice = stockPricesYesterday[earlierTime];
                    int laterPrice   = stockPricesYesterday[laterTime];

                    // see what our profit would be if we bought at the
                    // min price and sold at the current price
                    int potentialProfit = laterPrice - earlierPrice;

                    // update maxProfit if we can do better
                    maxProfit = Math.max(maxProfit, potentialProfit);
                }
            }

            return maxProfit;
        }


            // tests

            public static void main (String[] args) {

                String testDescription = "priceGoesUpThenDownTest";
                int expected = 4;
                int actual = getMaxProfit(new int[]{1, 5, 3, 2});
                assertEquals(expected, actual, testDescription);

                testDescription = "priceGoesDownThenUpTest";
                expected = 7;
                actual = getMaxProfit(new int[]{7, 2, 8, 9});
                assertEquals(expected, actual, testDescription);

                testDescription = "priceGoesUpAllDayTest";
                expected = 8;
                actual = getMaxProfit(new int[]{1, 6, 7, 9});
                assertEquals(expected, actual, testDescription);

                testDescription = "priceGoesDownAllDayTest";
                expected = -2;
                actual = getMaxProfit(new int[]{9, 7, 4, 1});
                assertEquals(expected, actual, testDescription);

                testDescription = "priceStaysTheSameAllDayTest";
                expected = 0;
                actual = getMaxProfit(new int[]{1, 1, 1, 1});
                assertEquals(expected, actual, testDescription);

                testDescription = "exceptionWithEmptyPricesTest";
                int[] input = new int[]{};
                assertException(input, testDescription);

                testDescription = "exceptionWithOnePriceTest";
                input = new int[]{1};
                assertException(input, testDescription);
            }

            private static void assertEquals(int expected, int actual, String testDescription){
                if (expected != actual){
                    System.err.println(testDescription + " - failed. Expected: " + expected + ", but was: " + actual);
                } else {
                    System.out.println(testDescription + " - passed.");
                }
            }

            private static void assertException(int[] stockPrices, String testDescription) {
                try {
                    getMaxProfit(stockPrices);
                    System.err.println(testDescription + " - failed. Exception expected.");
                } catch (Exception e) {
                    System.out.println(testDescription + " - passed.");
                }
            }
        }

