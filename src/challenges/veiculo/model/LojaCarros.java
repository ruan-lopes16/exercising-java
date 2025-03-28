package challenges.veiculo.model;

import challenges.veiculo.exceptions.VeiculoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class LojaCarros {
    private List<Veiculo> veiculoList;

    // construtor que inicia a lista
    public LojaCarros() {
        this.veiculoList = new ArrayList<>();
    }

    // adicionar veiculos
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculoList.add(veiculo);
    }

    // remover veiculos
    public void removerVeiculo(Veiculo veiculo) throws VeiculoNaoEncontradoException {
        if (veiculoList.isEmpty()) {
            throw new VeiculoNaoEncontradoException("Não há carros para remover ou Carro não encontrado.");
        }
        boolean veiculoRemovido = veiculoList.remove(veiculo);
        if (!veiculoRemovido) {
            throw new VeiculoNaoEncontradoException("Veículo não encontrado na garagem.");
        }
    }

    // buscar veiculos - pelo modelo
    public void buscarPorModelo(String modelo) {
        veiculoList.stream()
                .filter(veiculo -> veiculo.getModelo().equalsIgnoreCase(modelo)) // Filtra os veículos na lista, mantendo apenas aqueles cujo modelo é igual ao modelo fornecido (ignorando maiúsculas e minúsculas).
                .forEach(veiculo -> {               //  Itera sobre os veículos filtrados e imprime os detalhes de cada veículo.
                    veiculo.exibirDetalhes();
                    System.out.println("----------------------------");
                });
    }

    // listar todos os veiculos
    public void listarVeiculos() {
        if (veiculoList.isEmpty()) {
            System.out.println("A garagem está vazia.");
        } else {
            System.out.println("Lista de veículos:");
            for (Veiculo veiculo : veiculoList) {
                System.out.println("- " + veiculo.getMarca() + " " + veiculo.getModelo());
            }
        }
    }

    // quantidade de veiculos
    public String quantidadeVeiculos() {
        return "Quantidade de veículos na garagem: " + veiculoList.size();
    }
}
