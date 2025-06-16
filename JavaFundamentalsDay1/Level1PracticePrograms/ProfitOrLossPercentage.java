package Level1PracticePrograms;

public class ProfitOrLossPercentage {
    public static void main(String[] args) {
        double costPrice = 129.0; 
        double sellingPrice = 191.0; 
        System.out.println("The Cost Price is INR: " + costPrice + " and Selling Price is INR : " + sellingPrice);

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("The Profit is INR :" +profit +"and the Percentage is: " + profitPercentage );
           
        } else {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("Loss Percentage: " + lossPercentage + "%");
          
        } 
    }
}
