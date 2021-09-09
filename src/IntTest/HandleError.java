package IntTest;

import java.util.Random;

public class HandleError {
    public static void main(String args[]){
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for(int i = 0; i < 32000;i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
                int l[] = {1};
                l[10] = 1;
            } catch (ArithmeticException e){
                System.out.println(e);
                a = 0;
            } catch (ArrayIndexOutOfBoundsException ar){
                System.out.println(ar);
            }
            System.out.println("a: " + a);
        }
    }
}
