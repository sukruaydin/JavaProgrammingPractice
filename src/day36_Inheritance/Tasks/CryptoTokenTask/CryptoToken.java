package day36_Inheritance.Tasks.CryptoTokenTask;

public class CryptoToken {

    public double price;
    public int quantity;
    public int marketCap;
    public double volume;
    public double circulatingSupply;
    public boolean isMineAble;


    public void setInfo(double price, int quantity, int marketCap, double volume,
                        double circulatingSupply, boolean isMineAble) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineAble = isMineAble;
    }


    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineAble=" + isMineAble +
                '}';
    }



}
/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)
			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */
