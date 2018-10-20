drop table if exists persons;
create table persons(
	id int primary key auto_increment, 
	age int,
	name varchar(500),
	gender varchar(25));

insert into persons (age, name, gender) values (27, 'Hussain Chachuliya', 'Male');
insert into persons (age, name, gender) values (20, 'John Doe', 'Male');
insert into persons (age, name, gender) values (18, 'Maria Daniels', 'Female');
				   


	
	
	