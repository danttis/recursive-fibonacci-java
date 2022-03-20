import java.util.Scanner;
class Fibonacci{
  public static void main(String args[]){
    Scanner ler = new Scanner(System.in); 
    int m;
    System.out.println("Digite o tamanho da sequência de Fibonacci que deseja obter");
    m = ler.nextInt();
    for(int i = 0; i < m ; i++){
    System.out.print(Fibonacci.fibonacci(i) + " ");
    }
  }
  static int fibonacci(int e){
    if(e < 2){
    return e;
    }
    else{
      return(fibonacci(e - 1) + fibonacci(e - 2));
    }
  }
}