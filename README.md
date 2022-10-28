# SIM
SIM - Slipper Industry Management : Sistema gerenciador de fábrica de chinelos


# slipperindustrymanagement
Universidade do Oeste de Santa Catarina Campus de São Miguel do Oeste

Curso: Ciência da Computação

Disciplinas: Banco de Dados II, Engenharia de Software I, Programação II

Professores: Franciele Carla Petry, Otilia Donato Barbosa e Roberson Junior Fernandes Alves

Alunos: Adriel Matheus Graupp, Alan Bender, Gustavo Berwian, Lucas Bonamigo


#	LEVANTAMENTO DE REQUISITOS:

-> Requisitos funcionais:
* Precisamos de um sistema que auxilie no : PCP (Planejamento e controle de produção), Estoque, Vendas, 
Compras, Fiscal, Financeiro, Comercial, Cadastro de clientes, RH e Fornecedores. 
* Manutenção de Máquinas e Controle de Injetados ( controlar sistema de injeção em máquinas termoplástico);
* o sistema não pode gerar o fiscal caso haja alguma restrição no CGC (Cadastro Geral de Contribuintes), também 
o cadastro pode ser bloqueado caso o mesmo tenha inadimplência com a empresa. 
Também a regras no PCP / estoque que emitem alertas de estoque baixo ou caso o fluxo de Vendas passe o limite de 
produção e matéria prima para a sua produção.

-> Requisitos não funcionais:
* sistema deverá ter uma comunicação fluente entre os terminais e Sub terminais de vendas mantendo sempre os mesmos 
atualizados. 
* Cada colaborador deve ter acesso com login e senha tendo acesso somente ao que lhe cabe, Ex: setor financeiro, 
somente financeiro.

Obs.: os produtos (chinelos) são regsitardos pelo modelo (referencia (Wk02)), e também pelo código de barras.


TABELAS
Funcionario: codigo, nome, telefone, email, sexo, setor, endereço
Materia prima: codigo, descrição, preço
Fornecedor: cnpj, nome, telefone, email, endereço, materia prima
Vendedor: cpf, nome, telefone, email, sexo, regiao, endereço
Cliente: cnpj, nome, telefone, email, endereço
Venda: codigo, produto, vendedor, cliente
Produto: codigo, referencia, descrição, preço
Estoque: produto, quantidade
