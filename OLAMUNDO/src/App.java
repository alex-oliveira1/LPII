public class App {
    public static void main(String[] args) throws Exception {
        String nome="Alex";
        int tamanho;
        tamanho=20;
        System.out.println("Seja bem vindo: "+nome);
        int idade=-20;
        if (idade<18 && idade>0){
            System.out.println("É menor de idade");
        }
        else if (idade>18){
            System.out.println("É maior de idade");
        }
        else{
            System.out.println("Idade invalida");
        }
        
        for(int i=0;i<tamanho;i++){
          System.out.println(i);  
        }
    }
}
