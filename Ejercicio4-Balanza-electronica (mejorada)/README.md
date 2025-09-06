<h3> Tarea 1 </h3>
Mejorar la balanza para que recuerde los productos ingresados (los mantenga en una colección). Analice de qué forma puede realizarse este nuevo requerimiento e implemente el mensaje 
public List<Producto> getProductos() que retorna todos los productos ingresados a la balanza (en la compra actual, es decir, desde la última vez que se la puso a cero).

<div>
  <details>
  <summary>¿Qué cambio produce este nuevo requerimiento en la implementación del mensaje ponerEnCero() ?</summary>
  <div>
    <p> En este caso, poner en 0 seria restablecer la lista de los Productos en null </p>
  </div>
  </details>
  <details>
  <summary>¿Es necesario, ahora, almacenar los totales en la balanza? ¿Se pueden obtener estos valores de otra forma?</summary>
  <div>
    <p> Los totales se deberian almacenar en el ticket (?), deberia encargarse de realizar los montos totales  </p>
  </div>
</details>
</div>

<h3> Tarea 2 </h3>
<p> Con esta nueva funcionalidad, podemos enriquecer al Ticket, haciendo que él también conozca a los productos (a futuro podríamos imprimir el detalle). Ticket también debería entender el mensaje  public List<Producto> getProductos(). 
  <details>
  <summary>¿Qué cambios cree necesarios en Ticket para que pueda conocer a los productos?</summary>
  <div>
    <p> Podria tener una relacion con una balanza, la cual tiene todos los productos? osea tener un objeto balanza dentro del ticket (> acoplamiento) </p>
  </div>
  </details>

  <details>
  <summary>¿Estos cambios modifican las responsabilidades ya asignadas de realizar cálculo del precio total?. ¿El ticket adquiere nuevas responsabilidades que antes no tenía?</summary>
  <div>
    <p> Pasaria la responsaiblidad al ticket de realziar los calculos totales </p>
  </div>
  </details>
</p>

<h3> Tarea 3 </h3>
<details>
  <summary>Después de hacer estos cambios, ¿siguen pasando los tests? ¿Está bien que sea así?</summary>
  <div>
    <p> Se deberian reefactorizar los test, ya que cambio el modelo. No estan correctos </p>
  </div>
</details>


