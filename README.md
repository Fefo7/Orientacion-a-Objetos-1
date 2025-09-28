<h1> Orientacion a Objetos-1</h1
                              
<div>
  <li> "super" en objetos es mala palabra</li>
  <li> las realciones en uml son al reves que en DBD</li>
</div>
<div>
  
  <h4>Algunas reglas sobre colecciones: </h4>
  <li>Nunca modificar una coelccion que obtuve de otro objeto</li>
  <li> Cada objeto es responsable de mantener los invariantes de sis colecciones</li>
  <li>Solo el dueño de la coleccion puede modificarla</li>
  <li>Recordar que una coleccion puede cambiar luego de que la obtengo</li>
</div>
<div>
  <h3>Streams</h3>
  <p>Son objetos que nos dejan hacer cosas interesantes con colecciones, las operaciones se combinan para formar pipelines(tuberias)</p>
<p><b>Los streams: </b>  no almacenan sino que porveen acceso a una fuente (coleccion, canal i/o, etc). CAda operacion produce un resultado, pero no modifica la fuente.<p>
<img width="892" height="185" alt="image" src="https://github.com/user-attachments/assets/ed77f9af-fc6b-49ff-b82a-5b1441e7f767" />

  
  <h3>Expresiones lambda (clausuras / closures)</h2>
  <p>Nos ayudan para poder parametrizar lo qeu otros objetos deben hacer o decirle a otros objetos que me avisen cuando pase algo (callbacks)</p>
</div>
<h3>operaciones basicas de Strems</h3>

<pre>
List<Inversion> inversiones = this.inversiones;

// Recorrer elementos
inversiones.stream()
    .forEach(inv -> System.out.println(inv));

// Filtrar elementos
inversiones.stream()
    .filter(inv -> inv.getMonto() > 1000)
    .forEach(System.out::println);

// Transformar elementos
List<Double> montos = inversiones.stream()
    .map(Inversion::getMonto)
    .collect(Collectors.toList());

// Sumar valores
double total = inversiones.stream()
    .mapToDouble(Inversion::getMonto)
    .sum();

// Contar elementos
long cantidad = inversiones.stream()
    .count();

// Ordenar por monto
List<Inversion> ordenadas = inversiones.stream()
    .sorted(Comparator.comparing(Inversion::getMonto))
    .collect(Collectors.toList());

// Verificar si alguna cumple una condición
boolean hayGrandes = inversiones.stream()
    .anyMatch(inv -> inv.getMonto() > 10000);

// Eliminar duplicados (requiere equals y hashCode)
List<Inversion> sinDuplicados = inversiones.stream()
    .distinct()
    .collect(Collectors.toList());

</pre>
