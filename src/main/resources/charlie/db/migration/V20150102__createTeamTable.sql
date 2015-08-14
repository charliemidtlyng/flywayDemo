create table Team (
  id bigint identity not null,
  name varchar(100) not null,
  stadium_id bigint not null,
  version bigint not null,
  constraint PK_TEAM_ID primary key(id),
  constraint FK_TEAM_STADIUM foreign key(stadium_id) references Stadium (id)
);
