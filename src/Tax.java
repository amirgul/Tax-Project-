public class Tax
{
    public static double basicRate = 4.00;        //4%.

    public static double luxuryRate = 10.00;      //10%.

    public static void computeCostBasic(double price)
    {
        System.out.println("The given price is: "+ price);
        double amount = basicRate/100 *price;
        System.out.println("Basix tax for price: "+ price +" is: given below");
        roundToNearestPenny(amount);

    }
    public static void computeCostLuxury(double price)
    {
        System.out.println("the given price is: "+ price);
        double amount = luxuryRate/100 * price;
        System.out.println("Luxury tax for price: "+ price +"  is give below");
        roundToNearestPenny(amount);
    }

    public static void changeBasicRateTo(double newRate)
    {
        System.out.println("our new basic tax rate is: "+ newRate);
        basicRate = newRate;
        computeCostBasic(989.98);

    }

    public static void changeLuxuryRateTo(double newRate)
    {
        System.out.println("Our new luxury rate is: "+ newRate);
        luxuryRate = newRate;
        computeCostLuxury(988.98);
    }






    public static void roundToNearestPenny(double price)
    {

        int allCents = (int)Math.round(price *100);
        int dollars = allCents/100;
        int cents = allCents%100;


        System.out.print(dollars);
        System.out.print(".");
        if(cents < 10)
        {
            System.out.print(0);
            System.out.print(cents);
        }
        else
            System.out.print(cents);





    }

}
