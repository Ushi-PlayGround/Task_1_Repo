public class Demo3 {
    
    public static void main(String[] args) {
        
        int num1 = 277;
        int num2 = 325;
        int num3 = 4567;

        final String COLOR = "\033[34;1m";
        final String RESET = "\033[34;0m";

        System.out.printf("(%s%03d%s) %d-%d \n",COLOR,num1,RESET,num2,num3);
    }
}
