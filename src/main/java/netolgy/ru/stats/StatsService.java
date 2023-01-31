package netolgy.ru.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int avgSaleOnMonth(int[] sales) {
        int avgSale = sumAllSales(sales) / sales.length;

        return avgSale;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

      public int monthLessAvg(int[] sales) {
        int monthLess = 0;
        int avg = avgSaleOnMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg)
                monthLess = monthLess + 1;
        }
        return monthLess;
    }

    public int monthMoreAvg(int[] sales) {
        int monthMore = 0;
        int avg = avgSaleOnMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg)
                monthMore = monthMore +1;
        }
        return monthMore;



    }

    }






