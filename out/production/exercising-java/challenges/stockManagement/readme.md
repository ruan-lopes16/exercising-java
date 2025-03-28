**Briefing para Projeto em Java**

### 1. **Descrição do Projeto**
O objetivo é desenvolver um sistema simples em Java que utilize os principais conceitos de Programação Orientada a Objetos (POO) e outras funcionalidades essenciais da linguagem. O projeto será um **sistema de gerenciamento de produtos em um estoque**, onde será possível cadastrar, listar, atualizar e remover produtos.

### 2. **Requisitos Técnicos**
O código deve conter e demonstrar os seguintes conceitos:

#### **2.1 Arrays e ArrayList**
- Criar um **array** para armazenar uma quantidade fixa de produtos.
- Criar um **ArrayList** para armazenar produtos de forma dinâmica, permitindo adição e remoção.
- Demonstrar a diferença entre arrays e `ArrayList` e quando usar cada um.
- Implementar um método que percorra ambos e exiba os produtos cadastrados.

#### **2.2 Records**
- Criar um `record` chamado `ProdutoRecord`, que armazene informações imutáveis como nome, preço e código do produto.
- Demonstrar as vantagens do `record` em relação a classes tradicionais para objetos imutáveis.

#### **2.3 Equals**
- Implementar o método `equals()` para comparar produtos com base em um identificador único (como código do produto).
- Criar uma classe de teste para verificar se a comparação entre objetos funciona corretamente.

#### **2.4 Construtores**
- Criar um **construtor padrão** para inicializar valores padrão de um produto.
- Criar um **construtor parametrizado** para definir os atributos no momento da criação do objeto.
- Explicar quando e por que utilizar mais de um construtor.

#### **2.5 Exceptions**
- Implementar tratamento de exceções (`try-catch`) para capturar erros comuns, como:
    - Cadastro de um produto com valores inválidos.
    - Tentativa de acesso a um índice inválido no array.
- Criar **exceções personalizadas** (`ProdutoNaoEncontradoException`) para situações específicas, como buscar um produto inexistente.
- Demonstrar como lançar exceções (`throw`) e capturá-las corretamente.

#### **2.6 Getters e Setters**
- Criar métodos `get` para acessar informações privadas do produto.
- Criar métodos `set` para modificar valores, validando se são válidos antes de atualizar o atributo.
- Explicar por que getters e setters são importantes para encapsulamento.

#### **2.7 Package**
- Estruturar o projeto em **pacotes separados**, por exemplo:
    - `models` para classes de domínio.
    - `services` para regras de negócio.
    - `exceptions` para exceções personalizadas.
    - `app` para a classe principal.
- Explicar a importância da organização do código em pacotes.

#### **2.8 Encapsulamento, Herança e Polimorfismo**
- Demonstrar **encapsulamento** tornando atributos privados e acessíveis apenas via métodos.
- Criar uma classe `Produto` e duas subclasses (`ProdutoPerecivel` e `ProdutoNaoPerecivel`) para demonstrar **herança**.
- Demonstrar **polimorfismo** sobrescrevendo métodos em subclasses e utilizando a classe base de forma genérica.

#### **2.9 String()**
- Demonstrar manipulações comuns com `String`, como:
    - `toUpperCase()` e `toLowerCase()` para padronizar textos.
    - `split()` para dividir strings (exemplo: processar um CSV de produtos).
    - `replace()` para substituir caracteres específicos em descrições.
- Criar exemplos práticos dentro do sistema de estoque.

#### **2.10 Pattern Matching**
- Utilizar `instanceof` com pattern matching para verificar o tipo de produto antes de realizar operações específicas.
- Criar um método que receba um `Object` e execute ações diferentes dependendo do tipo real do objeto.

#### **2.11 Classes Seladas (Sealed Classes)**
- Criar uma classe selada `ProdutoBase` que permite apenas subclasses específicas (`ProdutoPerecivel` e `ProdutoNaoPerecivel`).
- Demonstrar a utilidade desse conceito para restringir a herança.

#### **2.12 Interface**
- Criar uma interface `Desconto` com um método `calcularDesconto()`.
- Implementar essa interface em classes diferentes para aplicar regras de desconto específicas.

#### **2.13 Método Abstrato**
- Criar uma classe abstrata `ProdutoAbstrato` com um método abstrato `calcularPrecoFinal()`.
- Implementar esse método em subclasses com regras diferentes para calcular o preço final do produto.

#### **2.14 POO (Programação Orientada a Objetos)**
- Garantir que o projeto siga os princípios básicos da POO:
    - **Encapsulamento:** Controlar acesso aos atributos.
    - **Herança:** Criar hierarquia de classes.
    - **Polimorfismo:** Sobrescrever métodos.
    - **Abstração:** Criar classes e métodos abstratos.

### 3. **Funcionalidades do Projeto**
- **Cadastro de produtos** com nome, preço e categoria.
- **Listagem de produtos** com opção de exibição filtrada.
- **Atualização de informações** como preço e descrição.
- **Remoção de produtos** do sistema.
- **Manipulação de dados** usando os conceitos listados acima.
- **Busca avançada de produtos**, usando `equals()` para comparação.

### 4. **Entrega Final**
O código deve ser bem estruturado, organizado dentro de pacotes e conter **comentários explicativos** para facilitar o entendimento. O objetivo principal é aplicar e fixar os conceitos de Java enquanto desenvolvemos algo funcional.

---
Agora o briefing está ainda mais detalhado e pronto para ser usado no desenvolvimento do projeto. Se precisar de mais alguma explicação, só avisar! 🚀

---
1. Estruturando o Projeto
   Comece organizando os arquivos em pacotes para deixar o código bem dividido:

📂 meuProjeto
📁 app → Contém a classe principal (Main.java)
📁 models → Contém as classes que representam os objetos principais (Produto, ProdutoPerecivel, etc.)
📁 services → Contém classes que fazem a lógica do sistema (exemplo: EstoqueService)
📁 exceptions → Contém exceções personalizadas (exemplo: ProdutoNaoEncontradoException)
📁 interfaces → Contém as interfaces (exemplo: Desconto.java)

2. Implementando Cada Conceito

📌 Arrays e ArrayList
No EstoqueService.java, crie um array fixo para armazenar poucos produtos e um ArrayList para manipular dinamicamente.
Faça um método para percorrer e exibir os produtos cadastrados.

📌 Records
No pacote models, crie um record chamado ProdutoRecord que armazene dados imutáveis como nome, preço e código.

📌 Equals
No Produto.java, sobrescreva o método equals() para comparar produtos pelo código.

📌 Construtores
No Produto.java, crie um construtor padrão e um construtor parametrizado para inicializar os atributos ao criar um objeto.

📌 Exceptions
No pacote exceptions, crie ProdutoNaoEncontradoException.java.
No EstoqueService.java, trate exceções ao buscar um produto inexistente.

📌 Getters e Setters
No Produto.java, adicione getters para acessar atributos e setters que validam os valores antes de alterá-los.

📌 Package
Todos os arquivos devem estar organizados nos pacotes certos (models, services, exceptions, etc.).

📌 Encapsulamento, Herança e Polimorfismo
Encapsulamento: No Produto.java, torne os atributos privados e use getters e setters para acessá-los.
Herança: Crie ProdutoPerecivel.java e ProdutoNaoPerecivel.java, herdando de Produto.java.
Polimorfismo: No EstoqueService.java, use uma lista de Produto para armazenar diferentes tipos de produtos.

📌 String()
No Produto.java, crie um método para formatar o nome do produto (exemplo: transformar tudo para maiúsculas).

📌 Pattern Matching
No EstoqueService.java, use instanceof para verificar se um objeto é ProdutoPerecivel e exibir informações extras.

📌 Classes Seladas (Sealed Classes)
No ProdutoBase.java, use sealed para restringir as subclasses permitidas (ProdutoPerecivel e ProdutoNaoPerecivel).

📌 Interface
No pacote interfaces, crie Desconto.java com um método calcularDesconto().
No Produto.java, implemente essa interface e defina regras de desconto para diferentes produtos.

📌 Método Abstrato
No ProdutoAbstrato.java, crie um método abstrato calcularPrecoFinal().
No Produto.java, implemente esse método para definir o cálculo do preço final.

📌 POO (Programação Orientada a Objetos)
Garanta que tudo seja bem estruturado, seguindo os princípios de encapsulamento, herança, polimorfismo e abstração.