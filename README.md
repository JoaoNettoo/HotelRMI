# Projeto RMI - Sistema de Reserva de Hotel

## Descrição
Este projeto implementa um sistema distribuído de reserva de hotel utilizando **Java RMI (Remote Method Invocation)**. O sistema é composto por um servidor que gerencia quartos e reservas, e um cliente que interage com o usuário para realizar operações como reserva, cancelamento e consulta de disponibilidade.

## Estrutura do Projeto
```
📂 src/main/java/org/ifpe
 ├── 📂 client
 │   ├── HotelClient.java
 │
 ├── 📂 server
 │   ├── 📂 models
 │   │   ├── Booking.java
 │   │   ├── Room.java
 │   │
 │   ├── HotelServer.java
 │   ├── HotelService.java
 │   ├── HotelServiceImpl.java
```

### Componentes
- **HotelClient.java**: Cliente RMI que se comunica com o servidor para realizar as operações de reserva.
- **HotelServer.java**: Servidor que registra o serviço RMI e gerencia as requisições dos clientes.
- **HotelService.java**: Interface RMI que define os métodos remotos disponíveis.
- **HotelServiceImpl.java**: Implementação da interface `HotelService`, contendo a lógica do sistema.
- **models/**: Contém as classes `Room` (representação de um quarto) e `Booking` (representação de uma reserva).

## Tecnologias Utilizadas
- **Java**
- **Java RMI** (Remote Method Invocation)

## Como Executar o Projeto
### Passo 1: Compilar os Arquivos
Abra o terminal na raiz do projeto e compile os arquivos Java:
```sh
javac -d . src/main/java/org/ifpe/**/*.java
```

### Passo 2: Iniciar o Registro RMI
Antes de iniciar o servidor, execute o `rmiregistry`:
```sh
rmiregistry &
```

### Passo 3: Iniciar o Servidor
Execute o seguinte comando:
```sh
java org.ifpe.server.HotelServer
```
Saída esperada:
```
HotelServer is ready.
```

### Passo 4: Iniciar o Cliente
Em outro terminal, execute:
```sh
java org.ifpe.client.HotelClient
```
O cliente exibirá uma interface de linha de comando para interagir com o sistema.

## Funcionalidades
O cliente permite executar os seguintes comandos:
- `ola` - Cumprimenta o servidor.
- `reservar` - Faz uma reserva de quarto.
- `cancelar` - Cancela uma reserva.
- `disponiveis` - Lista os quartos disponíveis.
- `reservas` - Lista todas as reservas.
- `reserva` - Exibe uma reserva específica.
- `quarto` - Exibe informações de um quarto.
- `quartos` - Lista todos os quartos.
- `atualizar` - Atualiza informações de um quarto.
- `sair` - Encerra o cliente.

## Autores
- **João Neto**
- **Bruno Rodrigues**

## Licença
Este projeto está sob a licença MIT.

