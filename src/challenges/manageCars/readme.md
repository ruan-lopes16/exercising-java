ENGLISH
# Project: Racing Car Fleet Management System
**Objective**: Create a system to manage a fleet of racing cars.
The system should allow adding, listing, removing, and updating cars, as well as providing functionalities to calculate race time and check vehicle maintenance.
Exceptions must be handled to ensure that operations are performed robustly and safely.

## Project Structure:
1. Car Class
   - Represents a racing car in the fleet.
   - Attributes:
     - `id`: Unique identifier of the car.
     - `model`: Car model (e.g., Ferrari, Porsche).
     - `maxSpeed`: The maximum speed the car can reach.
     - `bestLapTime`: Best time recorded in a race.
     - `needsMaintenance`: Boolean indicator to know if the car needs maintenance.
   - Methods:
     - `getters` and `setters`.
     - `calculateLapTime(double distance)`: Method that calculates the time it takes for the car to travel a distance based on its maxSpeed.
     - `registerBestLap(double time)`: Updates the car's best lap time if the recorded time is lower.
     - `checkMaintenance(double odometer)`: Checks if the car needs maintenance and throws an exception if necessary.
     
2. CarFleet Class
   -  Represents a collection of racing cars.
   - Attributes:
     - `ArrayList<Car>`: The list that stores the racing cars.
   - Methods:
     - `addCar(Car car)`: Adds a car to the fleet.
     - `removeCar(int id) throws CarNotFoundException`: Removes a car based on the ID. If not found, throws an exception.
     - `updateCar(int id, Car newCar) throws CarNotFoundException`: Updates the information of an existing car. If not found, throws an exception.
     - `listCars()`: Lists all cars in the fleet.
     - `checkCarsForMaintenance()`: Lists the cars that need maintenance.
        
3. Main Class
 - Controls the user's interaction with the system.
- Allows the user to choose between the operations: add, list, remove, update, or check cars.
- Handles exceptions (e.g., car not found or invalid input).

**Exceptions**:
- `CarNotFoundException`: Thrown when the system tries to remove or update a car that does not exist in the fleet.
- `MaintenanceNeededException`: Thrown when a car needs maintenance before being used in a race.
- `InvalidInputException`: Thrown when the user enters invalid data (e.g., negative speed or negative lap time).

**System Flow**:
1. The user can interact with the system to add cars to the racing fleet, list the cars, remove a car, or update a car.
2. When adding a car, the system requests the information and creates the car, and can also record its best lap time. 3
3. The system can calculate the lap time of each car, check if it is ready for the race, and identify if any car needs maintenance.
4. The system handles exceptions, such as trying to remove a car that does not exist or trying to use a car that needs maintenance.

**Extra Functionality:**
*Race Challenge:*
The user can challenge a car from the fleet for a simulated race. The system calculates the car's time, based on its maximum speed, and if the car is not in good condition (needing maintenance), an exception is thrown.

---

PT-BR
# Projeto: Sistema de Gerenciamento de Frota de Carros de Corrida
**Objetivo**: Criar um sistema para gerenciar uma frota de carros de corrida. 
O sistema deve permitir adicionar, listar, remover e atualizar os carros, além de fornecer funcionalidades para calcular o tempo de corrida e verificar a manutenção dos veículos. 
Exceções devem ser tratadas para garantir que as operações sejam realizadas de forma robusta e segura.

## Estrutura do projeto:
1. Classe Carro
    - Representa um carro de corrida na frota.
    - Atributos:
        - `id`: Identificador único do carro.
        - `modelo`: Modelo do carro (ex: Ferrari, Porsche).
        - `velocidadeMaxima`: A velocidade máxima que o carro pode atingir.
        - `tempoMelhorVolta`: Melhor tempo registrado em uma corrida.
        - `necessitaManutencao`: Indicador booleano para saber se o carro precisa de manutenção.
    - Métodos:
        - `getters` e `setters`.
        - `calcularTempoDeVolta(double distancia)`: Método que calcula o tempo que o carro leva para percorrer uma distância baseada na sua velocidadeMaxima.
        - `registrarMelhorVolta(double tempo)`: Atualiza o tempo da melhor volta do carro, caso o tempo registrado seja menor.
        - `verificarManutencao(double odometro)`: Verifica se o carro precisa de manutenção e lança uma exceção se necessário.

2. Classe FrotaDeCarros
    - Representa uma coleção de carros de corrida.
        - Atributos:
        - `ArrayList<Carro>`: A lista que armazena os carros de corrida.
    - Métodos:
        - `adicionarCarro(Carro carro)`: Adiciona um carro à frota.
        - `removerCarro(int id) throws CarroNaoEncontradoException`: Remove um carro com base no ID. Se não encontrado, lança uma exceção.
        - `atualizarCarro(int id, Carro carroNovo) throws CarroNaoEncontradoException`: Atualiza as informações de um carro existente. Se não encontrado, lança uma exceção.
        - `listarCarros()`: Lista todos os carros da frota.
        - `verificarCarrosParaManutencao()`: Lista os carros que precisam de manutenção.
    
3. Classe Principal (Main)
    - Controla a interação do usuário com o sistema.
    - Permite que o usuário escolha entre as operações: adicionar, listar, remover, atualizar ou verificar carros.
    - Trata exceções (por exemplo, carro não encontrado ou entrada inválida).

**Exceções**:
1. `CarroNaoEncontradoException`: Lançada quando o sistema tenta remover ou atualizar um carro que não existe na frota.
2. `ManutencaoNecessariaException`: Lançada quando um carro precisa de manutenção antes de ser usado em uma corrida.
3. `EntradaInvalidaException`: Lançada quando o usuário insere dados inválidos (ex: velocidade negativa ou tempo de volta negativo).

**Fluxo do Sistema**:
1. O usuário pode interagir com o sistema para adicionar carros à frota de corrida, listar os carros, remover um carro ou atualizar um carro.
2. Ao adicionar um carro, o sistema solicita as informações e cria o carro, podendo registrar também seu melhor tempo de volta. 3
3. O sistema pode calcular o tempo de volta de cada carro, verificar se ele está pronto para a corrida e identificar se algum carro precisa de manutenção.
4. O sistema trata exceções, como tentar remover um carro que não existe ou tentar usar um carro que necessita de manutenção.

**Funcionalidade Extra**:
*Desafio de Corrida:* 
O usuário pode desafiar um carro da frota para uma corrida simulada. O sistema calcula o tempo do carro, com base na sua velocidade máxima, e se o carro não estiver em boas condições (precisando de manutenção), uma exceção é lançada.
