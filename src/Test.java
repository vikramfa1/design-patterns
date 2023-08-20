import java.util.*;

public class Test {

    public int findMinimumBasketCost(List<List<Integer>> productsList) {
        int basketCost = 0;
        if(productsList == null || productsList.isEmpty()) return basketCost;

        for(List<Integer> productPriceList: productsList) {
            int minPrice = Integer.MAX_VALUE;

            for(int price: productPriceList) {
                minPrice = Math.min(minPrice, price);
            };
            basketCost+=minPrice;

        }
        return basketCost;
    }

    public int findMinimumBasketForSameDay(List<List<Integer>> productsList, int noOfDays) {
        int minBasketCost = Integer.MAX_VALUE;
        if(productsList == null || productsList.isEmpty()) return 0;

        for(int i=0;i<noOfDays;i++) {
            int currBasketPrice = 0;
            for (int j = 0; j < productsList.size(); j++) {
                currBasketPrice += productsList.get(j).get(i);
            }
            minBasketCost = Math.min(currBasketPrice, minBasketCost);
        }
        return minBasketCost;
    }

    public static void main(String args[]) {

        List<List<Integer>> productsList = new ArrayList<>();

        int[] productArr1 = {12, 10, 10, 10, 11, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15,15, 15, 15, 15, 15, 16, 16, 14, 15, 16, 16, 16, 14};
        int[] productArr2  = {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 24, 24, 24, 24, 24, 24, 24,24, 24, 24, 20, 20, 20, 20, 20, 20, 22, 24};
        List<Integer> product2 = new ArrayList<>();
        product2.add(25);
        product2.add(23);
        product2.add(13);
        productsList.add(product2);

        List<Integer> product1 = new ArrayList<>();
        product1.add(5);
        product1.add(10);
        product1.add(20);
        productsList.add(product1);

        Test test = new Test();
        int res1 = test.findMinimumBasketCost(productsList);
        int res2 = test.findMinimumBasketForSameDay(productsList,3);
        System.out.println("min cost for all days: "+res1);
        System.out.println("min cost for each days "+res2);
    }
}
