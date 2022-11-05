 
--RELATÓRIOS 


CREATE VIEW PRODUTOS_VW AS
select codpro , nompro , despro from produto
order by codpro desc ;


CREATE VIEW PRODUTOS_1_VW AS
select p.nompro, m.desmat from produto p
inner join materiaprima m on m.codmat = p.codmat 
inner join estoque e on e.codpro = p.codpro 
where e.qtdest >=15 and e.qtdest <=30
order by m.desmat;


create view produto_2_vw as
select p.codpro, p.nompro, v.datven, count(codven) from produto p 
inner join venda v on v.codpro = p.codpro
where (extract(year from v.datven)) > 2018
	and (extract(year from v.datven)) < 2021 
	and mod((extract(month from v.datven)), 2) = 0
group by p.codpro, p.nompro, v.datven
order by count(codven) desc;


create view produto_3_vw as
select cf.cpfclf, cf.nomclf, sum(v.codven) from clientefisico cf
inner join cliente c on  c.cpfclf = cf.cpfclf
inner join venda v on v.codcli = c.codcli
where (cf.sexclf = 'M') and (cf.idaclf < 41) and (cf.idaclf > 29)
and (v.datven > '31/03/2021') and (v.datven < '01/11/2021')
group by cf.cpfclf, cf.nomclf
order by sum(v.codven) desc;