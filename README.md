# Modelado de Sensores

Estamos desarrollando un sistema de monitoreo de temperatura para un invernadero. El sistema debe ser capaz de registrar la temperatura ambiente y notificar a los usuarios cuando la temperatura supera ciertos umbrales predefinidos. Se te pide que implementes este sistema utilizando el patrón Observer. El sistema debe ser capaz de medir la temperatura ambiente y actualizarla periódicamente. Debe permitir a los usuarios establecer umbrales de temperatura mínima y máxima para recibir notificaciones. Cuando la temperatura medida excede alguno de los umbrales establecidos, el sistema debe notificar a los usuarios. Los usuarios deben poder suscribirse y cancelar la suscripción a las notificaciones de temperatura.

Instrucciones: Identifica las clases necesarias para implementar el sistema utilizando el patrón Observer. Piensa en términos de observables (los objetos que cambian de estado) y observadores (los objetos que desean ser notificados de los cambios). Implementa las clases necesarias y el mecanismo de notificación utilizando el patrón Observer.

## Patrón Observer

### Clases Implementadas

- **SensorTemperatura**:
    - Clase observable que mide la temperatura y notifica a los usuarios.

- **Usuario**:
    - Clase observadora que recibe notificaciones sobre cambios de temperatura.

- **UmbralTemperatura**:
    - Clase que define los límites de temperatura mínima y máxima para cada usuario.
