create database customer_order;

use customer_order;

create table customer(
id bigint(22) not null auto_increment,
full_name varchar(255) default null,
email varchar(255) default null,
date_of_birth date default null,
address varchar(255) default null,
primary key(id)
);
create table orders (
  id bigint not null auto_increment,
  total_price decimal(20,2) default null,
  items_count int default null,
  customer_id bigint default null,
  primary key(id),
foreign key(customer_id) references customer(id)
);

insert into customer(full_name,email,date_of_birth,address) values
('nabawy fayed','nabawy@yahoo.com','1999-05-27','damanhour'),
('ahmed sakr','ahmed@yahoo.com','1990-09-01','alexandria'),
('mohamed alkholy','mohamed@yahoo.com','1993-10-06','cairo'),
('hossam morshedy','hossam@yahoo.com','1996-07-03','tanta'),
('ali azab','ali@yahoo.com','2001-04-011','menofia');

insert into orders (total_price,items_count,customer_id) values 
('40.50',10,1),
('30.00',3,1),
('10.50',15,1),
('50.00',4,2),
('600.00',13,2),
('250.00',20,3),
('120.00',10,3),
('200.0',5,4),
('300.00',15,4),
('60.00',30,5),
('40.50',10,5);