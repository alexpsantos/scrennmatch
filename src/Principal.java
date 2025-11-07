import br.com.alex.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(10);
        meuFilme.avalia(5);

        meuFilme.exibeFilme();

        //System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de avalicções: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
