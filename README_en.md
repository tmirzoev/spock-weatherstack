# Description

Simple project, showcasing testing with Spock and Allure reports.


# How to run
1. install JDK for Java 11 on your machine
1. get api access key from [weatherstack](weatherstack.com)
1. set `API_KEY` variable in your environment to conatain the api access key from the previous step
1. build the project and run tests with `gradle clean build test`
1. generate Allure report with `gradle allureReport` or `gradle allureServe`
    1. gradle allure plugin can sometimes fail to download allure binaries automatically. This can be fixed by running `gradle downloadAllure` task
1. if building/running with IntelliJ IDEA, don't forget to enable Lombok plugin and ensure that Lombok is enabled as annotation processor
