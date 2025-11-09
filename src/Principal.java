import br.com.alex.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alex.screenmatch.calculos.Classificavel;
import br.com.alex.screenmatch.calculos.FiltroRecomendacao;
import br.com.alex.screenmatch.modelos.Episodio;
import br.com.alex.screenmatch.modelos.Filme;
import br.com.alex.screenmatch.modelos.Serie;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(7);
        lost.setMinutosPorEpisodio(45);
        lost.exibeFilme();
        System.out.println("Duração: " + lost.getDuracaoEmMinutos());



        Filme meuOutroFilme = new Filme();

        meuOutroFilme.setNome("Avatar");
        meuOutroFilme.setAnoDeLancamento(2023);
        meuOutroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(meuOutroFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println("Tempo total do filme: " + calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
