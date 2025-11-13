package br.com.alex.screenmatch.principal;

import br.com.alex.screenmatch.modelos.Filme;
import br.com.alex.screenmatch.modelos.Serie;
import br.com.alex.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme meuOutroFilme = new Filme("Avatar", 2023);
        meuOutroFilme.avalia(6);
        var filmeDoAlex = new Filme("DogVille", 2003);
        filmeDoAlex.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoAlex);
        lista.add(meuFilme);
        lista.add(meuOutroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Fulano");
        buscarPorArtista.add("Beltrano");

        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println("após ordenação");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);

    }
}
