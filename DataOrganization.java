


public class DataOrganization{
    public static void main(String[] args) throws CloneNotSupportedException {
           
    Currency c1 = new Currency("USD","TDA","01/06/2022",14.2,89);
    c1.displaycurrency();
        
    Currency c2 = new Currency(c1);
    System.out.println("\n");
    c2.displaycurrency();

    Currency c3 = (Currency) c1.clone();
    System.out.println("\n");
    c3.displaycurrency();
    Currency c4 = new Currency("MDL","TDA","01/06/2022",14.2,89);
    System.out.println("\n");
    c4.displaycurrency();

    System.out.println("\nAre c1 and c2 equal? - " + c1.equals(c2));
    System.out.println("\nAre c4 and c2 equal? - " + c4.equals(c2));



     String csvFile = "C:\\Users\\Vlad\\Desktop\\CurrencyData.csv";
     CSVReader.read(csvFile);
     CSVWriter.writeDataLineByLine(csvFile);
}

   
}  


