create table if not exists user
(
    id bigint(19) not null primary key ,
    name varchar(45),
    create_time datetime,
    update_time datetime
);

create table if not exists address
(
    id bigint(19) not null primary key ,
    detail varchar(45),
    user_id bigint(19),
    create_time datetime,
    update_time datetime,
    index (user_id)
)