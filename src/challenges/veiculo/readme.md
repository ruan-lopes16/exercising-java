Cenário:

Imagine que você está desenvolvendo um sistema para uma concessionária de carros. O sistema precisa gerenciar diferentes tipos de veículos, suas características e funcionalidades.

Requisitos:

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
Desafio Adicional:

Crie uma classe Garagem que pode armazenar uma lista de objetos Veiculo.
Implemente métodos na classe Garagem para adicionar, remover e exibir os veículos na garagem.
Este exercício permitirá que você pratique todos os conceitos de Java mencionados de forma integrada e contextualizada. Lembre-se de que a implementação completa do código pode ser extensa, mas este guia fornece uma estrutura sólida para você começar.