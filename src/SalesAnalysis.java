public class SalesAnalysis {

    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        double[] salesChange = {+12, -8, +15, +18, -22, +10,
                                +14, -5, +20, +8, -25, +6 };

        analyzeSales(salesChange, months);

    }

    public static void analyzeSales(double[] salesChange, String[] months) {

        double bestTotal = salesChange[0];
        int bestStart = 0;
        int bestEnd = 0;

        for (int start = 0; start < salesChange.length; start++) {

            double currentTotal = 0;

            for (int end = start; end < salesChange.length; end++) {

                currentTotal += salesChange[end];

                if (currentTotal > bestTotal) {
                    bestTotal = currentTotal;
                    bestStart = start;
                    bestEnd = end;

                }

            }
        }

        displayResults(months, bestStart, bestEnd, bestTotal);

    }

    public static void displayResults(String[] months, int bestStart,
                                      int bestEnd, double bestTotal) {

        System.out.println("Starting month: " + months[bestStart]);
        System.out.println("Ending month: " + months[bestEnd]);
        System.out.println("Highest combined sales change: " + bestTotal + " million");
    }


}
