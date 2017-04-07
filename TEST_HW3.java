public class TEST_HW3{

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        String[] testS = new String[] {"angry", "happy", "sad", "lonely", "excited"};
        Integer[] testI = new Integer[] {0, 1, 2, 3, 4};
        IDLList<String> q = new IDLList<>();
        IDLList<Integer> p = new IDLList<>();

        //testing add
        System.out.println("Testing add");
        try {
            for(String s : testS){
                q.add(s);
            }
            for(Integer i : testI){
                p.add(i);
            }
            System.out.println("Should show: [excited lonely sad happy angry]");
            System.out.println(q);
            System.out.println("Should show: [4 3 2 1 0]");
            System.out.println(p);
        } catch (Exception e){
            System.out.println("failed add");
        }

        //testing add at index
        System.out.println("Testing add at index");
        try {
            q.add(5,"scared");
            p.add(5, 5);
        } catch (Exception e){
            System.out.println("failed add at index size");
        }

        try{
            q.add(0, "jealous");
            p.add(0, -1);
        } catch (Exception e){
            System.out.println("failed add at index 0");
        }

        try{
            q.add(3, "shy");
            p.add(3, 7);
        } catch (Exception e){
            System.out.println("failed add at index");
        }
        System.out.println("Should show: [jealous excited lonely shy sad happy angry scared]");
        System.out.println(q);
        System.out.println("Should show [-1 4 3 7 2 1 0 5]");
        System.out.println(p);

        //testing append
        System.out.println("Testing append");
        try{
            q.append("surprised");
            p.append(9);
        } catch (Exception e){
            System.out.println("failed append");
        }
        System.out.println("Should show: [jealous excited lonely shy sad happy angry scared surprised]");
        System.out.println(q);
        System.out.println("Should show [-1 4 3 7 2 1 0 5 9]");
        System.out.println(p);

        //testing get
        System.out.println("Testing get");
        try{
            q.get(0).compareTo("jealous");
            q.get(8).compareTo("surprised");
            q.get(5).compareTo("happy");

        } catch (Exception e) {
            System.out.println("failed get");
        }

        //testing getHead
        System.out.println("Testing getHead");
        try{
            System.out.println(p.getHead());
        } catch(Exception e) {
            System.out.println("failed getHead");
        }

        //testing getLast
        System.out.println("Testing getLast");
        try{
            System.out.println(q.getLast());
        } catch (Exception e){
            System.out.println("failed getLast");
        }

        //testing size
        System.out.println("Testing size");
        try{
            System.out.println(p.size());
        } catch (Exception e){
            System.out.println("failed size");
        }

        //testing remove
        System.out.println("Testing remove");
        p.remove();
        q.remove();
        System.out.println("Should show: [excited lonely shy sad happy angry scared surprised]");
        System.out.println(q);

        //testing removeLast
        System.out.println("Testing removeLast");
        p.removeLast();
        System.out.println("Should show: [4 3 7 2 1 0 5]");
        System.out.println(p);

        //testing remove at index
        System.out.println("Testing remove at index");
        try{
            q.removeAtIndex(0);
            q.removeAtIndex(6);
            q.removeAtIndex(3);
        } catch (Exception e){
            System.out.println("failed removeAtIndex");

        }/* catch (NoSuchMethodError e){
        System.out.println("Used outdated naming scheme, no penalty yet");
        try{
        q.remove(0);
        q.remove(7);
        q.remove(3);
        System.out.println("Should show: [lonely shy sad angry scared]");
        System.out.println(q);
        assert q.remove("lonely") == true : "failed remove(E elem)";
        assert q.remove("cheese") == false : "failed remove(E elem) with erroneous input";
        System.out.println("Should show: [shy sad angry scared]");
        System.out.println(q);
        return;
        } catch(Exception f){
        System.out.println("failed remove");
        }*/

        //testing remove(E elem)
        System.out.println("Testing remove(E elem)");

        System.out.println("Should show: [lonely shy sad angry scared]");
        System.out.println(q);
        q.remove("lonely");
        q.remove("cheese");
        System.out.println("Should show: [shy sad angry scared]");
        System.out.println(q);
    }

}
