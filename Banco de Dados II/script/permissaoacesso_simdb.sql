create group vendedor;
create group gerente;
create group estoquista;
create group financeiro;

create user Gustavo
password 'gustavo';

create user Adriel 
password 'adriel';

create user Lucas
password 'lucas';

create user Alan
password 'alan';

grant select, insert,update,delete 
on table cliente,clientefisico,clientejuridico,estoque,fornecedor,funcionario,materiaprima,produto,
setor,venda,vendedor
to gerente;


grant select,insert,update
on table cliente, clientefisico,endereco,produto,venda
to vendedor;

grant select ,insert,update,delete 
on table estoque , fornecedor, materiaprima,produto
to estoquista;

grant select, insert ,update,delete
on table cliente,clientefisico,clientejuridico,endereco,estoque,produto,venda,vendedor,funcionario
to financeiro;

grant vendedor to Gustavo;
grant gerente to Adriel;
grant estoquista to Lucas;
grant financeiro to Alan;