public class TestScript{
    public static void main(String[] args){
        Complexity w = new Compexity();
        System.out.println("Testing n^2 method with 5, yields 25");
        w.method1(5);
        System.out.println("Testing n^3 method with 3, yields 27");
        w.method4(5);
        System.out.println("Testing log(n) method with 16");
        w.method2(16);
        System.out.println("Testing nlog(n) method with 16");
        w.method3(4);
        System.out.println("Testing log(log(n)) method with 1024");
        w.method5(1024);
        System.out.println("Testing 2^n method with 10 (extra credit)");
        try{
            w.method6(10);
        } catch (Exception e){
            System.out.println("Either it errored out or student didn't do it");
        }
    }
}
