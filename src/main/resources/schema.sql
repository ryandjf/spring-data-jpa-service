create table users(
  id int not null AUTO_INCREMENT,
  name varchar(100) not null,
  address_id int not null,
  PRIMARY KEY ( id )
);

create table address(
  id int not null AUTO_INCREMENT,
  city varchar(100) not null,
  PRIMARY KEY ( id )
);

create table carts(
  id int not null AUTO_INCREMENT,
  price varchar(100) not null,
  PRIMARY KEY ( id )
);

create table items(
  id int not null AUTO_INCREMENT,
  name varchar(100) not null,
  cart_id int not null,
  PRIMARY KEY ( id )
);