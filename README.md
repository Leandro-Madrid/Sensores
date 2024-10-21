# Sensores

Estamos desarrollando un sistema de monitoreo de temperatura para un invernadero. El sistema debe ser capaz de registrar la temperatura ambiente y notificar a los usuarios cuando la temperatura supera ciertos umbrales predefinidos. Se te pide que implementes este sistema utilizando el patrón Observer. El sistema debe ser capaz de medir la temperatura ambiente y actualizarla periódicamente. Debe permitir a los usuarios establecer umbrales de temperatura mínima y máxima para recibir notificaciones. Cuando la temperatura medida excede alguno de los umbrales establecidos, el sistema debe notificar a los usuarios. Los usuarios deben poder suscribirse y cancelar la suscripción a las notificaciones de temperatura.

Instrucciones: Identifica las clases necesarias para implementar el sistema utilizando el patrón Observer. Piensa en términos de observables (los objetos que cambian de estado) y observadores (los objetos que desean ser notificados de los cambios). Implementa las clases necesarias y el mecanismo de notificación utilizando el patrón Observer.

## Patrón Observer

### Elementos del Patrón

1. **Subject (Observable)**:
    - **Clase**: `SensorTemperatura`
    - **Descripción**: Es la clase que mantiene el estado (temperatura) y notifica a los observadores (usuarios) cuando hay cambios significativos. Permite la suscripción y cancelación de los observadores.

2. **Observer**:
    - **Clase**: `Usuario`
    - **Descripción**: Representa a los objetos que desean ser notificados de los cambios en el `SensorTemperatura`. Cada usuario puede definir su comportamiento al recibir una notificación, como comprobar si la temperatura está dentro de sus límites establecidos.

3. **ConcreteObserver**:
    - **Clase**: `UmbralTemperatura`
    - **Descripción**: Define los límites de temperatura mínima y máxima específicos para cada usuario. Se utiliza por el `Usuario` para determinar si la notificación recibida es relevante o no.

### Clases y Estructura

1. **Interfaz Observer**:
    - **Descripción**: Define el método `actualizar(double temperatura)` que debe implementar cualquier clase que desee ser notificada de cambios en la temperatura.

2. **Interfaz Observable**:
    - **Descripción**: Define métodos para manejar la suscripción y notificación de observadores.

3. **Clase SensorTemperatura**:
    - **Descripción**: Implementa la interfaz `Observable` y gestiona la lista de observadores. Notifica a los observadores cuando la temperatura cambia.

4. **Clase Usuario**:
    - **Descripción**: Implementa `Observer` y define cómo reaccionar ante cambios en la temperatura, verificando si la temperatura está dentro de los límites establecidos.

5. **Clase UmbralTemperatura**:
    - **Descripción**: Representa los límites de temperatura que un usuario desea monitorear.