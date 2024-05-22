import java.util.HashMap;
import java.util.Map;

public class ProgramaCPF2 {

    public static void main(String[] args) {
                    Map<String, String> mapaCPF = new HashMap<>();

                        mapaCPF.put("123.456.789-00", "(11) 98765-4321");
                        mapaCPF.put("987.654.321-00", "(22) 12345-6789");
                        mapaCPF.put("111.222.333-44", "(33) 55555-5555");

                        System.out.println("CPF\t\tTelefone");
                        System.out.println("-----------------------");
                        for (Map.Entry<String, String> entry : mapaCPF.entrySet()) {
                        System.out.println(entry.getKey() + "\t" + entry.getValue());
                        }
                        }
                }