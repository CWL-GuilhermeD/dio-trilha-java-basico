import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            
            try {
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();
                terminal.close();
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException e) {
                System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
            }catch (InputMismatchException e){
                System.err.println("Ambos os parâmetros devem ser numeros inteiros.");
            }catch (ParametrosPositivosException e){
                System.err.println("Ambos os parâmetros devem ser positivos");
            }
            
            
        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException, ParametrosPositivosException {
            if (parametroUm > parametroDois || parametroUm == parametroDois) {
                throw new ParametrosInvalidosException();
            }

            else if (parametroUm < 0 || parametroDois < 0) {
                throw new ParametrosPositivosException();
            }
           
            else{
                int contagem = parametroDois - parametroUm;

                for (int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o numero " + i);
                    
                }
            }
                       
        }   
}