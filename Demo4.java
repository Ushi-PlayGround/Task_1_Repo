public class Demo4 {
    
    public static void main(String[] args) {
        
        int date = 23;
        int month = 05;
        int year = 2023;

        int second = 34;
        int minute = 45;
        int hour = 04;

        final String COLOR1 = "\033[31;1m";
        final String COLOR2 = "\033[32;1m";
        final String COLOR3 = "\033[33;1m";
        final String COLOR4 = "\033[34;1m";
        final String COLOR5 = "\033[35;1m";
        final String COLOR6 = "\033[36;1m";

        final String RESET = "\033[31;0m";
        

        System.out.printf("%s%02d%13$s/%s%02d%13$s/%s%04d%13$s %s%02d%13$s:%s%02d%13$s:%s%02d%1$s \n",COLOR1,date,COLOR2,month,COLOR3,year,COLOR4,second,COLOR5,minute,COLOR6,hour,RESET);
        
    }
}
