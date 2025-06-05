**Trabalho Final A3 – Programação de Soluções Computacionais**

**Grupo:**
- Gabriel Vitor Siqueira Costa
- Gustavo Ferreira França De Abreu
- Rafael Colombo Fernandes Silva. 

# Sistema de Cadastro de Ferramentas

Este é um sistema simples de cadastro e gerenciamento de ferramentas, implementado em Java, utilizando operações CRUD, validação de dados e persistência em arquivo texto.

---

## Funcionalidades

- Criar novo registro de ferramenta.
- Listar todas as ferramentas cadastradas.
- Buscar ferramenta por ID.
- Editar ferramenta.
- Excluir ferramenta.
- Persistência em arquivo `.txt`.

---
## Pré-requisitos

- Java JDK 8 ou superior
- Editor de texto ou IDE (Eclipse, IntelliJ, VSCode)

---

## Compilação

Abra o terminal e navegue até o diretório do projeto. Compile os arquivos `.java` com:
(Exemplo)

javac Ferramenta.java Main.java

---

## Execução

Após compilar, execute com:
main.java 

O menu será exibido no console com as opções:

1- Cadastrar ferramenta.
2- Listar ferramentas.
3- Buscar ferramenta por ID.
4- Editar ferramenta.
5- Remover ferramenta. 
6- Sair

---

## Persistência

- O sistema salva os registros no arquivo ferramentas.txt no formato CSV.
- Toda modificação atualiza o arquivo automaticamente.
- Na inicialização, o sistema carrega os registros existentes.

---

## Exemplo de Uso

Escolha uma opção: 1
 Nome: Furadeira
 Marca: Bosch
 Quantidade: 5
 Preço: 450.00
Ferramenta salva com sucesso!

---

## Validações
- Não permite quantidade negativa.
- Não permite campos vazios para nome e marca.
- Exibe mensagem de erro.

---

## Licença
Projeto acadêmico para fins educacionais.
Disciplina: Programação de Soluções Computacionais
Professor: Alexandre de Oliveira (Montanha)
