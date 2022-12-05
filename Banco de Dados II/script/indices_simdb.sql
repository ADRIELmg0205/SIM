-- criando indice para nome/razao social do cliente
create index cli_nomcli_sk
on cliente(nomclf);

create index clj_razclj_sk
on clientejuridico(razclj);

-- indice para nome do funcinario
create index fun_nomfun_sk
on funcionario(nomfun);

-- indice para nome do vendedor
create index ven_nomven_sk
on vendedor(nomven);