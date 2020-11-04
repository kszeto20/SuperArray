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

  public int cap() {
    return capacity;
  }

  public boolean add(String element) {
    if (size >= capacity) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
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
    String[] bigData = new String[capacity + 10];
    for (int i = 0; i < size; i++) {
      bigData[i] = data[i];
    }
    data = bigData;
    capacity += 10;
  }

  public boolean isEmpty(){
    if (size == 0) {
      return true;
    }
    return false;
  }

  public void clear() {
    data = new String[10];
    size = 0;
  }

  public String toString() {
    String full = "[";
    for (int i = 0; i < data.length - 1; i++) {
      if (i < data.length - 2) {
        full += data[i] + ", ";
      }
      else {
        full = full + data[size] + "]";
      }
    }
    return full;
  }
}
