public class TEST_HW3{
    public static void main(String[] args){
        String[] testS = new String[] {"angry", "happy", "sad", "lonely", "excited"};
        Integer[] testI = new Integer[] {0, 1, 2, 3, 4};
        IDLList<String> q = new IDLList<>();
        IDLList<Integer> p = new IDLList<>();


        //testing add
        System.out.println("Testing add");
        try {
            for(String s : testS){
                assert q.add(s) : "adding " + s + " failed";
            }
            for(Integer i : testI){
                assert p.add(i): "adding " + Integer.toString(i) + " failed";
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
            assert q.add("scared", 5);
            assert p.add(5, 5);
        } catch (Exception e){
            System.out.println("failed add at index size");
        }

        try{
            assert q.add("jealous", 0);
            assert p.add(-1, 0);
        } catch (Exception e){
            System.out.println("failed add at index 0");
        }

        try{
            assert q.add("shy", 3);
            assert p.add(7, 3);
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
            assert q.append("surprised");
            assert p.append(9);
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
            assert q.get(0).compareTo("jealous") == 0 : "failed get at index 0";
            assert q.get(8).compareTo("surprised") == 0 : "failed getting last element";
            assert q.get(5).compareTo("happy") == 0: "failed getting at random index";

        } catch (Exception e) {
            System.out.println("failed get");
        }

        //testing getHead
        System.out.println("Testing getHead");
        try{
            assert p.getHead().compareTo(-1) == 0 : "failed getHead for Integer IDLList";
        } catch(Exception e) {
            System.out.println("failed getHead");
        }

        //testing getLast
        System.out.println("Testing getLast");
        try{
            assert q.getLast().compareTo("surprised") == 0 : "failed getLast";
        } catch (Exception e){
            System.out.println("failed getLast");
        }

        //testing size
        System.out.println("Testing size");
        try{
            assert p.size() == 9 : "failed size";
        } catch (Exception e){
            System.out.println("failed size");
        }

        //testing remove
        System.out.println("Testing remove");
        assert p.remove().compareTo(-1) == 0: "failed remove";
        assert q.remove().compareTo("jealous") == 0 : "failed remove";
        System.out.println("Should show: [excited lonely shy sad happy angry scared surprised]");
        System.out.println(q);

        //testing removeLast
        System.out.println("Testing removeLast");
        assert p.removeLast().compareTo(9) == 0 : "failed removeLast";
        System.out.println("Should show: [4 3 7 2 1 0 5]");
        System.out.println(p);

        //testing remove at index
        System.out.println("Testing remove at index");
        try{
            q.removeAtIndex(0);
            q.removeAtIndex(7);
            q.removeAtIndex(3);
        } catch (NoSuchMethodException e){
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
            }
        } catch (Exception e){
            System.out.println("failed removeAtIndex");
        }

        //testing remove(E elem)
        System.out.println("Testing remove(E elem)");

        System.out.println("Should show: [lonely shy sad angry scared]");
        System.out.println(q);
        assert q.remove("lonely") == true : "failed remove(E elem)";
        assert q.remove("cheese") == false : "failed remove(E elem) with erroneous input";
        System.out.println("Should show: [shy sad angry scared]");
        System.out.println(q);
    }
}
