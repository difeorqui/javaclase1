-- 1. Debido a problemas de presupuesto, el departamento de recursos humanos
-- necesita un informe que muestre el apellido y el salario de los empleados que
-- ganan más de $ 12.000.
SELECT e.last_name, e.salary FROM employees e WHERE e.salary > 12000;


-- 2. Cree un informe que muestre el apellido y el número de departamento para el 
-- número de empleado 176.

SELECT e.last_name, e.department_id FROM employees e 
where e.employee_id = 176;

SELECT e.last_name, d.location_id 
FROM employees e inner join departments d
	on e.department_id = d.department_id 
where e.employee_id = 176;

-- 3. El departamento de recursos humanos necesita encontrar empleados con
-- sueldos altos y bajos. Crea un informe para mostrar el apellido y el salario de
-- cualquier empleado cuyo salario no esté en el rango de $ 5.000 a $ 12.000.
SELECT e.last_name, e.salary FROM employees e WHERE e.salary < 5000 or e.salary > 12000;

-- 4. Cree un informe para mostrar el apellido, la identificación del trabajo y la
-- fecha de contratación para los empleados con los apellidos de Matos y
-- Taylor. Ordene la consulta en orden ascendente por la fecha de contratación.

select e.last_name, e.job_id, e.hire_date 
from employees e
--where e.last_name = 'Matos' or e.last_name = 'Taylor'
--where e.last_name IN ('Matos','Taylor')
where lower(e.last_name) in ('matos','taylor')
order by e.hire_date asc
;




SELECT e.last_name, j.job_id, e.hire_date 
FROM employees e inner join jobs j on e.job_id = j.job_id 
WHERE e.last_name IN ('Matos','Taylor')
ORDER BY e.hire_date DESC;

-- 5. Muestra el apellido y la identificación del departamento de todos los
-- empleados en los departamentos 20 o 50 en orden alfabético ascendente por
-- nombre.

select e.last_name, e.department_id 
from employees e
where e.department_id in (20, 50)
order by e.first_name;

select * from employees e order by e.department_id desc;



SELECT e.last_name, d.department_id 
FROM employees e INNER JOIN departments d on e.department_id = d.department_id 
WHERE d.department_id IN (20,50)
ORDER BY e.first_name;

-- 6. Crea un informe para mostrar el apellido y el salario de los empleados que
-- ganan entre $ 5.000 y $ 12.000, y están en el departamento 20 o 50. Etiquete
-- las columnas Employee y Monthly Salary, respectivamente.

select e.last_name as Employee, e.salary as "Monthly Salary"
from employees as e 
where (e.salary BETWEEN 5000 and 12000) and (e.department_id IN (9, 10));

--e.salary >= 5000 and e.salary <= 12000




SELECT e.last_name as Employee, e.salary as "Monthly Salary"
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id 
WHERE d.department_id in (20, 50) AND e.salary BETWEEN 5000 AND 12000;

-- 7. El departamento de recursos humanos necesita un informe que muestre el
-- apellido y la fecha de contratación de todos los empleados que fueron
-- contratados en 1994.

SELECT e.last_name, e.hire_date
FROM employees e 
WHERE SUBSTRING(e.hire_date,1,4) = '1994';


-- 8. Cree un informe para mostrar el apellido y el cargo de todos los empleados
-- que no tienen un gerente.
SELECT e.last_name, j.job_title 
FROM employees e inner join jobs j 
	on e.job_id = j.job_id 
where e.manager_id is null
;

SELECT * from employees e ;




SELECT e.last_name, j.job_title 
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id 
WHERE NOT e.manager_id IS NULL;

-- 9. Cree un informe para mostrar el apellido, el salario y la comisión de todos los
-- empleados que ganan comisiones. Ordenar datos en orden descendente de
-- salario y comisiones.
-- Use la posición numérica de la columna en la cláusula ORDER BY.
select e.last_name, e.salary, (e.salary - j.min_salary) comision
from employees e inner join jobs j 
	on e.job_id = j.job_id 
where (e.salary - j.min_salary) > 0
order by 2 desc, 3 desc;

-- Listar el grado en el cual se encuentra los empleados
SELECT e.last_name, e.salary, jg.grade 
FROM employees e, job_grades jg 
where e.salary BETWEEN jg.lowest_sal and jg.highest_sal 
;









SELECT e.last_name, e.salary, e.salary-j.min_salary as comision
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id
WHERE e.salary-j.min_salary > 0
ORDER BY 2 DESC, 3 DESC;

-- 10.Muestra todos los apellidos de los empleados en los 
-- que la tercera letra del nombre es "a".
SELECT e.last_name FROM employees e 
--WHERE SUBSTRING(e.first_name, 3,1) = "a"; 
where e.first_name like '__a%';




-- 11.Muestre los apellidos de todos los empleados que tienen 
--tanto una "a" como una "e" en su apellido.
SELECT e.last_name FROM employees e 
--WHERE e.last_name LIKE "%a%" and e.last_name LIKE "%e%";
WHERE last_name LIKE '%a%e%';

-- 12.Muestre el apellido, el trabajo y el salario de todos los empleados cuyos
-- trabajos sean los de un representante de ventas o de un empleado de bolsa,
-- y cuyos salarios no sean iguales a $ 2.500, $ 3.500 o $ 7.000.
SELECT e.last_name, j.job_title, e.salary 
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id 
WHERE e.salary NOT IN (2500, 3500, 7000) 
	AND j.job_id IN (13, 16);


-- 13.Cree un informe para mostrar el apellido, el salario y la comisión de todos los
-- empleados cuya comisión es del 20%.

SELECT e.last_name, e.salary, e.salary-j.min_salary as comision
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id
WHERE comision / e.salary >= 0.2