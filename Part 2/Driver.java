
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CompanyStocks stocks = new CompanyStocks();
		System.out.println("enter the no of companies");
		stocks.setNumberOfCompanies(sc.nextInt());
		stocks.setStockPriceInc(new boolean[stocks.getNumberOfCompanies()]);
		stocks.setStockPrice(new double[stocks.getNumberOfCompanies()]);


		for(int i =0; i< stocks.getNumberOfCompanies();++i) {
			System.out.println("Enter current stock price of the company "+(i+1));
			stocks.getStockPrice()[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stocks.getStockPriceInc()[i]=sc.nextBoolean();
		}
		boolean exit=false;

		while(exit==false) {
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			int option = sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Stock prices in descending order are :");
			StockService.sortArray(stocks.getStockPrice(),option);
			break;
			case 2: System.out.println("Stock prices in descending order are :");
			StockService.sortArray(stocks.getStockPrice(),option);
			break;
			case 3: System.out.println("Total no of companies whose stock price rose today : "+StockService.stockIncDec(stocks.getStockPriceInc(),true));
			break;
			case 4:	System.out.println("Total no of companies whose stock price declined today : "+StockService.stockIncDec(stocks.getStockPriceInc(),false));
			break;
			case 5: System.out.println("enter the key value");
			double stockValue = sc.nextDouble();
			StockService.stockSearch(stockValue, stocks.getStockPrice());
			break;
			case 0: System.out.println("Exited successfully");
			exit=true;
			break;
			default:System.out.println("Please enter options 1-6 only"); 

			}

		}

	}


}