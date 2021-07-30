create table dept (
	id number(7) primary key,
	name varchar(25) not null
);


CREATE TABLE emp (
	id number,
	last_name varchar(25),
	first_name varchar(25),
	dept_id number,
	constraint pk_emp primary key (id),
	CONSTRAINT emp_FK FOREIGN KEY (id) REFERENCES dept(id) ON DELETE RESTRICT ON UPDATE RESTRICT
);

insert into dept values (1, 'Valle');
insert into emp values (1, 'Orozco', 'Quintero', 1);

select * 
from emp as e 
	inner join dept as d 
		on d.id = e.dept_id;

drop table dept;
drop table emp;