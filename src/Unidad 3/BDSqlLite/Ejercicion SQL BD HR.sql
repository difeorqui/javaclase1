-- 1. Debido a problemas de presupuesto, el departamento de recursos humanos
-- necesita un informe que muestre el apellido y el salario de los empleados que
-- ganan más de $ 12.000.
SELECT e.last_name, e.salary FROM employees e WHERE e.salary > 12000;

-- 2. Cree un informe que muestre el apellido y el número de departamento para el número de empleado 176.
SELECT e.last_name, d.department_id 
FROM employees e 
INNER JOIN departments d on e.department_id = d.department_id 
WHERE e.employee_id = 176;

-- 3. El departamento de recursos humanos necesita encontrar empleados con
-- sueldos altos y bajos. Crea un informe para mostrar el apellido y el salario de
-- cualquier empleado cuyo salario no esté en el rango de $ 5.000 a $ 12.000.
SELECT e.last_name, e.salary FROM employees e WHERE e.salary < 5000 or e.salary > 12000;

-- 4. Cree un informe para mostrar el apellido, la identificación del trabajo y la
-- fecha de contratación para los empleados con los apellidos de Matos y
-- Taylor. Ordene la consulta en orden ascendente por la fecha de contratación.
SELECT e.last_name, j.job_id, e.hire_date 
FROM employees e inner join jobs j on e.job_id = j.job_id 
WHERE e.last_name IN ('Matos','Taylor')
ORDER BY e.hire_date DESC;

-- 5. Muestra el apellido y la identificación del departamento de todos los
-- empleados en los departamentos 20 o 50 en orden alfabético ascendente por
-- nombre.
SELECT e.last_name, d.department_id 
FROM employees e INNER JOIN departments d on e.department_id = d.department_id 
WHERE d.department_id IN (20,50)
ORDER BY e.first_name;

-- 6. Crea un informe para mostrar el apellido y el salario de los empleados que
-- ganan entre $ 5.000 y $ 12.000, y están en el departamento 20 o 50. Etiquete
-- las columnas Employee y Monthly Salary, respectivamente.
SELECT e.last_name as Employee, e.salary as "Monthly Salary"
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id 
WHERE d.department_id in (20, 50) AND e.salary BETWEEN 5000 AND 12000;

-- 7. El departamento de recursos humanos necesita un informe que muestre el
-- apellido y la fecha de contratación de todos los empleados que fueron
-- contratados en 1994.
SELECT e.last_name, e.hire_date FROM employees e WHERE SUBSTRING(e.hire_date,1,4) = '1994';

-- 8. Cree un informe para mostrar el apellido y el cargo de todos los empleados
-- que no tienen un gerente.
SELECT e.last_name, j.job_title 
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id 
WHERE NOT e.manager_id IS NULL;

-- 9. Cree un informe para mostrar el apellido, el salario y la comisión de todos los
-- empleados que ganan comisiones. Ordenar datos en orden descendente de
-- salario y comisiones.
-- Use la posición numérica de la columna en la cláusula ORDER BY.
SELECT e.last_name, e.salary, e.salary-j.min_salary as comision
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id
WHERE e.salary-j.min_salary > 0
ORDER BY 2 DESC, 3 DESC;

-- 10.Muestra todos los apellidos de los empleados en los que la tercera letra del nombre es "a".
SELECT e.last_name FROM employees e WHERE SUBSTRING(e.first_name, 3,1) = "a"; 

-- 11.Muestre los apellidos de todos los empleados que tienen tanto una "a" como una "e" en su apellido.
SELECT e.last_name FROM employees e WHERE e.last_name LIKE "%a%" OR e.last_name LIKE "%e%";

-- 12.Muestre el apellido, el trabajo y el salario de todos los empleados cuyos
-- trabajos sean los de un representante de ventas o de un empleado de bolsa,
-- y cuyos salarios no sean iguales a $ 2.500, $ 3.500 o $ 7.000.
SELECT e.last_name, j.job_title, e.salary 
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id 
WHERE e.salary NOT IN (2500, 3500, 7000) 
	AND j.job_id IN (13, 16)

-- 13.Cree un informe para mostrar el apellido, el salario y la comisión de todos los
-- empleados cuya comisión es del 20%.
SELECT e.last_name, e.salary, e.salary-j.min_salary as comision
FROM employees e INNER JOIN jobs j ON e.job_id = j.job_id
WHERE (e.salary-j.min_salary) / e.salary >= 0.2
