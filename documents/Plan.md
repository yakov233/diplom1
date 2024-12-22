## Перечень сценариев для раздела "Оплата по карте":
# Happy pass:

1. Отправка формы с валидными данными, карта 4441
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными
 - нажать продолжить
 - ожидаемый результат: форма отправляется, статус в базе данных approved

# Sad pass:

1. Отправка формы с валидными данными, карта 4442
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными
 - нажать продолжить
 - ожидаемый результат: форма отправляется, появляется ошибка, статус в базе данных declined
2. Отправка формы с пустым полем "номер карты"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "номер карты" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле номер карты появляется сообщение об ошибке с прозьбой заполнить поле
3. Отправка формы с пустым полем "месяц"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "месяц" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле месяц появляется сообщение об ошибке с прозьбой заполнить поле
4. Отправка формы с пустым полем "год"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "год" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле год появляется сообщение об ошибке с прозьбой заполнить поле
5. Отправка формы с пустым полем "владелец"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "владелец" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле владелец появляется сообщение об ошибке с прозьбой заполнить поле
6. Отправка формы с пустым полем "cvc/cvv"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "cvc/cvv" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле cvc/cvv появляется сообщение об ошибке с прозьбой заполнить поле
7. Отправка пустой формы
 - открыть сайт
 - нажать купить
 - не заполнять поля
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить все поля
8. Отправка формы с не полностью заполенным полем номера карты
 - открыть сайт
 - нажать купить
 - заполнить поле номер карты из 15 цифр
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле номер карты
9. Отправка формы с не правильным месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 13
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
10. Отправка формы с не существующим месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 0
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
11. Отправка формы с не существующим месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 0
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
12. Отправка формы с истекшим годом карты
 - открыть сайт
 - нажать купить
 - заполнить поле год прошлым годом
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле год правильно
13. Отправка формы с цифрами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей цифрой
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
14. Отправка формы с цифрами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей цифрой
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
15. Отправка формы с спецсимволами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей спецсимволом
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
16. Отправка формы с недоконца заполенным полем "cvc/cvv"
 - открыть сайт
 - нажать купить
 - заполнить поле "cvc/cvv" двумя цифрами
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле "cvc/cvv" правильно

## Перечень сценариев для раздела "Кредит по данным карте":
# Happy pass:

1. Отправка формы с валидными данными, карта 4441
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными
 - нажать продолжить
 - ожидаемый результат: форма отправляется, статус в базе данных approved

# Sad pass:

1. Отправка формы с валидными данными, карта 4442
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными
 - нажать продолжить
 - ожидаемый результат: форма отправляется, появляется ошибка, статус в базе данных declined
2. Отправка формы с пустым полем "номер карты"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "номер карты" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле номер карты появляется сообщение об ошибке с прозьбой заполнить поле
3. Отправка формы с пустым полем "месяц"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "месяц" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле месяц появляется сообщение об ошибке с прозьбой заполнить поле
4. Отправка формы с пустым полем "год"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "год" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле год появляется сообщение об ошибке с прозьбой заполнить поле
5. Отправка формы с пустым полем "владелец"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "владелец" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле владелец появляется сообщение об ошибке с прозьбой заполнить поле
6. Отправка формы с пустым полем "cvc/cvv"
 - открыть сайт
 - нажать купить
 - заполнить все поля валидными данными, оставив поле "cvc/cvv" пустым
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, в поле cvc/cvv появляется сообщение об ошибке с прозьбой заполнить поле
7. Отправка пустой формы
 - открыть сайт
 - нажать купить
 - не заполнять поля
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить все поля
8. Отправка формы с не полностью заполенным полем номера карты
 - открыть сайт
 - нажать купить
 - заполнить поле номер карты из 15 цифр
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле номер карты
9. Отправка формы с не правильным месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 13
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
10. Отправка формы с не существующим месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 0
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
11. Отправка формы с не существующим месяцем
 - открыть сайт
 - нажать купить
 - заполнить поле месяц цифрой 0
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле месяц правильно
12. Отправка формы с истекшим годом карты
 - открыть сайт
 - нажать купить
 - заполнить поле год прошлым годом
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле год правильно
13. Отправка формы с цифрами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей цифрой
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
14. Отправка формы с цифрами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей цифрой
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
15. Отправка формы с спецсимволами в поле владелец
 - открыть сайт
 - нажать купить
 - заполнить поле владелей спецсимволом
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле владелец правильно
16. Отправка формы с не до конца заполенным полем "cvc/cvv"
 - открыть сайт
 - нажать купить
 - заполнить поле "cvc/cvv" двумя цифрами
 - нажать продолжить
 - ожидаемый результат: форма не отправляется, появляется сообщение об ошибке с прозьбой заполнить поле "cvc/cvv" правильно

## Перечень используемых инструментв:

1. Selenide-для автоматизации тестирования
2. Junit5-для написания и запуска тестов
3. Dev tools-для поиска элементов на сайте
4. Docker-для вертуализации приложения
5. MySql-для проверки, чтобы приложение запускалось на mysql
6. PostgresSql-для проверки, чтобы приложение запускалось на postgressql

## Риски:

1. Изменения в дизайне приложения
2. Ошибки в коде

## Время на работу:

- Одна неделя




