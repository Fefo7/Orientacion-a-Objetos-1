# Arquetipos de Orientacion a Objetos

<li>Liste todos los métodos, indicando nombre y clase, que son ejecutados como resultado del envío del último mensaje de cada fragmento de código (por ejemplo, (1) método +aportes de la clase Empleado, (2) ...)</li>


```java
Gerente alan = new Gerente("Alan Turing");
double aportesDeAlan = alan.aportes(); 
// alan: (1) aportes de la clase genrente + (2) montoBasico de a clase gerente
```
```java
Gerente alan = new Gerente("Alan Turing");
double sueldoBasicoDeAlan = alan.sueldoBasico();
// alan: (1) sueldoBasico de la clase EmpeladoJerarquico + (2) sueldo basico de la clase empleado ( (3) monto basico + (4)aportes de la clase empleado)    + (5) bonoPorcategoria de la clase empleado jerarquico 
```
<li>¿Qué valores tendrán las variables aportesDeAlan y sueldoBasicoDeAlan luego de ejecutar cada fragmento de código?</li>

```java
Gerente alan = new Gerente("Alan Turing");
double aportesDeAlan = alan.aportes(); // 57000.0 * 0.05 = 2850.0

```
```java
Gerente alan = new Gerente("Alan Turing");
double sueldoBasicoDeAlan = alan.sueldoBasico(); // ((sueldo basico)35000 + (aportes)13500) + (categoria)8000 = 56500
```
