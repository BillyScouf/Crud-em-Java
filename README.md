# CRUD de Usuário com Spring Boot
Este é um projeto simples de **CRUD de Usuários** desenvolvido em **Java + Spring Boot**, para praticar os principais e conceitos do Spring.
---
## 📌 Tecnologias utilizadas
- **Java 21+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (banco em memória)**
- **DevTools**
- **Lombok**
---
## 📁 Estrutura do Projeto, Usei o padrão arquitetural Service Layer
│
├── controller → Endpoints da API
├── dto → Objetos de resposta (MessageDTO)
├── entity → Classe User (tabela no banco)
├── repository → Interface UserRepository
└── service → Regras de negócio
