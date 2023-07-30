public class Demo6a {
    
    public static void main(String[] args) {
        
        
        final String COLOR1 = "\u001B[41m";
        final String COLOR2 = "\u001B[42m";
        final String RESET = "\033[0m";

    
        System.out.printf("%s[%4$s5%5$s%s0%s%4$s]%5$s \n",COLOR1,COLOR2,'%',"        ",RESET);

    }
}
