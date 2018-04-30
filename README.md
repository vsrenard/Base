Base
=============================

Программа на языке Kotlin, которая может реализовать интерактивный интерфейс командной строки для хранения (в памяти) и обработки строковых пар "ключ-значение". 

Подключение и работа
------------

При запуске файла main.kt вам станут доступны следующие функции:  
Insert key value - добавление пары key : value,  
DeleteByKey/DeleteByValue key/value - удаление пары по ключу и/или значению,  
FindByKey/FindByValue key/value - поиск пар по фрагменту значения и/или ключа,  
Exit - завершение программы.

Пример
---------
*Input:*  
Insert cat kitten  
Insert dog puppy  
Insert cat white  
FindByKey cat  
DeleteByValue white  
FindByValue kit  
Exit  
***
*Output:*  
cat kitten  
cat white  
cat kitten  
