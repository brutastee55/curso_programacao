## 🧪 Descrição
<!-- Descreva brevemente o que foi desenvolvido, corrigido ou ajustado nesta PR. -->

---

## ✅ Checklist de Revisão

### 🧹 Padrão Clean Code
- [ ] O código está claro, legível e simples.
- [ ] Nomes de variáveis e funções são descritivos e coerentes.
- [ ] Código morto, logs, comentários e funções não utilizadas foram removidos.

---

### 🧩 Identação e Formatação
- [ ] O código está devidamente identado com **2 espaços**.
- [ ] O padrão de formatação do projeto foi seguido corretamente.

---

### 🚫 Logs e Código Comentado
- [ ] Nenhum `console.log`, `cy.log` ou código comentado foi deixado no commit final.
- [ ] Logs temporários de depuração foram removidos antes da submissão.

---

### 💬 Padrão de Aspas no BDD
- [ ] Todos os steps BDD utilizam **aspas duplas**.
  ```js
  Given("o usuário está logado", () => { ... });

---

### 🧠 Estrutura do BDD
- [ ] Cada cenário `.feature` possui **pré-condição**, **ação** e **resultado esperado**.
- [ ] A descrição do cenário é clara e coerente com o tipo de teste (ex: sem cliques em testes de API).
- [ ] O cenário está escrito de forma compreensível e consistente com o padrão do projeto.

---

### 🏷️ Padrão de Tags
- [ ] As tags seguem o padrão já definido no projeto.
- [ ] Nenhuma nova tag foi criada sem validação prévia.

---

### 🔁 Evitar Duplicação e Promover Reuso
- [ ] Código duplicado foi evitado.
- [ ] Funções, steps e schemas reutilizam código já existente.
- [ ] O padrão de reaproveitamento foi seguido corretamente.

---

### 🧱 Massa de Dados (Massa Dinâmica)
- [ ] Nenhum dado fixo (“massa chumbada”) foi usado.
- [ ] O teste utiliza **givens** ou **geração dinâmica de massa** em tempo de execução.

---

### 🗂️ Estrutura do Projeto
Verifique se os arquivos estão na estrutura correta:

| Pasta | Descrição |
|-------|------------|
| **appDriver/** | Configurações e funções das requisições |
| **controller/** | Lógica de controle e fluxo |
| **feature/** | Cenários BDD escritos em Gherkin |
| **steps/** | Definições dos steps BDD |
| **schema/** | Schemas de validação reutilizáveis |
| **model/** | Estruturas de dados manipuladas nos testes |

- [ ] A estrutura de pastas foi seguida corretamente.
- [ ] Reutilizei **schemas** e **models** existentes quando aplicável.

---

### 🧪 Execução Prévia
- [ ] Executei minha **branch** na pipeline antes de abrir a PR.
- [ ] Verifiquei que a nova inclusão **não quebrou cenários existentes**.

---

### 📝 Documentação e Clareza
- [ ] O código e a lógica estão bem explicados.
- [ ] Comentários (quando necessários) são objetivos e úteis.
- [ ] O comportamento esperado está documentado.

---

## 📎 Evidências
- [ ] Screenshots anexados (quando aplicável)
- [ ] Logs de execução verificados
- [ ] Relatórios de testes anexados (PDF ou HTML, se aplicável)

## ✅ Confirmação Final
- [ ] Revisei todos os itens acima e confirmo que esta PR atende às diretrizes do projeto.