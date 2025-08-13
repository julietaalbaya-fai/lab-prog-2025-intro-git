#Concurrencia en Java
#Introducción
Un semáforo en Java es un mecanismo de sincronización que controla el acceso a recursos compartidos por múltiples hilos. 
Funciona manteniendo un contador interno que representa el número de permisos disponibles. 
Cuando un hilo quiere acceder al recurso, debe adquirir un permiso; si no hay permisos disponibles, el hilo queda bloqueado hasta que otro hilo libere uno.