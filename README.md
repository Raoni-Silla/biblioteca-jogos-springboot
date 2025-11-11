# 🚀 Atividade Prática – Biblioteca de Jogos Pessoais

Projeto acadêmico da disciplina de linguagem de programação para o desenvolvimento de uma aplicação Web Full Stack (Spring Boot + Thymeleaf) que funciona como uma biblioteca pessoal de jogos.

A aplicação permite o **CRUD (Cadastrar, Listar, Editar e Remover)** completo para as entidades **Jogo** e **Categoria**, com persistência de dados em um banco PostgreSQL.

---

## ✨ Funcionalidades

* **CRUD de Jogos:** Gerenciamento completo dos jogos na biblioteca.
* **CRUD de Categorias:** Gerenciamento das categorias que agrupam os jogos.
* **Relacionamento:** Um jogo pertence a uma categoria (`ManyToOne`).
* **Tema Dark/Light:** Botão para alternar o tema visual da aplicação.
* **Rodapé Fixo:** Exibição das informações do desenvolvedor.

---

## 🛠️ Tecnologias Utilizadas

* **Backend:** Spring Boot, Spring Data JPA, Spring Web
* **Frontend:** Thymeleaf
* **Linguagem:** Java 21
* **Build:** Apache Maven
* **Banco de Dados (Dev):** H2 Database (em memória)
* **Banco de Dados (Prod):** PostgreSQL (Hospedado no Neon)
* **Deploy (App):** Render

---

## 📂 Modelagem dos Dados

A aplicação utiliza duas entidades principais:

* **`Categoria`**: Armazena o `id`, `nome`, `descricao`, etc., das categorias dos jogos.
* **`Jogo`**: Armazena todos os detalhes do jogo (como `titulo`, `plataforma`, `nota`) e possui um relacionamento `ManyToOne` com a `Categoria`.


# 3. Execute o projeto com o Maven
mvn spring-boot:run
