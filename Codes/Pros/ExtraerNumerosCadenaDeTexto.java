class Main {
  public static void main(String[] args) {
    System.out.println(""+getNumeros("jhe3H1mAA09pq6W"));
    
  }

public static String getNumeros(String cadena) {
  char [] cadena_div = cadena.toCharArray();
  String n = "";
  for (int i = 0; i < cadena_div.length; i++){
    if (Character.isDigit(cadena_div[i])){
      n+=cadena_div[i];
    }
  }
  return n;
}
}
