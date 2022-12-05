-- criando view para mostrar nome do cliente que esta realizando a compra
create view nomclf_vw as
select nomcli from cliente c
inner join clientefisico cf on c.codcli = cf.codcli 
inner join venda v on c.codcli = v.codcli;

-- criando view para mostrar contato dos fornecedores cujam são de Santa Catarina
create view contato_fornecedores_sc_vw as
select telfor, emafor from fornecedor f
inner join endereco e on e.cepend = f.cepend 
where e.estend = 'Santa Catarina';

-- Criando view para mostrar cliente juridicos (razão social) que residam no Sul
create view razclj_clientesdosul_vw as
select razclj from clientejuridico cj
inner join endereco e on cj.cepend = e.cepend 
where e.estend = 'Santa Catarina' or e.estend = 'Parana'
or e.estend = 'Rio Grande do Sul';