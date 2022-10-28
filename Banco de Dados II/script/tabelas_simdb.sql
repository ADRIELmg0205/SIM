CREATE TABLE Cliente (
  codcli SERIAL NOT NULL, 
  cpfclf numeric(11, 0) NOT NULL, 
  cnpclj numeric(14, 0) NOT NULL, 
  PRIMARY KEY (codcli));
 
COMMENT ON TABLE Cliente IS 'registro do cliente';
COMMENT ON COLUMN Cliente.codcli IS 'codigo do cliente';

CREATE TABLE ClienteFisico (
  cpfclf numeric(11, 0) NOT NULL, 
  nomclf varchar(60) NOT NULL, 
  telclf numeric(11, 0), 
  emaclf varchar(40), 
  sexclf char(1), 
  idaclf int4, 
  cepend numeric(8, 0), 
  PRIMARY KEY (cpfclf));
 
COMMENT ON TABLE ClienteFisico IS 'Tabela de cadastro de clientes (pessoa fisica)';
COMMENT ON COLUMN ClienteFisico.cpfclf IS 'cnpj do cliente';
COMMENT ON COLUMN ClienteFisico.nomclf IS 'nome do cleinte';
COMMENT ON COLUMN ClienteFisico.telclf IS 'telefone do cliente';
COMMENT ON COLUMN ClienteFisico.emaclf IS 'e-mail do cliente';
COMMENT ON COLUMN ClienteFisico.sexclf IS 'sexo do cliente';
COMMENT ON COLUMN ClienteFisico.idaclf IS 'idade do cliente';

CREATE TABLE ClienteJuridico (
  cnpclj numeric(14, 0) NOT NULL, 
  razclj varchar(40) NOT NULL, 
  telclj numeric(11, 0), 
  emaclj varchar(30), 
  cepend numeric(8, 0), 
  PRIMARY KEY (cnpclj));
 
COMMENT ON TABLE ClienteJuridico IS 'cadastro de cliente (pessoa juridica)';
COMMENT ON COLUMN ClienteJuridico.cnpclj IS 'cnpj do cliente';
COMMENT ON COLUMN ClienteJuridico.razclj IS 'razao social';
COMMENT ON COLUMN ClienteJuridico.telclj IS 'telefone';
COMMENT ON COLUMN ClienteJuridico.emaclj IS 'email cliente';

CREATE TABLE Endereco (
  cepend numeric(8, 0) NOT NULL, 
  estend char(2), 
  cidend varchar(40), 
  ruaend varchar(30), 
  numend int4, 
  comend varchar(60), 
  PRIMARY KEY (cepend));
 
COMMENT ON TABLE Endereco IS 'tabela de registro de endereço';
COMMENT ON COLUMN Endereco.cepend IS 'cep';
COMMENT ON COLUMN Endereco.estend IS 'estado endereço';
COMMENT ON COLUMN Endereco.cidend IS 'nome da cidade';
COMMENT ON COLUMN Endereco.ruaend IS 'rua';
COMMENT ON COLUMN Endereco.numend IS 'numero do endereço';
COMMENT ON COLUMN Endereco.comend IS 'complemento do endereço';

CREATE TABLE Estoque (
  qtdest int8 NOT NULL, 
  codpro int4 NOT NULL, 
  refpro varchar(4) NOT NULL, 
  PRIMARY KEY (codpro, 
  refpro));
 
COMMENT ON TABLE Estoque IS 'tabela de estoque';
COMMENT ON COLUMN Estoque.qtdest IS 'quantidade do produto';

CREATE TABLE Fornecedor (
  cnpfor numeric(14, 0) NOT NULL, 
  nomfor varchar(40) NOT NULL, 
  telfor numeric(11, 0), 
  emafor varchar(40), 
  codmat int4 not null, 
  cepend numeric(8, 0), 
  PRIMARY KEY (cnpfor));
 
COMMENT ON TABLE Fornecedor IS 'Cadastro de fornecedores';
COMMENT ON COLUMN Fornecedor.cnpfor IS 'cnpj do fornecedor';
COMMENT ON COLUMN Fornecedor.nomfor IS 'nome do fornecedor';
COMMENT ON COLUMN Fornecedor.telfor IS 'telefone do fornecedor';
COMMENT ON COLUMN Fornecedor.emafor IS 'e-mail do fornecedor';

CREATE TABLE Materiaprima (
  codmat SERIAL NOT NULL, 
  desmat varchar(20), 
  premat numeric(8, 2), 
  PRIMARY KEY (codmat));
 
COMMENT ON TABLE Materiaprima IS 'cadastro da materia prima';
COMMENT ON COLUMN Materiaprima.codmat IS 'codigo da materia prima';
COMMENT ON COLUMN Materiaprima.desmat IS 'descrição da materia prima';
COMMENT ON COLUMN Materiaprima.premat IS 'preço da materia prima';

CREATE TABLE Setor (
  codset SERIAL NOT NULL, 
  nomset varchar(20) NOT NULL UNIQUE, 
  PRIMARY KEY (codset));
 
COMMENT ON TABLE Setor IS 'Cadastro do setor';
COMMENT ON COLUMN Setor.codset IS 'codigo do setor';
COMMENT ON COLUMN Setor.nomset IS 'nome do setor';

CREATE TABLE Venda (
  codven SERIAL NOT NULL, 
  codpro int4 NOT NULL, 
  cpfven numeric(11, 0) NOT NULL, 
  refpro varchar(4) NOT NULL, 
  codcli int4 NOT NULL, 
  datven date NOT NULL, 
  vlrven numeric(14, 2) NOT NULL, 
  PRIMARY KEY (codven));
 
COMMENT ON TABLE Venda IS 'Cadastro de vendas';
COMMENT ON COLUMN Venda.codven IS 'codigo de vendas';
COMMENT ON COLUMN Venda.datven IS 'data da venda';
COMMENT ON COLUMN Venda.vlrven IS 'valor da venda';

CREATE TABLE Vendedor (
  cpfven numeric(11, 0) NOT NULL, 
  nomven varchar(40) NOT NULL, 
  telven numeric(11, 0), 
  emaven varchar(40), 
  sexven char(1), 
  regven varchar(20), 
  cepend numeric(8, 0), 
  PRIMARY KEY (cpfven));
 
COMMENT ON TABLE Vendedor IS 'cadastro dos vendedores';
COMMENT ON COLUMN Vendedor.cpfven IS 'cpf do vendedor';
COMMENT ON COLUMN Vendedor.nomven IS 'nome do vendedor';
COMMENT ON COLUMN Vendedor.telven IS 'telefone do vendedor';
COMMENT ON COLUMN Vendedor.emaven IS 'e-mail do vendedor';
COMMENT ON COLUMN Vendedor.sexven IS 'sexo do vendedor';
COMMENT ON COLUMN Vendedor.regven IS 'região em que o vendedor vende';

CREATE TABLE Produto (
  codpro int4 NOT NULL, 
  refpro varchar(4) NOT NULL, 
  despro varchar(20) NOT NULL, 
  prepro numeric(8, 2) NOT NULL, 
  numpro int4 NOT NULL, 
  nompro varchar(20) NOT NULL, 
  codmat int4 NOT NULL, 
  PRIMARY KEY (codpro, 
  refpro));
COMMENT ON TABLE Produto IS 'Cadastro de produtos';
COMMENT ON COLUMN Produto.codpro IS 'codigo de barras do produto';
COMMENT ON COLUMN Produto.refpro IS 'referencia do produto';
COMMENT ON COLUMN Produto.despro IS 'descrição do produto';
COMMENT ON COLUMN Produto.prepro IS 'preço do produto';
COMMENT ON COLUMN Produto.numpro IS 'numeração do produto';
COMMENT ON COLUMN Produto.nompro IS 'nome do produto';

CREATE TABLE Funcionario (
  cpffun numeric(11, 0) NOT NULL, 
  nomfun varchar(40) NOT NULL, 
  telfun numeric(11, 0), 
  emafun varchar(40), 
  sexfun char(1), 
  senfun varchar(20), 
  codset int4 not null, 
  cepend numeric(8, 0), 
  salfun numeric(14, 2) NOT NULL, 
  PRIMARY KEY (cpffun));
COMMENT ON TABLE Funcionario IS 'Cadastro de funcionarios';
COMMENT ON COLUMN Funcionario.cpffun IS 'cpf do funcionario';
COMMENT ON COLUMN Funcionario.nomfun IS 'nome do funcionario';
COMMENT ON COLUMN Funcionario.telfun IS 'telefone do funcionario';
COMMENT ON COLUMN Funcionario.emafun IS 'e-mail do funcionario';
COMMENT ON COLUMN Funcionario.sexfun IS 'sexo do funcionario';
COMMENT ON COLUMN Funcionario.senfun IS 'senha do funcionario';
COMMENT ON COLUMN Funcionario.salfun IS 'salário do funcionario';


ALTER TABLE Produto ADD CONSTRAINT FKProduto272416 FOREIGN KEY (codmat) REFERENCES Materiaprima (codmat);
ALTER TABLE Venda ADD CONSTRAINT FKVenda404352 FOREIGN KEY (codcli) REFERENCES Cliente (codcli);
ALTER TABLE Cliente ADD CONSTRAINT FKCliente891067 FOREIGN KEY (cnpclj) REFERENCES ClienteJuridico (cnpclj);
ALTER TABLE Cliente ADD CONSTRAINT FKCliente702072 FOREIGN KEY (cpfclf) REFERENCES ClienteFisico (cpfclf);
ALTER TABLE ClienteJuridico ADD CONSTRAINT FKClienteJur78965 FOREIGN KEY (cepend) REFERENCES Endereco (cepend);
ALTER TABLE Funcionario ADD CONSTRAINT FKFuncionari869107 FOREIGN KEY (codset) REFERENCES Setor (codset);
ALTER TABLE Venda ADD CONSTRAINT FKVenda583852 FOREIGN KEY (cpfven) REFERENCES Vendedor (cpfven);
ALTER TABLE Venda ADD CONSTRAINT FKVenda891507 FOREIGN KEY (codpro, refpro) REFERENCES Produto (codpro, refpro);
ALTER TABLE Vendedor ADD CONSTRAINT FKVendedor796523 FOREIGN KEY (cepend) REFERENCES Endereco (cepend);
ALTER TABLE ClienteFisico ADD CONSTRAINT FKClienteFis415916 FOREIGN KEY (cepend) REFERENCES Endereco (cepend);
ALTER TABLE Funcionario ADD CONSTRAINT FKFuncionari985887 FOREIGN KEY (cepend) REFERENCES Endereco (cepend);
ALTER TABLE Fornecedor ADD CONSTRAINT FKFornecedor138171 FOREIGN KEY (cepend) REFERENCES Endereco (cepend);
ALTER TABLE Fornecedor ADD CONSTRAINT FKFornecedor781853 FOREIGN KEY (codmat) REFERENCES Materiaprima (codmat);
ALTER TABLE Estoque ADD CONSTRAINT FKEstoque495509 FOREIGN KEY (codpro, refpro) REFERENCES Produto (codpro, refpro);
