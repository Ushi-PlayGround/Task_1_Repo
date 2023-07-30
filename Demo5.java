public class Demo5 {
    
    public static void main(String[] args) {
        
        int num1 = 453;
        int num2 = 23;
        int num3 = 3;
        int num4 = 2348190;

        final String COLOR1 = "\033[31;1m";
        final String COLOR2 = "\033[32;1m";
        final String COLOR3 = "\033[33;1m";
        final String COLOR4 = "\033[34;1m";

        final String RESET = "\033[30;0m";

        
        System.out.printf ("%s%s%9$s-%s%s%9$s-%s%s%9$s-%s%s%9$s \n" ,COLOR1,num1,COLOR2,num2,COLOR3,num3,COLOR4,num4,RESET);

        
    }

}
