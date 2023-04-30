#SOAP API Spring Boot

Este é um projeto que criei para praticar, que consiste em uma aplicação SOAP REST API desenvolvida com Spring Boot.

## Como executar a aplicação

Antes de executar a aplicação, você precisará ter instalado na sua máquina o [Java Development Kit (JDK)](https://www.oracle.com/br/java/technologies/javase-downloads.html) e o [Maven](https://maven.apache.org/). Para verificar se você tem esses programas instalados, execute os seguintes comandos no seu terminal:

```sh
java -version
mvn -version
```

Com os programas instalados, siga os passos abaixo para executar a aplicação:

1. Clone este repositório na sua máquina:
   
   ```sh
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
   
   Substitua "seu-usuario" pelo seu nome de usuário no GitHub e "nome-do-repositorio" pelo nome do seu repositório.

2. Acesse a pasta do projeto:
   
   ```sh
   cd nome-do-repositorio
   ```

3. Execute o seguinte comando para compilar o projeto:
   
   ```sh
   mvn clean install
   ```

4. Depois que a compilação estiver concluída, execute o seguinte comando para iniciar a aplicação:
   
   ```sh
   mvn spring-boot:run
   ```

   A aplicação estará disponível no endereço [http://localhost:8080](http://localhost:8080).

## Como testar a aplicação

Para testar a aplicação, você pode usar o [Postman](https://www.postman.com/). O arquivo `collection.json` na raiz do projeto contém uma coleção de requisições que você pode importar para o Postman e usar para testar a aplicação.

Além disso, a aplicação também inclui testes unitários que você pode executar usando o seguinte comando:

```sh
mvn test
```

## Tecnologias utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [JUnit](https://junit.org/junit5/)
- [Postman](https://www.postman.com/)

## Autor

[Alef](https://github.com/bispoalef).
