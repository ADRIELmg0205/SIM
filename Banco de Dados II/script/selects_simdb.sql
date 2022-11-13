
--mostrar produtos sem estoque
select p.nompro from produto p 
inner join estoque e on p.codpro = e.codpro 
where e.qtdest = 0;

--mostrar funcionarios que ganham menos de 2000 reais
select f.nomfun from funcionario f 
where f.salfun < 2000;

--mostrar funcionarios que trabalham no setor de pintura
select f.nomfun from funcionario f 
inner join setor s on f.codset = s.codset 
where s.nomset = 'pintura';

