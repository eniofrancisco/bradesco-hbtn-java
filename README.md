# Sistema de Pedidos com DDD

Este projeto demonstra os principais conceitos de Domain-Driven Design (DDD) aplicados em Java.

## 📦 Estrutura de Pacotes

- 'domain': contém as entidades, objetos de valor e regras de negócio
- 'application': serviços que expõem funcionalidades do domínio
- 'infrastructure': repositórios para persistência de dados
- 'ui': interface de entrada via console

## 🧩 Componentes

- Entidades: 'Cliente', 'Pedido', 'Produto'
- Enum: 'StatusPedido'
- Serviço de domínio: 'PedidoService'
- Repositório: 'PedidoRepository'
- Interface: 'Main'

## 🚀 Execução

Ao executar a classe 'Main', o sistema cria um pedido, adiciona produtos, realiza o pagamento e exibe o status final.

