package IntTest;

public class NestTry {
    public static void main(String args[]){
        try{
            int a = args.length;
            int b = 1 / a;
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
