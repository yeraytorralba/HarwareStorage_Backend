# HarwareStorage_Backend
Backend of application REST , spring-boot + angular 4 with sql , about hardware storage 


<h2>Docker app bd:</h2>
<h4>-Se descargan las imagenes a usar</h4>
docker pull mysql<br>
docker pull phpmyadmin<br>

<h4>-Se crea la red para inteconectar los contenedores sin usar link</h4>
docker network create redsql --driver bridge<br>

<h4>-Se crean los contenedores en base a las imagenes y la net</h4>
docker container create -p 33060:3306 --network redsql -e MYSQL_ROOT_PASSWORD=1234 --name mysql-db mysql<br>
docker container create -p 8085:80 --network redsql -e PMA_HOST=mysql-db -e PMA_USER=root -e PMA_PASSWORD=1234 --name phpmyadmin phpmyadmin<br>

<h4>-Conectar a BD por consola</h4>
docker exec -it mysql-db mysql -p<br>

<h4>-Dentro de mysql</h4>
create databas hardware_bd;<br>
show databases;<br>

<h4>-Acceso por navegador web </h4>
http://localhost:8085<br>
<br>
Para arrancar proyecto hay que ir a resources>application.properties y cambiar el user y pass de la BD o crear los usuarios y pass que hay reflejan. 

