  CREATE TABLE = создать таблицу  
  SELECT = ПОКАЖИ 
  FROM = ИЗ
  WHERE = ГДЕ 
  DROP = УДАЛИТЬ
  CONSTRAINT = ОГРАНИЧЕНИЕ 
  PRIMARY KEY = ПЕРВИЧНЫЙ КЛЮЧ
  FOREIGN KEY =  ВНЕШНИЙ КЛЮЧ 
  REFERENCES = ОТНОСИТСЯ
  ON DELETE NO ACTION ON UPDATE NO ACTION
  ORDER = УПОРЯДОЧИТЬ 
  BY - ПО 
  ASC = УПОРЯДОЧИТЬ ПО ВОЗРОСТАНИЮ
  DESC = УПОРЯДОЧИТЬ ПО УБЫВАНИЮ
  IS NOT NULL = НЕ НОЛЬ
  IS NULL = НОЛЬ
  IN = ДИАПАЗОН
  BETWEEN 10 AND 15 = МЕЖДУ ДВУМЯ ЗНАЧЕНИЯМИ
  LIKE 'A' = ИЩЕТ ВСЕ ЗНАЧЕНИЯ КОТОРЫЕ НАЧИНАЮТСЯ НА 'А'
  % = ОЗНАЧАЕТ "ДАЛЬШЕ ВСЕ ЧТО УГОДНО"
  LIKE = ПОДОБЕН
  AND = ЛОГИЧЕСКОЕ 'И'
  OR = ЛОГИЧЕСКОЕ 'ИЛИ'
  COUNT = ПОСЧТИТАЙ КОЛ-ВО , АГРЕГИРУЮЩАЯ ФУНКЦИЯ
  MAX = МАКСИМАЛЬНОЕ ЗНАЧЕНИЕ АГРЕГИРУЮЩАЯ ФУНКЦИЯ
  MIN = МИНИМАЛЬНОЕ ЗНАЧЕНИЕ АГРЕГИРУЮЩАЯ ФУНКЦИЯ
  SUM = СУММА ЗНАЧЕНИЙ АГРЕГИРУЮЩАЯ ФУНКЦИЯ 
  AVG = СРЕДНЕЕ ЧИСЛО ЗНАЧЕНИЙ АГРЕГИРУЮЩАЯ ФУНКЦИЯ
  DISTINCT =  ПОЛУЧИТЬ УНИКАЛЬНОЕ ЗНАЧЕНИЕ
  INSERT INTO = ВСТАВЬ В 
  VALUES - ЗНАЧЕНИЕ
  DELETE - УДАЛИТЬ
  UPDATE - ОБНОВИ
  SET - УСТАНОВИ
  AS - КАК , МЕНЯЕТ НАЗВАНИЕ ТАБЛИЦЕ В ЗАПРОСЕ
  LIMIT - ОГРАНИЧИТЬ, ЗАДАЁТ ЛИМИТ ВЫДАЧИ ЗАПИСЕЙ
  SELECT FROM (SELECT FROM ) - МОЖНО СЕЛЕКТИТЬ ИЗ ТАБЛИЦИ КОТОРУЮ УЖЕ СЕЛЕКТИМ 
  GROUP BY - ГРУПИРУЙ ПО 
  HAVING - ИМЕЮЩИЙ, НУЖЕН ДЛЯ РАБОТЫ С АГРЕГАТНЫМИ ФУНКЦИЯМИ ДЛЯ УТОЧНЕНИЯ ЗНАЧЕНИЯ
  UNION - ОБЪЕДИНИТЬ
  JOIN - ОБЪЕДИНИТЬ
  INNER JOIN -
  LEFT JOIN -
  RIGHT JOIN - 
  CALL - ВЫЗОВ, ВЫЗЫВАЕТ ХРАНИМЫЕ ПРОЦЕДУРЫ
  ALTER TABLE - ИЗМЕНИТЬ ТАБЛИЦУ
  ADD COLUMN - ДОБАВИТЬ СТОЛБЕЦ 
  FOREIGN KEY (имя столбца которого хотим сделать внешним ключом ) REFERENCES название таблицы (имя столбца которого хотим сделать первичным ключом)
  

  
  
  Полный порядок выполнения команд
1. FROM
2. JOIN
3. WHERE
4. GROUP BY
5. HAVING
6. SELECT
7. ORDER BY
  
  
  
  
  
 