# Assesment 2 - TP1

## Vehicles

1. ¿Qué pilares podrían aparecer de acuerdo al tema asignado?
    - Abstracción
    - Encapsulamiento
    - Herencia
    - Polimorfismo

2. ¿Qué aplicaciones irían de acorde al tema asignado para observar los pilares mencionados anteriormente?
    - Clase abstracta: Un vehículo no puede existir sin ser un tipo más específico de un vehículo (un auto, una bici...). Acá aplicamos abstracción y herencia.
    - Interfaces: Aplicamos polimorfismo entre los vehículos que pueden encenderse y apagarse, no todos lo hacen iguales.
    - Getters, setters y modificadores de acceso: Aplicamos encapsulamiento,EJ. las propiedades de un carro no están visibles para los demás, solo para si mismo.

3. Implementar un ejemplo justificando la respuesta a los enunciados anteriores.


# Assesment 3 - TP2

## Factory Method

1. ¿Por qué es importante aplicar ese principio en el desarrollo de software?
   - YAGNI: Se eliminaron atributos y métodos que no eran necesarios para nuestro ejemplo (color, velocidad máxima, getters y setters, etc).
   - KISS: Se evitó complejizar el sistema, manteniendo la funcionalidad.
   - DRY: Se reutilizaron los contructores para evitar la repetición de código.

2. ¿Qué problemas resuelve el patrón de diseño asociado?

   Nos permite separar el código de construcción de producto (Vehículo) del código que hace uso del producto. 
   Por ello, es más fácil extender el código de construcción de producto de forma independiente al resto del código.

3. ¿Cómo se relaciona este patrón con los principios SOLID?
   - Responsabilidad única: La clase Factory tiene como única responsabilidad crear el producto y las clases de producto se encargan de definir su propio comportamiento.
   - Abierto - Cerrado: El patrón permite extender fácilmente el sistema creando nuevas clases de producto y factories, realizando aquello sin modificar el código existente.
   - Sustitución de Liskov: El patrón se asegura que todas las clases concretas implementan las misma interfaz y pueden ser usadas de la misma forma que cualquier otro objeto que implemente la misma interfaz.
   - Segregación de Interfaces: El patrón no necesita la aplicación de este principio para funcionar (Al menos en este proyecto).
   - Inversión de Dependencia: Las clases principales no dependen de clases concretas, sino de abstracciones, lo que promueve un diseño más flexible y orientado a interfaces.