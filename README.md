# HarwareStorage_Backend
Backend of application REST , spring-boot + angular 4 with sql , about hardware storage 


Docker app bd:
-Se descargan las imagenes a usar
docker pull mysql
docker pull phpmyadmin

-Se crea la red para inteconectar los contenedores sin usar link
docker network create redsql --driver bridge

-Se crean los contenedores en base a las imagenes y la net
docker container create -p 33060:3306 --network redsql -e MYSQL_ROOT_PASSWORD=1234 --name mysql-db mysql
docker container create -p 8085:80 --network redsql -e PMA_HOST=mysql-db -e PMA_USER=root -e PMA_PASSWORD=1234 --name phpmyadmin phpmyadmin

-Conectar a BD por consola
docker exec -it mysql-db mysql -p

-Dentro de mysql
create databas hardware_bd;
show databases;

-Acceso por navegador web 
http://localhost:8085

Para arrancar proyecto hay que ir a resources>application.properties y cambiar el user y pass de la BD o crear los usuarios y pass que hay reflejan. 

