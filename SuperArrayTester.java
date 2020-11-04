public class SuperArrayTester {
  public static void main(String[] args) {

    SuperArray test = new SuperArray();

    System.out.println(test.isEmpty());
    System.out.println(test.size());
    System.out.println(test.add("hello0"));
    System.out.println(test.size());
    System.out.println(test.add("hello1"));
    System.out.println(test.size());
    System.out.println(test.add("hello2"));
    System.out.println(test.size());
    System.out.println(test.add("hello3"));
    System.out.println(test.size());
    System.out.println(test.add("hello4"));
    System.out.println(test.size());
    System.out.println(test.add("hello5"));
    System.out.println(test.size());
    System.out.println(test.add("hello6"));
    System.out.println(test.size());
    System.out.println(test.add("hello7"));
    System.out.println(test.size());
    System.out.println(test.add("hello8"));
    System.out.println(test.size());
    System.out.println(test.add("hello9"));
    System.out.println(test.size());
    System.out.println();
    System.out.println(test.add("hello10"));
    System.out.println(test.size());
    System.out.println(test.add("hello11"));
    System.out.println(test.size());
    System.out.println(test.add("hello12"));
    System.out.println(test.size());
    System.out.println(test.add("hello13"));
    System.out.println(test.size());
    System.out.println(test.add("hello14"));
    System.out.println(test.size());
    System.out.println(test.add("hello15"));
    System.out.println(test.size());
    System.out.println(test.add("hello16"));
    System.out.println(test.size());
    System.out.println(test.add("hello17"));
    System.out.println(test.size());
    System.out.println(test.add("hello18"));
    System.out.println(test.size());
    System.out.println(test.add("hello19"));
    System.out.println(test.size());
    System.out.println(test.add("hello20"));
    System.out.println(test.size());
    System.out.println(test.add("hello21"));
    System.out.println(test.size());
    System.out.println(test.add("hello22"));
    System.out.println(test.size());
    System.out.println();



    System.out.println(test.get(0));
    System.out.println(test.get(1));
    System.out.println(test.get(2));
    System.out.println(test.get(3));
    System.out.println(test.get(4));
    System.out.println(test.get(5));
    System.out.println(test.get(6));
    System.out.println(test.get(7));
    System.out.println(test.get(8));
    System.out.println(test.get(9));
    System.out.println(test.get(10));

    System.out.println(test.isEmpty());

    /*
    test.clear();
    System.out.println(test);
    */

    System.out.println();
    System.out.println(test.contains("hello192847298"));

    System.out.println();
    SuperArray next = new SuperArray(500);
    System.out.println(next.cap());

    test.add(5, "hello");
    System.out.println(test);
    System.out.println(test.get(5));

    test.remove(5);
    System.out.println(test);
    System.out.println(test.get(5));

    System.out.println(test.indexOf("hello20"));
  }
}
