import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaCPF3 {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Map<String, String> mapaCPF = new HashMap<>();

                        mapaCPF.put("123.456.789-10", "(11) 98765-4321");
                        mapaCPF.put("987.654.321-00", "(22) 12345-6789");
                        mapaCPF.put("111.222.333-44", "(33) 55555-5555");

                        System.out.print("Digite um CPF para pesquisar: ");
                        String cpfPesquisado = scanner.nextLine();

                        if (mapaCPF.containsKey(cpfPesquisado)) {
                        String telefone = mapaCPF.get(cpfPesquisado);
                        System.out.println("Telefone do CPF " + cpfPesquisado + ": " + telefone);
                        } else {
                                System.out.println("CPF não encontrado.");
                                         }
        }
}