# ScreenPlaySerenityIs

Este proyecto es realizado con la intención de realizar el proyecto desafio propuesto por la empresa CHOUCAIR, se realizó con el modelo de diseño Screenplay a la pagina Serenity.is. 

### Herramientas
_Las herramientas empleadas para este proyecto son:_
* Java
* Selenium Web Driver
* Screenplay
* Cucumber
* Gherkin

## Modelo de Screenplay
_Es un patrón de diseño orientado al comportamiento BDD. Presenta un alto desacoplamiento de la interfaz de usuario. Propone trabajar en términos de tareas y no de interfaz de usuario_

_Screenplay presenta la siguiente ventaja frente al patrón Page Object no cumple con algunos de los principios SOLID recomendados para realizar código flexible y mantenible._

## Pasos que debe realizar la automatizacion
* Ir a la página https://serenity.is/demo 
* Logearse en la página con la data
* Ir a Organización
* Ir a las unidades de negocio
* Crear una nueva "Bussines Unit"
* Abrir el menú Reunion
* Acceder a la pantalla reuniones
* Crear un Reunion
* Rellenar la información
* Verificar que la reunión se halla creado

## Resultado del test
[![Resultados-Test.png](https://i.postimg.cc/gJTVRVxP/Resultados-Test.png)](https://postimg.cc/k6WRPtNj)

## Estructura del proyecto

_En este apartado vamos a definir cada apartado de forma general._

### Uis
_Las Uis son las Users Interfaces(Interfases de usuarios), es en donde guardamos los elementos que vamos a necesitar para nuestras pruebas, como lo son cajas de texto, botones, títulos etc._

### Tasks
_Las tareas o tasks son el paso a paso de lo que queremos que nuestra automatización haga, por ejemplo que le escriba en la caja de búsqueda de texto y que le de clic en buscar, es un ejemplo valido de una task. Como se puede intuir , acá hacemos uso de los componentes que se encuentren en los uis._

### Driver
_Este paquete hace que habrá el navegador con la configuración que nosotros deseemos. Si lo queremos que se maximice es por ejemplo una configuración_

### Features
_En este paquete encontramos los archivos feature, por cada archivo feature debe existir un archivo stepsDefinitions y un archivo Runner, en el archivo feature, escribimos en un lenguaje natural como lo es el español, el paso a paso del escenario que queremos probar._

### StepsDefinitions
_En el paquete stepsDefinitons o definición de pasos en español, es indicar cuales @Tasks se van a ejecutar en los pasos definidos anteriormente en el feature._

### Runner
_Estos archivos runner, son los que ejecutan la unión del el archivo feauture y el archivo stepsDefinitions._

## Paquetes, Clases y Métodos:
_A continuación mostraremos los códigos y de las clases a que paquete pertenecen y cuál es su función._


#### Esto sería todo por parte del proyecto de automatización a la página Serenity.is, gracias por la atención prestada! 


