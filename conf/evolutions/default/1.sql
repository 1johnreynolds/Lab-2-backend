# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table publication (
  pid                           bigint auto_increment not null,
  title                         varchar(255),
  metadata                      varchar(255),
  constraint pk_publication primary key (pid)
);


# --- !Downs

drop table if exists publication;

