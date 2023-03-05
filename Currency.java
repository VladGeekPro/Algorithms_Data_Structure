public class Currency implements Cloneable{
   
    String cname1;
    String cname2;
    String data;
    Double value;
    Integer number;

    public Currency(){};

    public Currency(String c1,String c2, String d, double v, int n ) 
    {
    this.cname1 = c1;
    this.cname2 = c2;
    this.data = d;
    this.value = v;
    this.number = n;
    }

    public Currency(Currency currency )
    {
    this.cname1 = currency.cname1;
    this.cname2 = currency.cname2;
    this.data = currency.data;
    this.value = currency.value;
    this.number = currency.number;  
    }

    public void displaycurrency()
    {
        System.out.println("cname1 : " + this.cname1);
		System.out.println("cname2 : " + this.cname2);
		System.out.println("data : " + this.data);
        System.out.println("value : " + this.value);
		System.out.println("number : " + this.number);		

    }


    @Override
    public Currency clone() throws CloneNotSupportedException 
    {
        return (Currency) super.clone();
    }

    public boolean equals(Object obj)
    {
        Currency otherCurrency = (Currency) obj;
        return  this.cname1 == otherCurrency.cname1 &&
        this.cname2 == otherCurrency.cname2 &&
        this.data == otherCurrency.data &&
        this.value == otherCurrency.value &&
        this.number == otherCurrency.number;
    } 

     

}