create table Stadium (
  id bigint identity not null,
  capacity int,
  name varchar(100),
  version bigint not null,
  constraint PK_STADIUM_ID primary key(id)
);