# HarwareStorage_Backend
Backend of application REST , spring-boot + angular 4 with sql , about hardware storage 


<h2>Docker app bd:</h2>
<h4>-Se descargan las imagenes a usar</h4>
docker pull mongo<br>

<h4>-Se crea la red para inteconectar los contenedores sin usar link</h4>
docker network create redsql --driver bridge<br>

<h4>-Se crean los contenedores en base a las imagenes y la net</h4>
docker container create -p 27017:27017 --network redsql -e MONGO_INITDB_ROOT_USERNAME="root" -e MONGO_INITDB_ROOT_PASSWORD="1234" --name mongodb mongo<br>

docker start mongodb

<h4>-Conectar a BD por consola</h4>
docker exec -it mongodb mongo -u "root"<br>
pass:1234<br>
db.createUser({user: "user_java", pwd: "user_java", roles : [{role: "readWriteAnyDatabase", db: "admin"}]});<br>
exit;<br>
docker exec -it mongodb mongo -u "user_java"<br>
 
 OJO se a creado en admin como db , para ver si esto es correcto entra root y "use admin" y "show users;"

<h4>-Acceso por navegador web </h4>
http://localhost:8080/swagger-ui.html<br>
<br>
Para arrancar proyecto hay que ir a resources>application.properties y cambiar el user y pass de la BD o crear los usuarios y pass que hay reflejan. 

OJO:el puerto asignado a la hora de crear el mogo en docker tiene que ser el del application.properties 
normalmente mongo esta en el 27017
