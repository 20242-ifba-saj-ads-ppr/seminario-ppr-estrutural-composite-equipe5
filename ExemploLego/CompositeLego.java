package ExemploLego;

public class CompositeLego {
    public static void main(String[] args) {
    
        Lego blocoVermelho = new PecaLego("Bloco Vermelho");
        Lego blocoAzul = new PecaLego("Bloco Azul");
        Lego roda = new PecaLego("Roda");

        // Criando uma estrutura de Lego (Composite)
        EstruturaLego carro = new EstruturaLego("Carro de Lego");
        carro.adicionarPeca(blocoVermelho);
        carro.adicionarPeca(blocoAzul);
        carro.adicionarPeca(roda);

        // Criando outra estrutura composta (um conjunto de carros)
        EstruturaLego garagem = new EstruturaLego("Garagem de Lego");
        garagem.adicionarPeca(carro);
        garagem.adicionarPeca(new PecaLego("Placa de identificação"));

                // Exibindo as estruturas
                System.out.println("\n🔹 Exibindo o carro:");
                carro.exibir();
        
                System.out.println("\n🔹 Montando o carro:");
                carro.montar();
        
                System.out.println("\n🔹 Desmontando o carro:");
                carro.desmontar();
        
                System.out.println("\n🔹 Exibindo a garagem:");
                garagem.exibir();
        
                System.out.println("\n🔹 Montando a garagem:");
                garagem.montar();
        
                System.out.println("\n🔹 Desmontando a garagem:");
                garagem.desmontar();
            }
        }
}
