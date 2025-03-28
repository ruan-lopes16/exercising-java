# PART 1
## Cenário:
Imagine que você está desenvolvendo um sistema para uma concessionária de carros. O sistema precisa gerenciar diferentes tipos de veículos, suas características e funcionalidades.

**Requisitos:**

Classe Abstrata "Veiculo":

Defina uma classe abstrata chamada Veiculo com atributos como marca, modelo, ano e preco.
Crie um método abstrato exibirDetalhes() que deve ser implementado pelas subclasses.
Subclasses:

Crie subclasses como Carro, Moto e Caminhao que herdam de Veiculo.
Adicione atributos específicos para cada tipo de veículo (por exemplo, numeroPortas para Carro, cilindradas para Moto, capacidadeCarga para Caminhao).
Implemente o método exibirDetalhes() em cada subclasse para mostrar as informações completas do veículo.
Sobrescreva o método toString() em cada subclasse para retornar uma representação em String do objeto.
Interface "Motorizado":

Crie uma interface chamada Motorizado com um método ligarMotor().
Faça com que as classes Carro e Moto implementem essa interface.
Composição:

Crie uma classe chamada Motor com atributos como potencia e tipoCombustivel.
Faça com que as classes Carro e Moto tenham um objeto Motor como atributo.
Encapsulamento, Getters e Setters:

Aplique o princípio de encapsulamento em todas as classes, declarando atributos como private.
Forneça métodos getter e setter para acessar e modificar os atributos quando necessário.
Métodos com e sem Retorno:

Crie métodos com e sem retorno em diferentes classes para realizar operações como calcular o preço com desconto, verificar se um veículo é novo (com base no ano), etc.
Métodos com Referência e Referência entre Objetos:

Crie um método em uma classe Concessionaria que recebe um objeto Veiculo como parâmetro e exibe seus detalhes.
Crie uma classe Cliente que pode ter uma referência para um objeto Veiculo (o carro que o cliente comprou).
Método Estático:

Crie um método estático na classe Veiculo para calcular o imposto sobre um veículo, com base no preço.
Construtores:

Forneça construtores em todas as classes para inicializar os atributos de forma adequada.

---
# PART #2
## Validação de Dados:
Implemente validações para garantir que os dados de entrada sejam válidos. Por exemplo:
[x] Verifique se o ano do veículo é um valor positivo.
[x] Verifique se o preço do veículo é um valor positivo.
[x] Verifique se o número de portas do carro é um valor positivo.
[x] Verifique se as cilindradas da moto são um valor positivo.
[x] Verifique se a capacidade máxima do caminhão é um valor positivo.
[x] Verifique se a potência do motor é um valor positivo.
Você pode adicionar essas validações nos construtores e nos métodos setters das classes.

## Encapsulamento Aprimorado:
[x] Considere tornar os atributos marca e modelo da classe Veiculo como private e fornecer métodos getters para acessá-los. Isso garante um melhor encapsulamento e controle sobre o acesso aos atributos.

## Uso de Enums:
[x] Se houver atributos com um conjunto limitado de valores possíveis, considere usar enums para representá-los. Por exemplo, você pode criar um enum TipoCombustivel para representar os tipos de combustível do motor.

## Tratamento de Exceções (Erros):
[x] Explicação: Exceções são como "alertas" que o programa dá quando algo inesperado acontece. Para evitar que o programa pare de funcionar, precisamos "capturar" esses alertas e lidar com eles.
Exemplo: No método calcDesconto() da classe Carro, verifique se o percentual de desconto é válido:
Se o percentual for negativo ou maior que 100, exiba uma mensagem de erro.

# PART #3
Melhoria no código geral.

Criar uma classe Garagem para armazenar veículos
[x] Criar uma classe Garagem no pacote model.
[x] Declarar um atributo List<Veiculo> para armazenar os veículos.
[x] Criar um construtor que inicializa a lista.
[x] Criar um método adicionarVeiculo(Veiculo veiculo).
[x] Criar um método removerVeiculo(Veiculo veiculo).
[x] Criar um método buscarPorModelo(String modelo).
[x] Criar um método listarVeiculos() para exibir todos os veículos.
[x] Criar um método getQuantidadeVeiculos() para retornar a quantidade de veículos na garagem.

Criar um sistema de compra e venda de veículos
[x] Criar uma classe Usuario com um nome e saldo.
[] Criar um método comprarVeiculo(Veiculo veiculo, Garagem garagem), verificando o saldo.
[] Criar um método venderVeiculo(Veiculo veiculo, Garagem garagem), adicionando o valor ao saldo.
[] Atualizar a classe Garagem para remover e adicionar veículos ao usuário.

# PART #4
Criar um método para exibir veículos filtrados
[] Criar um método filtrarPorAno(int anoMinimo) na Garagem.
[] Criar um método filtrarPorPreco(double precoMaximo).
[] Criar um método filtrarPorTipo(Class<? extends Veiculo> tipo).

# PART FINAL
[x] Passar tudo para ingles

