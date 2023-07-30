public class Demo6b {
    
    public static void main(String[] args) {
        
        String name1 = "Alice";
        String name2 = "Bob";

        int age1 = 24;
        int age2 = 30;

        final String COLOR1 = "\033[34;1m";
        final String COLOR2 = "\033[35m";

        final String RESET = "\033[0m";


        System.out.println("+---------------+-----+");
        System.out.printf("| %1$sNAME%2$s\t\t| %1$sAGE%2$s | \n",COLOR1,RESET);
        System.out.println("+---------------+-----+");
        System.out.printf("| %-13s | %s%3d%s | \n",name1,COLOR2,age1,RESET);
        System.out.printf("| %-13s | %s%3d%s | \n",name2,COLOR2,age2,RESET);
        System.out.println("+---------------+-----+");

    }
}
