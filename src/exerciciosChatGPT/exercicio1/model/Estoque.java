package exerciciosChatGPT.exercicio1.model;

import exerciciosChatGPT.exercicio1.expection.EstoqueInsuficienteException;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<String, Integer> saldos;

    public Estoque() {
        this.saldos = new HashMap<>();
    }

    public void adicionar(String codigo, int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        int atual = saldos.getOrDefault(codigo, 0);

        saldos.put(codigo, atual + qtd);
    }

    public void remover(String codigo, int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        int atual = saldos.getOrDefault(codigo, 0);

        if (atual < qtd) {
            throw new EstoqueInsuficienteException("Estoque insuficiente para o produto: " + codigo);
        }
        saldos.put(codigo, atual - qtd);
    }

    public int getQuantidade(String codigo) {

        return saldos.getOrDefault(codigo, 0);
    }
}
