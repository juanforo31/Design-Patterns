# PARCIAL II

## **1. Explicación del programa**

El programa desarrollado busca resolver la necesidad de la gestion de vacunas para el `COVID-19` en un centro medico, por la que se podrán añadir una cantidad vacunas especificas según su empresa de fabricación:

- Pfizer
- Astrazeneca
- Janssen
- Moderna

además de que realiza el recuento en caso de suministrarlas y notificará en cada proceso la cantidad de vacunas que hay de ese tipo y enviara alertas en caso de que queden menos de `100`, `50` o en caso de que `no tener existencias`.

## **_1.1 Lenguaje usado_**

Este programa se realizó en `JAVA` ya que no podemos quedarnos estancados a la hora de realizar un programa para una sola plataforma, y ofrece un manejo automatico de la memoria, y por último es un lenguaje que se puede emplear en multiples IDE:

- Eclipse
- Netbeans
- IntelliJ Idea
- Visual Studio Code ...

## **_1.2 IDE_**

Esta aplicación fue desarrollada en `Visual Studio Code` ya que es una herramienta que nos permite añadir diversas extensiones que serán de gran ayuda a la hora de crear un proyecto en `JAVA` o cualquier otro lenguaje de programación.

## **_1.3 Instrucciones generales_**

---

## _1.3.1 Instalar Java_

Para instalar `JAVA` dirijase [aqui](https://www.java.com/es/download/)

## _1.3.2 Instalar JDK_

Para instalar `JDK` dirijase [aqui](https://www.oracle.com/java/technologies/downloads/#jdk17-windows), recuerde verificar las condiciones de su dispositivo.

## _1.3.3 Instalar extensiones en Visual Studio Code_

Dirijase al menú lateral y ingrese a la sección de extensiones (tambien puede usar el comando `Ctrl+Shift+X`), y en la barra de busqueda escriba `Java Extension Pack`, dirijase a la primera opción e instale es extensión.

## _1.3.4 Configuración Visual Studio Code_

Visite el siguiente [video](https://youtu.be/g6TMxG1xTzU?t=362) y realice los pasos a partir del minuto 6. esto con tal de configurar el `JDK` instalado previente en `Visual Studio Code`.

## _1.3.5 Paso final_

Por último descargue la aplicación y abrala con `Visual Studio Code`, para iniciar el programa dirijase al archivo `App.java` y corra el programa con el icono de play ubidaco en la parte superior derecha.

## **2. Explicación patrones usados**

## _2.1 Patrón Factory_

Se utilizo el patrón `factory` ya que la aplicación lo usara con tal de ver l existencias de cada una de las vacunas y en el momento en que se actualicen, informara el valor actial de las existencias de alguna de las vacunas, ademas que alertará a la clinica en el momento en que las existencias de una vacuna tenga menos de `100`, `50` o si `no hay existencias` de la vacuna.

En la aplicación las podemos encontrar en la carpeta `fabrica` donde estaran los archivos `Fabrica.java` que es una calse abstarcta y el archivo `CreadorVacunas.java` que es una fabrica concreta.

y por último encontraremos la implementación de esta fabrica en el archivo `app.java`

```
static IVacuna pfizer;
static IVacuna astrazeneca;
static IVacuna janssen;
static IVacuna moderna;

Fabrica creador = new CreadorVacunas();

// Creación de cada uno de los tipos de vacunas.

        pfizer = creador.crearVacuna(Fabrica.PFIZER);
        astrazeneca = creador.crearVacuna(Fabrica.ASTRAZENECA);
        janssen = creador.crearVacuna(Fabrica.JANSSEN);
        moderna = creador.crearVacuna(Fabrica.MODERNA);
```

## _2.2 Patrón Observer_

Se utilizo el patrón `observer` ya que la aplicación requiere crear objetos de diferente tipo los cuales frecuentemente para todas las operaciones.

En la aplicación las podemos encontrar en la carpeta `observador` donde estaran los archivos `IObservable.java` y `IObserver.java` los cuales son interfaces y el archivo `ObservadorConsola.java` que es una observador concreto.

Encontraremos la implementación del observador en el archivo `app.java`

```
public static ObservadorConsola observadorConsolaPfizer;
public static ObservadorConsola observadorConsolaAstrazeneca;
public static ObservadorConsola observadorConsolaJanssen;
public static ObservadorConsola observadorConsolaModerna;

// Creación de observadores para cada una de las clases
observadorConsolaPfizer = new ObservadorConsola(pfizer);
observadorConsolaAstrazeneca = new ObservadorConsola(astrazeneca);
observadorConsolaJanssen = new ObservadorConsola(janssen);
observadorConsolaModerna = new ObservadorConsola(moderna);
```

y los métodos los podemos encontrar en `Vacuna.java`

```
@Override
public void adicionarObservador(IObserver observer) {
    this.observadores.add(observer);
}

@Override
public void removerObservador(IObserver observer) {
    this.observadores.remove(observer);
}

@Override
public void verExistencias() {
    System.out.println(
            ANSI_PURPLE + "Hay " + this.getExistencias() + " vacunas de " + thisgetNombre() + "\n" + ANSI_RESET);
}

private void notificar() {
    for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
        IObserver iObserver = it.next();
        iObserver.update();
    }
}

private void notificarAlertaMenosCien() {
    for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
        IObserver iObserver = it.next();
        iObserver.alertaMenosCien();
    }
}

private void notificarAlertaMenosCincuenta() {
    for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
        IObserver iObserver = it.next();
        iObserver.alertaMenos50();
    }
}

private void notificarAlertaSinExistencias() {
    for (Iterator<IObserver> it = this.observadores.iterator(); it.hasNext();) {
        IObserver iObserver = it.next();
        iObserver.alertaSinExistencias();
    }
}
```

---

# READ ME JAVA

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
