public class Contador {

    public static void main(String[] args) {
        try {
            // Verifica se dois parâmatros foram passados
            if (args.length != 2){
                throw new IllegalArgumentException("É necessário passar dois parâmetros númericos inteiros. ");
                }

                // Converte os parâmetros para inteiros
                int parametroUm = Integer.parseInt(args[0]);
                int parametroDois = Integer.parseInt(args[1]);

                // Chama o método para contar
                contar(parametroUm, parametroDois);

                } catch (ParametrosInvalidosException e) {
                    System.out.println(e.getMessage());
                
                } catch (NumberFormatException e){
                   System.out.println("Os parâmetros devem ser números internos. ");
                   
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());

                  }
                }

                static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
                   if (parametroUm > parametroDois){
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                }
                
                for (int i = 1; i <= (parametroDois - parametroUm); i++){
                    System.out.println("Imprimindo o número " + i);
                }
            }
    }
