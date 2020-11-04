public class SuperArray {

  private String[] data;
  private int size; // current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size >= 10) {
      return false;
    }
    else {
      data[size] = element;
      size++;
      return true;
    }
  }

}
