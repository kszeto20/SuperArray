public class SuperArray {

  private String[] data;
  private int size; // current size
  private int capacity;

  public SuperArray() {
    data = new String[10];
    size = 0;
    capacity = 10;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
    capacity = initialCapacity;
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
    String[] bigData = new String[capacity * 2];
    for (int i = 0; i < size; i++) {
      bigData[i] = data[i];
    }
    data = bigData;
    capacity = capacity * 2;
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
    for (int i = 0; i < size - 1; i++) {
        full = full + data[i] + ", ";
      }
        full = full + data[size - 1] + "]";
        return full;
  }

  public boolean contains(String s) {
    if (size == 0){
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (data[i] == s) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    if (size + 1 >= capacity) {
      resize();
    }
    for (int i = size + 1; i > index; i--) {
      data[i] = data[i - 1];
    }
    data[index] = element;
    size++;
  }

  public String remove(int index) {
    String removed = data[index];
    for (int i = index; i < size; i++) {
      data[i] = data[i + 1];
    }
    size--;
    return removed;
  }

  public int indexOf(String s) {
     int index = -1;
    for (int i = 0; i < size; i++) {
      if(data[i].equals(s)) {
        index = i;
      }
    }
    return index;
  }

  public String[] toArray() {
    String[] onlyMem = new String[size];
    for (int i = 0; i < size; i++) {
      onlyMem[i] = data[i];
    }
    return onlyMem;
  }
}
