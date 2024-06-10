create table users(
    id bigserial not null primary key,
    email varchar(50) not null,
    password varchar(500) not null,
    rol varchar(20) not null
);
