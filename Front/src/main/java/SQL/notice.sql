create table jspweb.notice(

	nno int primary key auto_increment,
    ntitle varchar(100) not null ,
    ncontents varchar(2000) not null ,
    nwriter varchar(100) not null ,
    ndate datetime default current_timestamp not null ,
    ncount int not null ,
    nfile varchar(1000) 
)

create table jspweb.user(
uno int primary key auto_increment,
uid varchar(30) not null,
upassword varchar(30) not null,
uname varchar(30) not null,
uaddress varchar(1000) not null,
uemail varchar(30) not null,
upoint int(30) not null
)

create table jspweb.bcomment(
bcno int primary key auto_increment,
nno int not null,
bccontents varchar(2000) not null,
bcwriter varchar(100) not null,
bcdate datetime default current_timestamp not null,
foreign key(nno) references notice(nno) on delete cascade
)

create table jspweb.product(

product_code int primary key auto_increment ,
    product_name varchar(200) not null ,
    product_comment varchar(10000) not null ,
    product_price int not null ,
    product_manufacturer varchar(200) not null ,
    product_category varchar(100) not null ,
    product_stock int not null ,
    product_releasedate varchar(100) not null ,
    product_img varchar(1000) , 
    product_active int ,
    product_salesrate int , 
    product_amount int
)

CREATE TABLE sjpweb.orders (
  orders_no int NOT NULL AUTO_INCREMENT not null,
  orders_uno int NOT NULL,
  orders_name varchar(100) NOT NULL,
  orders_address varchar(1000) NOT NULL,
  orders_phone varchar(100) NOT NULL,
  orders_comment varchar(1000) NOT NULL,
  orders_fee int NOT NULL,
  orders_date datetime NOT NULL DEFAULT CURRENT_TIMESTAMP not null,
  orders_state int NOT NULL,
  
  FOREIGN KEY (orders_uno) REFERENCES user (uno)
) 

create table jspweb.orders_detail(

	orders_detail_no int primary key auto_increment not null ,
    orders_no int not null,
    orders_product_code int not null,
    orders_amount int not null,
    orders_detail_state int not null,
    
    foreign key(orders_no) references orders(orders_no) ,
    foreign key(orders_product_code) references product (product_code )
    
)