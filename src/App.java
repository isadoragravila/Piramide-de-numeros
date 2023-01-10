public class App {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    for (int i = 0; i < array.length; i++) {
      String linha = "";
      for (int j = 0; j <= i; j++) {
        linha += array[i];
      }
      System.out.println(linha);
    }
  }
}
