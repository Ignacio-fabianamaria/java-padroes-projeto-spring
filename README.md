# Bootcamp Santander & DIO - Desafio Padrões de Projeto Java

## O Desafio

A aplicação tem como objetivo gerenciar informações de clientes e seus endereços, integrando-se com a API do ViaCEP para obter informações detalhadas de endereço com base no CEP fornecido.

## Padrões de Projetos

Este projeto explorou os seguintes padrões usando o Spring Framework:

- **Padrão Criacional: Singleton** : O Singleton é um padrão de projeto criacional que garante que uma classe tenha apenas uma única instância e fornece um ponto de acesso global para essa instância. Ele é útil quando você precisa de uma única instância compartilhada em todo o aplicativo, como um pool de conexões de banco de dados ou um gerenciador de configuração.
- **Padrão Comportamental: Strategy** : O Strategy é um padrão de projeto comportamental que define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Isso permite que o cliente escolha o algoritmo a ser usado em tempo de execução. É útil quando você tem várias maneiras de executar uma tarefa e deseja selecionar a abordagem apropriada com base em certas condições ou preferências.
- **Padrão Estrutural: Facade** :O Facade é um padrão de projeto estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema. Ele oculta a complexidade do subsistema, tornando mais fácil para o cliente interagir com ele. O Facade é semelhante a um "ponto de entrada" simplificado para um conjunto mais complexo de funcionalidades, tornando o código do cliente mais limpo e fácil de usar.

## Exemplo de Requisição

### Inserir um novo cliente no sistema: `POST /clientes`.

Neste exemplo, a solicitação envia um novo cliente para o sistema.

```json
POST /clientes
Content-Type: application/json

{
  "nome": "Nome do Cliente",
  "endereco": {
    "cep": "25545000"
  }
}
```

Resposta:

```json

Status: 200 OK

{
  "id": 1,
  "nome": "Nome do Cliente",
  "endereco": {
    "cep": "25545-000",
    "logradouro": "Rua Alfredo Maurício Brum",
    "complemento": "",
    "bairro": "Éden",
    "localidade": "São João de Meriti",
    "uf": "RJ",
    "ibge": "3305109",
    "gia": "",
    "ddd": "21",
    "siafi": "5901"
  }
}
```
