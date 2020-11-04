public class SuperArray {

  private String[] data;
  private int size; // current size
  private int capacity;

  public SuperArray() {
    data = new String[10];
    size = 0;
    capacity = 10;
  }

  public int size() {
    return size;
  }

  //public int cap() {
    //return capacity;
  //}

  public boolean add(String element) {
    if (size >= capacity) {
      resize();
      data[size] = element;
      size++;
      return true;
    }
    else {
      data[size] = element;
      size++;
      return true;
    }
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String orig = data[index];
    data[index] = element;
    return orig;
  }

  private void resize() {
    String[] bigData = new String[size + 10];
    for (int i = 0; i < size; i++) {
      bigData[i] = data[i];
    }
    data = bigData;
    capacity += 10;
  }
}
