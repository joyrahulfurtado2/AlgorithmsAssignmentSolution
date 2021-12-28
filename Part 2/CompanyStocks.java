public class CompanyStocks {

	private int numberOfCompanies;
	private double stockPrice[];
	private boolean stockPriceInc[];
	
	public int getNumberOfCompanies() {
		return numberOfCompanies;
	}
	public void setNumberOfCompanies(int numberOfCompanies) {
		this.numberOfCompanies = numberOfCompanies;
	}
	public double[] getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double[] stockPrice) {
		this.stockPrice = stockPrice;
	}
	public boolean[] getStockPriceInc() {
		return stockPriceInc;
	}
	public void setStockPriceInc(boolean[] stockPriceInc) {
		this.stockPriceInc = stockPriceInc;
	}
	
	public CompanyStocks() {
		
	}
	public CompanyStocks(int numberOfCompanies, double[] stockPrice, boolean[] stockPriceInc) {
		super();
		this.numberOfCompanies = numberOfCompanies;
		this.stockPrice = stockPrice;
		this.stockPriceInc = stockPriceInc;
	}
	
	
	
}