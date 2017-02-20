public class TestScript{
    public static void main(String[] args){
        System.out.println("Rubric:\nConstructors - 10pts\ngetLength - 5pts\ngetDigit - 5pts\nshiftR - 15pts\nadd - 30pts\ntoString - 10pts\ntoDecimal - 10pts\nclearOverflow - 5pts\n");
        System.out.println("testing constructors and toString");
        BinaryNumber c = new BinaryNumber(6);
        System.out.println(c);
        BinaryNumber b = new BinaryNumber("101101");
        System.out.println(b);
        try {
            BinaryNumber f = new BinaryNumber("123");
            System.out.println(f);
        } catch (Exception e) {
            System.out.println("failed");
            e.printStackTrace();
        }
        try{
            BinaryNumber g = new BinaryNumber(-1);
            System.out.println(g);
        } catch(Exception e) {
            System.out.println("failed");
            e.printStackTrace();
        }

        System.out.println("Testing length, should be 6");
        System.out.println(b.getLength());

        System.out.println("Testing getDigit, should be 1, then 0, then out of bounds.");
        try{
            System.out.println(b.getDigit(2));
            System.out.println(c.getDigit(2));
            System.out.println(c.getDigit(10));
        } catch (Exception e){
            System.out.println("failed");
            e.printStackTrace();
        }
        System.out.println("Testing shiftR, should be 00000000");
        c.shiftR(2);
        System.out.println(c);

        System.out.println("Testing add BE, should be 101110");
        try{
            b.add(new BinaryNumber("000001"));
            System.out.println(b);
        } catch (Exception e){
            System.out.println("failed");
            e.printStackTrace();
        }
        System.out.println("Testing add LE, should be 011101");
        try{
            BinaryNumber e = new BinaryNumber("101101");
            e.add(new BinaryNumber("100000"));
            System.out.println(e);
        } catch (Exception e){
            System.out.println("failed");
            e.printStackTrace();
        }
        System.out.println("Testing overflow checking");
        try{
            b.add(new BinaryNumber("101101"));
            System.out.println(b);
        } catch (Exception e){
            System.out.println("failed");
            e.printStackTrace();
        }
        System.out.println("Testing toDecimal, should yield 5");
        try{
            BinaryNumber a = new BinaryNumber("101");
            System.out.println(a.toDecimal());
        } catch (Exception e){
            System.out.println("failed");
            e.printStackTrace();
        }
    }
}
