# Problema principal de usar un array con su capacidad por defecto igual a 10

Cuando se tiene un vector y ha copado toda su capacidad se va a duplicar, al duplicarse se sabe que se genera una operación (Costosa)

Ejemplo:
Cuando se hace una copia del vector con n posiciones, y luego una copia duplicada para guardar la nueva copia con sus nuevos elementos.

Entonces al hacer este mismo procedimiento con un vector al cual se le van agregar n elementos equivalentes a 1M, esto implica hacer la 
operación demasiadas veces, lo cual a su vez también consumirá más memoria.


