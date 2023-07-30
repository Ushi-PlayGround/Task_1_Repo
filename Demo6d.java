public class Demo6d {
    
    public static void main(String[] args) {
        
        String item1 = "Apples";
        int quantity1 = 5;
        float price1 = 0.99f; 

        String item2 = "Oranges";
        int quantity2 = 10;
        float price2 = 1.49f; 

        String priceUnit = "\033[32;1m$\033[0m";

        
        final String COLOR2 = "\033[34m";
        final String COLOR3 = "\033[35m";


        final String RESET = "\033[0m"; 
        final String BOLD = "\033[1m";

        System.out.println("+---------+----------+--------+");
        System.out.printf("| %1$sITEM%2$s    | %1$sQUANTITY%2$s | %1$sPRICE%2$s  | \n",BOLD,RESET);
        System.out.println("+---------+----------+--------+");
        System.out.printf("| %-7s | %s%8d%7$s | %s%s%5.2f%7$s | \n",item1,COLOR2,quantity1,priceUnit,COLOR3,price1,RESET);
        System.out.printf("| %-7s | %s%8d%7$s | %s%s%5.2f%7$s | \n",item2,COLOR2,quantity2,priceUnit,COLOR3,price2,RESET);
        System.out.println("+---------+----------+--------+");
        

    }
}
