# ControlClientes

This is a web application that saves, edit, delete and find customers in a single table database. Its a CRUD web app developed with Java, Servlets, JSP, JSTL, Expression Language,
MySql, Bootstrap, GlassFish Server and Fontawesome. The project was made under the MVC pattern to put in practice all the knoledge I have been getting on since I started studying Java Web.
To try this web app you have to create a database in MySql with the followed schema---->

Database name: control_clientes.

Table name: cliente.

id_cliente INT PK AUTOINCREMENT,

nombre VARCHAR(45),

apellido VARCHAR(45),

email VARCHAR(45),

telefono VARCHAR(45),

saldo double

And also you have to use your database credentials in the Conexion.java class to get conected succesfully to the database. You have to have configured the GlassFish server in your IDE too.

#Vistas

Database Schema

![image](https://user-images.githubusercontent.com/94880683/192759267-c9ce8c07-8578-43f4-b1a7-2c0abfc39523.png)


Pagina de Inicio

![image](https://user-images.githubusercontent.com/94880683/192758743-1589c9c0-8597-4c7f-ab09-b4437a28f902.png)

Agregar Cliente

![image](https://user-images.githubusercontent.com/94880683/192758930-bb38dc00-fc27-4ec5-8804-3540771ded7d.png)

Editar y Eliminar Cliente

![image](https://user-images.githubusercontent.com/94880683/192759084-41934631-febf-454d-a50a-98fb2916e0ae.png)
