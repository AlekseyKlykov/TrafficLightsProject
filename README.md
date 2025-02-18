<h1>Светофор</h1>

<h4>В данном проекте были реализованы классы:
<br>
PedestrianTrafficLights - эмулятор пешеходного светофора;<br>
TrafficLightsImpl - эмулятор транспортного светофора;<br>
TrafficLightWithAdditionalSection - эмулятор транспортного светофора с дополнительной секцией(стрелкой).<br>
Данные классы имплементируют интерфейс TrafficLights реализуя методы:<br>
public void signalSwitching() throws InterruptedException - переключение сигнала;<br>
public default void run() throws InterruptedException - запуск светофора(дефолтная реализация использует рекурсию,<br>
 не  имеет остановки в каждом классе этот метод переопределен);<br>
При инициализации объектам на вход в конструктор передается map с сигналами светофора, всего их четыре:<br>
GreenLight;<br>
LeftArrowLight;<br>
RedLight;<br>
YellowLight;<br>
Данные классы имплементируют интерфейс ColorTrafficLights<br>
реализуя четыре метода:<br>
setTimeSleep - установка времени задержки в мс;<br>
getTrafficLights - вывод сигнала светофора на экран;<br>
getTimeSleep - получение времени задержки в мс;<br>
getNextTrafficLights - получение следующего сигнала светофора.<br>
При создании проекта были реализованы паттерны: состояние, фабричный метод<br>

Результат работы программы изображен ниже на скриншоте:<br>

</h4>
 

