## Запуск приложения:

+ Запустить контейнеры командой docker-compose up -d --force-recreate --build
+ Во втором окне терминала запустить джарник командой java -jar aqa-shop.jar
+ Перейти на сайт http://localhost:8080

## Запуск тестов для оплаты по карте:

1. Открыть Idea
2. Открыть класс PaymentTests
3. Слева от надписи public class PaymentTests нажать на зеленую кнопку с галочкой play
4. Нажать run "PaymentTests"

## Запуск тестов для оплаты по кредитной карте:

1. Открыть Idea
2. Открыть класс CreditTests
3. Слева от надписи public class CreditTests нажать на зеленую кнопку с галочкой play
4. Нажать run "CreditTests"
