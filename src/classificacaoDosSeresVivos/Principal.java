public class Principal {
    public static void main(String[] args) {
        // Criação de objetos individuais (Folhas no padrão Composite)
        SerVivo animalia = new Animalia();
        SerVivo chordata = new Chordata();
        SerVivo mammalia = new Mammalia();
        SerVivo primata = new Primata();
        SerVivo hominidae = new Hominidae();
        SerVivo homo = new Homo();
        SerVivo homoSapiens = new HomoSapiens();

        // Criação do objeto composto (Componente Composto no padrão Composite)
        GrupoSeresVivos grupo = new GrupoSeresVivos();
        
        // Adição de objetos individuais ao composto
        grupo.adicionarSerVivo(animalia);
        grupo.adicionarSerVivo(chordata);
        grupo.adicionarSerVivo(mammalia);
        grupo.adicionarSerVivo(primata);
        grupo.adicionarSerVivo(hominidae);
        grupo.adicionarSerVivo(homo);
        grupo.adicionarSerVivo(homoSapiens);

        // Operação uniforme sobre o composto
        grupo.mostrar();
    }
}
