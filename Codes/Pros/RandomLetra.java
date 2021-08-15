import java.util.RandomLetra;

public class Main {
    public static void main(String[] args) {

Random letra = new Random();
int i = 0;
do {
  char abc = (char)(letra.nextInt(26) + 'a' + 'l');
  System.out.println(abc);
}
  while(i < 8);
  i++;

}
}
