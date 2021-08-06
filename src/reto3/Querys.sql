--1.	Necesitan conocer en qué proyectos se debe dinero por la compra de materiales, ordenando por el id del proyecto.
select distinct(c.ID_Proyecto) from Compra c where c.Pagado = "No" order by c.ID_Proyecto;

--2.	Necesitan conocer qué proyectos utilizan materiales de construcción importados.
select distinct(c.ID_Proyecto)
from Compra c inner join MaterialConstruccion mc
	on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
where mc.Importado = "Si" order by c.ID_Proyecto;

--3.	Se necesita conocer el número de líderes que hay por cada Ciudad y su respectiva Ciudad.
select count(l.ID_Lider), l.Ciudad_Residencia from Lider l group by Ciudad_Residencia;

--4.	Se necesita conocer los materiales que no se le han pagado al proveedor Homecenter, indicando a que proyecto están asociados.
select c.ID_Proyecto, c.Proveedor, c.Pagado, c.ID_MaterialConstruccion, mc.Nombre_Material 
from Compra c inner join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion 
where c.Pagado = "No" and c.Proveedor = "Homecenter"
order by c.ID_Proyecto;

--5.	Se necesita saber el nombre y apellidos del líder del o de los proyecto(s) en los que se debe dinero por la compra de materiales.
select distinct l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido
from Lider l inner join Proyecto p on p.ID_Lider = l.ID_Lider
INNER JOIN Compra c on c.ID_Proyecto = p.ID_Proyecto 
where c.Pagado <> "Si";

--Opción reto
select distinct l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido
from Lider l inner join Proyecto p on p.ID_Lider = l.ID_Lider;
























