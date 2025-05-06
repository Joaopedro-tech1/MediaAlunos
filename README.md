# MediaAlunos_Spring.Boot

Este projeto é um sistema de **cadastro de alunos** e **cálculo de médias** simples , desenvolvido com **Spring Boot**. Ele permite o cadastro de alunos com suas notas, cálculo automático da média e verificação de aprovação.

---

## Funcionalidades

- Cadastro de novos alunos com nome e duas notas  
- Cálculo automático da média das notas  
- Verificação de aprovação (média >= 6.0)  
- Visualização de alunos cadastrados  
- Atualização de informações de alunos  
- Exclusão de alunos  

---

## Tecnologias Utilizadas

- **MySQL** – Banco de dados relacional para armazenamento dos dados  
- **Postman** – Para testar as requisições HTTP  
- **VS Code** – Ambiente de desenvolvimento  
- **Spring Boot** – Framework para desenvolvimento da aplicação  
  - Spring Boot Web – Para criação das APIs RESTful  
  - Spring Boot Data JPA – Para integração com o banco de dados  
  - Spring Boot DevTools – Ferramentas auxiliares de desenvolvimento  
- **Lombok** – Para reduzir o código repetitivo (getters, setters, construtores)  
- **MySQL Driver** – Conector JDBC para o banco de dados  
- **Maven** – Gerenciador de dependências e build  
- **Java 17+** – Linguagem utilizada no projeto  

---

## Pré-requisitos

Antes de começar, verifique se você tem os seguintes itens instalados:

- Java 17 ou superior (JDK)  
- Maven  
- MySQL instalado e em execução  
- Postman ou similar (opcional, para testar a API)  

---

## Como rodar o projeto
## Configure o banco de dados no arquivo application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/MediaAlunos_Spring.Boot.git


