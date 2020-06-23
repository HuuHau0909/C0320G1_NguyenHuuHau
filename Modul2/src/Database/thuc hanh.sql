create table sale_shop.products (
id INt auto_increment primary key,
products_name varchar (255),
price double,
discount float,
stock float,
catolories text,
supplier text,
catelories_id int,
supplier_id int,
foreign key (catelories_id) references catelories(id),
foreign key (supplier_id) references supplier(id)
);
create table sale_shop.customer(
id int auto_increment primary key,
customer_name varchar(255),
phone varchar(255),
adress text,
email text
);
create table sale_shop.catelories(
id int auto_increment primary key,
catelories_name varchar(255)
);
create table sale_shop.employee(
id int auto_increment primary key,
employee_name varchar(255),
birthday varchar(255)
);
create table sale_shop.order(
id int auto_increment primary key,
order_status text,
order_payment text

);
create table sale_shop.order_details(
id int auto_increment primary key,
product_id int,
order_id int
);
create table sale_shop.supplier(
id int auto_increment primary key,
supplier_name text,
phone int,
address varchar(255)
);
