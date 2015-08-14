create table Player (
  id bigint identity not null,
  team_id bigint not null,
  name varchar(100) not null,
  number int,
  version bigint not null,
  constraint PK_PLAYER_ID primary key(id),
  constraint FK_PLAYER_TEAM foreign key(team_id) references Team (id)
);