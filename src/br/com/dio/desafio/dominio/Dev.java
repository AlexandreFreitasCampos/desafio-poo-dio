package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> coteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> coteudosCocluidos = new LinkedHashSet<>();

    public void iscreverBootcamp(Bootcamp bootcamp){
        this.coteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.coteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.coteudosCocluidos.add(conteudo.get());
            this.coteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularTotalXp(){
       return this.coteudosCocluidos
               .stream()
               .mapToDouble(Conteudo::calcularXp)
               .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCoteudosInscritos() {
        return coteudosInscritos;
    }

    public void setCoteudosInscritos(Set<Conteudo> coteudosInscritos) {
        this.coteudosInscritos = coteudosInscritos;
    }

    public Set<Conteudo> getCoteudosCocluidos() {
        return coteudosCocluidos;
    }

    public void setCoteudosCocluidos(Set<Conteudo> coteudosCocluidos) {
        this.coteudosCocluidos = coteudosCocluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(coteudosInscritos, dev.coteudosInscritos) && Objects.equals(coteudosCocluidos, dev.coteudosCocluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, coteudosInscritos, coteudosCocluidos);
    }
}
