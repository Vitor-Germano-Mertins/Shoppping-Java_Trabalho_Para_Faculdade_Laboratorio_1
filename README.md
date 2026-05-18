# Gerenciador de Lojas - Shopping Center

Este projeto foi desenvolvido para a disciplina de Laboratório I com foco na aplicação prática de conceitos de **Programação Orientada a Objetos (POO)** utilizando Java.

---

# Descrição do Projeto

O sistema simula o gerenciamento de um shopping center, permitindo controlar lojas, produtos, estoque e categorias comerciais. Durante o desenvolvimento foram aplicados conceitos fundamentais da orientação a objetos, organização de classes e lógica de negócio.

O projeto foi dividido em etapas evolutivas:

1. **Criação das Classes Base:**  
Implementação das classes principais como `Loja`, `Produto`, `Endereco` e `Data`.

2. **Relacionamento entre Classes:**  
Integração entre os objetos e criação de métodos de verificação e manipulação de dados.

3. **Herança e Polimorfismo:**  
Especialização das lojas em diferentes categorias:
`Alimentacao`, `Bijuteria`, `Cosmetico`, `Informatica` e `Vestuario`.

4. **Estruturas de Dados (Arrays):**  
Gerenciamento de múltiplos produtos e múltiplas lojas dentro do shopping, incluindo buscas e filtragens.

---

# Funcionalidades Principais

- **Validação de Datas:**  
Sistema de validação de dias, meses e anos bissextos.

- **Gestão de Estoque:**  
Controle de produtos com funcionalidades de inserção, remoção e listagem.

- **Controle Financeiro:**  
Cálculo automático de gastos relacionados aos funcionários das lojas.

- **Busca de Informações:**  
Pesquisa de lojas específicas e filtragem por categorias.

- **Relatórios por Categoria:**  
Contagem de lojas com base em seus segmentos utilizando polimorfismo.

---

# Tecnologias Utilizadas

- **Java**
- **Programação Orientada a Objetos**
- **JDK**
- **Terminal / CLI**

---

# Estrutura do Repositório

```bash
Principal.java        -> Classe principal do sistema
Shopping.java         -> Gerenciamento do shopping
Loja.java             -> Classe base das lojas
Produto.java          -> Controle dos produtos
Endereco.java         -> Informações de endereço
Data.java             -> Validação e manipulação de datas