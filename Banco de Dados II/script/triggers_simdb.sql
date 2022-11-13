-- FALTA VERIFICAR SE AS TRIGGERS ESTÃO FUNCIOANDO


-- criando trigger para controle de estoque
create or replace function controla_estoque() returns trigger
as 
$body$
declare 
	quantidade numeric;
begin
	select qtdest into quantidade from estoque
	where codpro = new.codpro;
	if(new.qtdest >= quantidade) then
		raise exception 'Estoque insuficiente!';
	end if;
	return new;
end
$body$
language plpgsql;

create trigger controla_estoque_tg
before insert
on estoque
for each row 
execute procedure controla_estoque();



--Aceitar apenas registro de chinelos que tenham a numeração entre 14 e 48
create or replace function controla_tamanho() returns trigger
as 
$body$
begin
	if(new.numpro < 13) or (new.numpro > 48) then
		raise exception 'Tamanho Inválido!';
	end if;
	return new;
end
$body$
language plpgsql;

create trigger controla_tamanho_tg
before insert
on produto
for each row 
execute procedure controla_tamanho();
