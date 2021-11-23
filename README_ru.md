# Описание
Простой проект для демонстрации тестов на фреймворке Spock с репортами в Allure. 

# Сборка и запуск
1. установите JDK Java 11
1. получите ключ доступа к апи с сайта [weatherstack](weatherstack.com)
1. установите ключ доступа как переменную окружения `API_KEY`
1. запустите сборку проекта и тесты командой `gradle clean build test`
1. сгенерируйте отчет командой `gradle allureReport` или `gradle allureServe`
    1. gradle allure плагин не всегда загружает бинарник Аллюра автоматически. Для исправления выполните команду`gradle downloadAllure` для скачивания вручную
1. при работе с проектом в IntelliJ IDEA требуется включить плагин Lombok и указать Lombok как процессор аннотаций в настройках IDE