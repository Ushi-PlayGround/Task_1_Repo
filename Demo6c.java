public class Demo6c {
    
    public static void main(String[] args) {
        
        String city1 = "Los Angeles";
        String state1 = "California";
        int population1 = 3966936;


        String city2 = "\033[32mNew\033[0m York";
        String state2 = "\033[32mNew\033[0m York";
        int population2 = 8336817;

        final String COLOR1 = "\033[32m";
        final String COLOR2 = "\033[35m";

        final String RESET = "\033[0m"; 
        final String BOLD = "\033[1m";

        System.out.println("+-------------+----------------+------------+");
        System.out.printf("| %1$sCITY%2$s\t      | %1$sSTATE%2$s\t       | %1$sPOPULATION%2$s | \n",BOLD,RESET);
        System.out.println("+-------------+----------------+------------+");
        System.out.printf("| %-10s | %-14s | %s%,-10d%s | \n",city1,state1,COLOR2,population1,RESET);
        System.out.printf("| %-20s | %-23s | %s%,-10d%s | \n",city2,state2,COLOR2,population2,RESET);
        System.out.println("+-------------+----------------+------------+");
        
    }
}
