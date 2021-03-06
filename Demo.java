public class Demo {

  public static void removeDuplicates (SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      String comp = s.get(i);
      for (int j = s.size() - 1; j > i; j--) {
        if (comp.equals(s.get(j))) {
          s.remove(j);
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray cross = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      String str = a.get(i);
      for (int j = 0; j < b.size(); j++) {
        if (b.get(j).equals(str)) {
          cross.add(b.get(j));
        }
      }
    }
    return cross;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray combo = new SuperArray();
    if (a.size() > b.size()) {
      for (int i = 0; i < a.size(); i++) {
        if (i < b.size()) {
          combo.add(a.get(i));
          combo.add(b.get(i));
        }
        else {
          combo.add(a.get(i));
        }
      }
    }
    else {
      for (int i = 0; i < b.size(); i++) {
        if (i < a.size()) {
          combo.add(a.get(i));
          combo.add(b.get(i));
        }
        else {
          combo.add(b.get(i));
        }
      }
    }
    return combo;
  }


  public static void main(String[]args){
    SuperArray words = new SuperArray();

    words.add("kani");   words.add("uni");
    words.add("ebi");    words.add("una");
    words.add("una");    words.add("ebi");
    words.add("kani");   words.add("una");
    words.add("una");    words.add("ebi");
    words.add("toro");   words.add("una");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

  }
}
