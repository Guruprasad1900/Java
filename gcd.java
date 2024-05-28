public class gcd {
    public static void main(String[] args){
        int p = 12;
        int q = 8;
        int gcd = 0;

        for(int i=1;i<p && i<q;i++){
            if(p %i==0 && q%i == 0){
                gcd = i;
            }
            
        }System.out.println("the gcd is"+gcd);
    }
    
}
