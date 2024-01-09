CREATE TABLE users (
id INTEGER NOT NULL, 
first_name NVARCHAR(50) NOT NULL,
last_name NVARCHAR(50) NOT NULL,
middle_name  NVARCHAR(50) NOT NULL,
email NVARCHAR(256) NOT NULL,
CONSTRAINT users_id PRIMARY KEY(id)
);

CREATE TABLE user_2 ( 
fast_table INTEGER NOT NULL
)

DROP TABLE users_1 

DROP TABLE user_2






    CREATE TABLE [Customer]
(  
    [Customerid] INTEGER NOT NULL,
    [FirstName] NVARCHAR(40) NOT NULL,
    [LastName] NVARCHAR(20) NOT NULL,
    [Company] NVARCHAR(80),
    [Address] NVARCHAR(70),
    [City] NVARCHAR(40),
    [State] NVARCHAR(40),
    [Country] NVARCHAR(40),
    [PostalCode] NVARCHAR(10),
    [Photo] NVARCHAR(24),
    [Fax] NVARCHAR(24),
    [Email] NVARCHAR(60)NOT NULL,
    [SupportRepId] INTEGER,
  CONSTRAINT [PK_Customer] PRIMARY KEY ([Customerid]),
  FOREIGN KEY ([SupportRepId]) REFERENCES [Employee]([EmployeeId])
      ON DELETE NO ACTION ON UPDATE NO ACTION
);


CREATE TABLE test1 (
    id INTEGER NOT NULL,
    name NVARCHAR(200),
    CONSTRAINT pk_test PRIMARY KEY (id)
)


SELECT CustomerId FROM Customer;



SELECT CustomerId, FirstName, LastName, Email  
FROM Customer;


SELECT * FROM Customer ;

SELECT * FROM Customer
WHERE FirstName = "Mark";

SELECT * FROM Customer
WHERE Company IS NOT NULL;


SELECT * FROM Customer
WHERE City = 'Rio de Janeiro';

SELECT * FROM Customer c 
WHERE FirstName = ''


SELECT * FROM Customer c 
WHERE Company IS NULL

FDSFDS

SELECT * FROM Customer c  WHERE CustomerId  > 50;

SELECT * FROM Customer c WHERE CustomerId != 50

SELECT * FROM Invoice ORDER BY Total ASC 

SELECT * FROM Invoice i ORDER BY Total DESC 

SELECT * FROM Invoice i ORDER BY BillingAddress

SELECT * FROM Customer c  ORDER BY FirstName

SELECT * FROM Invoice i WHERE CustomerId ='7'
ORDER BY Total DESC

SELECT * FROM Invoice i  WHERE BillingCountry = 'Germany'
ORDER BY BillingCity 





SELECT InvoiceId, Total 
FROM Invoice  
WHERE CustomerId = 7
ORDER BY Total DESC





SELECT * FROM Genre g 


SELECT * FROM Invoice i  WHERE CustomerId =7

SELECT InvoiceId, Total  FROM Invoice i  WHERE CustomerId =7
ORDER BY Total  DESC 


CREATE TABLE users23 (
id INTEGER NOT NULL,
first_name CHAR(299),
last_name VARCHAR,
TEXT1 TEXT,
TINYINT1 TINYINT,
BOOL1 BOOL,
FALSE1 FALSE,
INT1 INT,
FLOAT1 FLOAT,
DOUBLE1 DOUBLE,
DATE1 DATE,
TIME1 TIME,
DATETIME1 DATETIME
)

CREATE TABLE users45( 
   id INTEGER NOT NULL,
   first_name NVARCHAR (50) NOT NULL,
   last_name NVARCHAR (50) NOT NULL,
   middle_name NVARCHAR (50) NOT NULL,
   email NVARCHAR (256),
   CONSTRAINT users_id PRIMARY KEY (id)
   )


CREATE TABLE users456( 
   id INTEGER NOT NULL,
   first_name NVARCHAR (50) NOT NULL,
   last_name NVARCHAR (50) NOT NULL,
   middle_name NVARCHAR (50) NOT NULL,
   email NVARCHAR (256),
   CONSTRAINT users_id PRIMARY KEY (id)
   )
   
   
   DROP TABLE users456
   
   
   CREATE TABLE [Customer]
(  
    [Customerid] INTEGER NOT NULL,
    [FirstName] NVARCHAR(40) NOT NULL,
    [LastName] NVARCHAR(20) NOT NULL,
    [Company] NVARCHAR(80),
    [Address] NVARCHAR(70),
    [City] NVARCHAR(40),
    [State] NVARCHAR(40),
    [Country] NVARCHAR(40),
    [PostalCode] NVARCHAR(10),
    [Photo] NVARCHAR(24),
    [Fax] NVARCHAR(24),
    [Email] NVARCHAR(60)NOT NULL,
    [SupportRepId] INTEGER,
  CONSTRAINT [PK_Customer] PRIMARY KEY ([Customerid]),
  FOREIGN KEY ([SupportRepId]) REFERENCES [Employee]([EmployeeId])
      ON DELETE NO ACTION ON UPDATE NO ACTION
);

SELECT * FROM Customer WHERE CustomerId = 1


SELECT CustomerId ,FirstName , LastName ,Fax  FROM Customer c 


SELECT CustomerId, LastName , FirstName  FROM Customer c 


SELECT LastName ,LastName ,LastName ,LastName  FROM Customer c 



SELECT * FROM Customer c  WHERE CustomerId 


SELECT* FROM Customer c 





SELECT Email ,Email ,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email,Email  FROM Customer c 





SELECT * FROM Customer c WHERE FirstName ="Mark"





SELECT  * FROM Customer c  WHERE FirstName ='Daan' 




SELECT *FROM Customer c WHERE Company IS NOT NULL


SELECT *FROM Customer c WHERE Company IS  NULL



SELECT * FROM Customer c  WHERE City IS NOT NULL

SELECT * FROM Customer c  WHERE City IS NULL


SELECT * FROM Customer c WHERE CustomerId >= 50 

SELECT * FROM Customer c WHERE CustomerId != 50 


SELECT * FROM Invoice i ORDER BY Total ASC 



	
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
  DISTINCT =  ПОЛУЧИТЬ ЧИСЛО УНИКАЛЬНЫХ ЗНАЧЕНИЙ 
  INSERT INTO = ВСТАВЬ В 
  VALUES - ЗНАЧЕНИЙ
  
SELECT CODE, COUNT(*)FROM CODES GROUP BY CODE HAVING COUNT(*)>1
  
  SELECT BillingCity ,COUNT(*) FROM Invoice i GROUP BY BillingCity HAVING COUNT(*)>1
  
  
  SELECT * FROM shop s 
  JOIN products p 
  ON p.ID =s.ProductNameId 
  
  
  ALTER TABLE shop  ADD COLUMN NameChop TEXT;
  

 CREATE TABLE shop( 
 ID INT PRIMARY KEY,
 ProductNameId INT NOT NULL,
 FOREIGN KEY (ProductNameId)  REFERENCES products (ID)
 );

SELECT * FROM shop 

CREATE TABLE products( 
ID INT PRIMARY KEY,
product name ТОВАРА NVARCHAR(50) NOT NULL
);

SELECT * FROM products 



  INSERT INTO GOGO (ID)
  VALUES (5),(89),(77),(58),(56),(55),(54),(52),(51)
  
  UPDATE GOGO SET ID = 4 WHERE ID =2
  
  UPDATE GOGO SET HODE = 'BOBO' WHERE ID  IN (2,3,4,5)
  
  INSERT INTO GOGO(ID,CODE,HODE)
  VALUES (2,1,'DLS'),(2,1,'DLS'),(2,1,'DLS'),(2,1,'DLS'),(2,1,'DLS'),(2,1,'DLS'),(2,1,'DLS')
  
  DROP TABLE GOGO 
  
  SELECT * FROM GOGO
  
  CREATE TABLE GOGO(ID INTEGER,
  CODE INTEGER,
  HODE INVARCHAR)
  
  SELECT * FROM Invoice i 
  
  SELECT * FROM Invoice i 
  
  
  SELECT ,COUNT(GenreId)  FROM Track t GROUP BY GenreId HAVING COUNT(GenreId) >1
  
  
  
  CREATE TABLE CODES(
  ID INTEGER NOT NULL,
  CODE NVARCHAR (50) NOT NULL
 )
 
 SELECT COUNT(*) FROM CODES GROUP BY CODE HAVING COUNT(*)>1
 
 SELECT * FROM CODES 
 
 INSERT INTO CODES (ID,CODE) VALUES (1,34566),(2,34566),(3,3456),(4,3456),(5,34566),(6,3566),(7,3566),(8,4566),(9,4566),(10,4566),(11,34566),(12,34566),(13,34566),(14,34566),(15,34566),(16,34566),(17,345),(18,345),(19,34566)
  
  
  SELECT * FROM CODE WHERE 
  
  select 8 from 
  
  SELECT * FROM Customer c 
  
  SELECT*FROM Customer c 
  JOIN Invoice i 
  ON I.CustomerId = C.CustomerId 

  
  SELECT SUM(TOTAL),COUNT(SupportRepId) FROM Customer c 
  JOIN Invoice i 
  ON I.CustomerId = C.CustomerId 
  GROUP BY SupportRepId 
  
 SELECT COUNT(SupportRepId) FROM Customer c GROUP BY SupportRepId 
  
  SELECT * FROM Customer c GROUP BY Country 
  
  SELECT FirstName, LastName  FROM Customer c WHERE CustomerId =(SELECT CustomerId  FROM Customer c WHERE FirstName = 'Luís')
  
  SELECT CustomerId  FROM Customer c WHERE FirstName = 'Luís'
  
  
  SELECT Total AS ПОКУПКИ FROM Invoice i LIMIT 5
  
  UPDATE Invoice  SET BillingAddress = 'JOJO' WHERE BillingCity ='MAMBA'
  
  
  UPDATE Invoice SET BillingCity ='MAMBA' WHERE CustomerId =3
   
  SELECT * FROM Invoice i WHERE BillingCity ='MAMBA'
  
  UPDATE 
  
  DELETE FROM Employee WHERE EmployeeId BETWEEN 9 AND 13
  
  DELETE FROM Employee WHERE EmployeeId BETWEEN 14 AND 18
  
  SELECT * FROM Employee e 
  
  INSERT INTO Employee (EmployeeId,LastName,FirstName)
  VALUES
  (15,'BOB','BOBO'),
  (16,'BOB','BOBO'),
  (17,'BOB','BOBO'),
  (18,'BOB','BOBO')
  
  
  SELECT AVG(UnitPrice) FROM Track t 
  
  SELECT SUM(UnitPrice) FROM Track t 
  
  SELECT MAX(UnitPrice) FROM Track t 
  
  SELECT MIN(UnitPrice) FROM Track t 
  
  SELECT MAX(UnitPrice) FROM Track t 
  
 
  SELECT * FROM  Track t 
  
  SELECT  COUNT (DISTINCT(BillingCity))  FROM Invoice i 
  
  
  
  SELECT * FROM Invoice i  WHERE BillingAddress IN ('Ullevålsveien 14', 'Theodor-Heuss-Straße 34', '8210 111 ST NW')
  
 
  SELECT * FROM Invoice i WHERE InvoiceId  IN (1,2,3,4,5,6)
  
  
  
  SELECT * FROM Invoice i WHERE BillingAddress ='Theodor-Heuss-Straße 34' AND InvoiceId  = 1
  
  
  SELECT * FROM Invoice i  WHERE BillingCity ='Stuttgart' OR'Brussels'
  
  
  SELECT * FROM Invoice i WHERE BillingAddress LIKE 'A%'
  
  
  SELECT * FROM Invoice i WHERE InvoiceId BETWEEN 1 AND 15 ORDER BY InvoiceId DESC
  
  
  SELECT* FROM Invoice i  ORDER BY InvoiceDate 
  
  
  SELECT * FROM Invoice i WHERE 
  
  
  SELECT* FROM Invoice i WHERE InvoiceId =3
  
  
  
  DROP TABLE YIYIY 
  
  SELECT * FROM YIYIY 
  
  CREATE TABLE YIYIY (
  ID INTEGER NOT NULL
  )
  
  
  select* from Invoice i 

  SELECT* FROM Invoice i WHERE 
  
  SELECT InvoiceId, BillingCity  FROM Invoice 
  UNION
  SELECT EmployeeId, LastName  FROM Employee e 
  
  
  SELECT InvoiceDate, COUNT(Total) FROM Invoice i GROUP BY InvoiceDate 
  HAVING COUNT(*)>1
  
  
  SELECT FirstName, COUNT(*) FROM Customer c GROUP BY FirstName 
HAVING  COUNT(*) > 1
  
  SELECT InvoiceDate, COUNT(Total) FROM Invoice i GROUP BY InvoiceDate 
 
  SELECT BillingState, COUNT (Total)  FROM Invoice i GROUP BY BillingState  
  
  SELECT BillingPostalCode,COUNT(Total)  FROM Invoice i GROUP BY BillingPostalCode 
  
  SELECT BillingCity, COUNT(Total) FROM Invoice i GROUP BY BillingCity 
  
  SELECT * FROM Invoice i GROUP BY BillingCountry 
  
  SELECT * FROM Invoice i GROUP BY BillingCity 
  
  SELECT BillingAddress, BillingState FROM (SELECT * FROM Invoice i) 
  
  SELECT * FROM Invoice i LIMIT 5
  
  SELECT InvoiceId AS ИД, InvoiceDate AS ДАТА, BillingAddress AS АДРЕС  FROM Invoice i 

  SELECT * FROM Invoice i  WHERE BillingAddress ='SANTIYAGO'
  
  UPDATE Invoice SET BillingAddress = 'SANTIYAGO' WHERE InvoiceDate = '2009-07-20 00:00:00'
  
  UPDATE Invoice SET BillingAddress ='MAGADAN' WHERE BillingAddress = 'TADJIKISTAN'
  
  UPDATE Invoice SET BillingAddress = 'TADJIKISTAN'
  
  DELETE FROM Customer WHERE CustomerId = 69
  
  DELETE FROM Customer WHERE CustomerId = 70
  
  SELECT * FROM Customer c 
  
  INSERT INTO Customer (CustomerId,FirstName,LastName, Email) VALUES (70,'BOB','FINKLI','PACHA@MAIL.RU')
  
  SELECT COUNT (DISTINCT(BillingAddress)) FROM Invoice i 
  
  SELECT DISTINCT (BillingAddress) FROM Invoice i 
  
  SELECT AVG(Total) FROM Invoice i 
  
  SELECT SUM(Total) FROM Invoice i 
  
  SELECT MIN(Total)  FROM Invoice i 
  
  SELECT MAX(Total) FROM Invoice i 
  
  SELECT COUNT(*) FROM Invoice i 
  
  SELECT * FROM Customer c WHERE LastName LIKE ('%a') OR FirstName LIKE ('%a')
  
  SELECT * FROM Customer c WHERE LastName LIKE ('%a') AND FirstName LIKE ('%a')
  
  SELECT * FROM Customer c WHERE LastName LIKE ('%a%')
  
  SELECT InvoiceId, Total  
  FROM Invoice i WHERE CustomerId = 7
  ORDER BY Total DESC 
  
  SELECT CustomerId, Country  FROM Customer c WHERE CustomerId BETWEEN 1 AND 25 ORDER BY CustomerId ASC
  
  SELECT * FROM Customer c WHERE CustomerId IN (13,24,46) 
  
  SELECT * FROM Customer c WHERE Country IS NULL
  
  SELECT * FROM Customer WHERE Company IS NOT NULL 
  
  SELECT * FROM Customer c ORDER BY FirstName DESC  
  
  SELECT * FROM Customer c ORDER BY FirstName ASC
  
  SELECT * FROM Customer ORDER BY LastName 
  
  DROP TABLE WERWEW
  
  SELECT * FROM WERWEW 
  
  
  CREATE TABLE WERWEW (
  ID INTEGER 
  )
  
  SELECT* FROM Customer c WHERE CustomerId = 34
  
  SELECT * FROM Customer c 
  
  SELECT * FROM Customer WHERE FirstName =('BOYS') 
  
  UPDATE Customer SET FirstName = ('BOYS') WHERE FirstName = ('Kara')
  
  
  UPDATE Employee SET ReportsTo = NULL WHERE LastName = ('BOYS') 
  
  
  UPDATE Employee SET LastName = ('BOYS') WHERE EmployeeId =3 
    
  DELETE FROM Employee WHERE EmployeeId BETWEEN 9 AND 13
  
  
  SELECT*FROM Employee 
    
  
    
    INSERT INTO Employee (EmployeeId,LastName,FirstName) 
    VALUES 
    (9,'BOYS','BOYS'),
    (10,'BOYS','BOYS'),
    (11,'BOYS','BOYS'),
    (12,'BOYS','BOYS'),
    (13,'BOYS','BOYS')
  
  
    
    INSERT INTO Invoice(InvoiceId, CustomerId, InvoiceDate) 
    VALUES (413,5000, '2007-01-01 00:00:00')
  
  
  
  SELECT DISTINCT  (COUNT (InvoiceId)) FROM Invoice i 
  
  SELECT AVG( TOTAL) FROM Invoice i 
  
  SELECT SUM(Total) FROM Invoice i 
  
  SELECT MIN(TOTAL) FROM Invoice i 
  
 SELECT MAX(TOTAL) FROM Invoice i 
  
  SELECT COUNT (InvoiceId) FROM Invoice i 
  
  
  SELECT * FROM Customer c WHERE Country = ('Brazil') OR Email LIKE ('A%') OR Address  LIKE ('B%')
  
  SELECT * FROM Customer WHERE Company IS NOT NULL AND State IS NOT NULL AND Fax IS NOT NULL 

  SELECT * FROM Customer c WHERE Address LIKE ('%J%')
  
  SELECT * FROM Customer c WHERE CustomerId BETWEEN 1 AND 50
  
  SELECT * FROM Customer c WHERE CustomerId IN (5,7,9)
  
  SELECT * FROM Customer c WHERE Company IS NULL
  
  SELECT * FROM Customer c WHERE Company IS NOT NOTNULL 
   
  
  SELECT * FROM Invoice i ORDER BY Total 
  
  DROP TABLE BLABLA
  
  SELECT * FROM BLABLA b 
  
  SELECT* FROM Invoice i ORDER BY InvoiceId  BETWEEN 4 AND 10  
  
  
  
  SELECT COUNT ( DISTINCT  (City)) FROM Customer c 
  
  SELECT  COUNT (FirstName)  FROM Customer c 
  
  SELECT MAX (CustomerId) FROM Customer c 
  
  SELECT MIN (CustomerId) FROM Customer c 
  
  SELECT SUM(Total) FROM Invoice i 
  
  SELECT AVG(Total) FROM Invoice i 
  
  
  SELECT* FROM Invoice i 
   
  SELECT * FROM Customer c 
  WHERE CustomerId = 4 
  OR CustomerId =5 
  OR CustomerId =7
  
  
  SELECT * FROM Customer c WHERE CITY LIKE ('O%') AND State IS NOT NULL
  
  SELECT* FROM Customer c WHERE FirstName LIKE ('%E%')
  
  
  SELECT* FROM Customer c WHERE CustomerId BETWEEN 4 AND 45
  
   
  SELECT FirstName, City, Fax FROM Customer c 
  
  SELECT *FROM Customer c WHERE City IN ('Helsinki','London', 'Olso')
  
  
  SELECT * FROM Customer c ORDER BY FirstName ASC 
  
  
  SELECT * FROM Customer c ORDER BY FirstName DESC 
  
  
  SELECT *FROM Customer 
  
  
  SELECT * FROM Invoice i  ORDER BY Total DESC
  
  
  
  SELECT* FROM Customer c ORDER BY FirstName 
  

  
  
  SELECT *FROM Invoice i WHERE CustomerId =7
  

  SELECT InvoiceId, Total  
  FROM Invoice i WHERE CustomerId = 7
  ORDER BY Total DESC 
  
  SELECT * FROM Customer c WHERE CustomerId IN (7,10,12)
  
  
  SELECT*FROM Customer c WHERE City IN(
  'Prague','Vienne','Oslo')
 
  
  SELECT *FROM Customer c 
  WHERE CustomerId 
  BETWEEN 10 AND 15 
  ORDER BY CustomerId DESC
  
  SELECT *FROM Customer c 
  WHERE CustomerId 
  BETWEEN 10 AND 15
  ORDER BY CustomerId ASC
  
  
  SELECT*FROM Customer c 
  WHERE FirstName LIKE 'A%'
  
    SELECT*FROM Customer c 
  WHERE FirstName LIKE '%RA'
  
  
    SELECT*FROM Customer c 
  WHERE FirstName LIKE '%A'
  
  
    SELECT*FROM Customer c 
  WHERE FirstName LIKE '%A%'
  
    SELECT*FROM Customer c 
  WHERE FirstName LIKE 'A%RE'
  
    SELECT*FROM Customer c 
  WHERE FirstName LIKE '%%%%%%%%%'
  
  
  
  SELECT*FROM Customer c 
  WHERE Country = 'Canada'
 
  
  
  SELECT*FROM Customer c 
  WHERE Country = 'Canada' AND State = 'ON'
  
  
  SELECT*FROM Customer c 
  WHERE Country = 'Canada' AND State = 'ON'
  
   
  SELECT*FROM Customer c 
  WHERE Country = 'Canada' AND State = 'ON' AND FirstName = 'Robert'
  
  
  SELECT* FROM Customer c 
  WHERE Country  = 'Canada'
  OR Country = 'Brazil'
  
  
  SELECT * FROM Customer c 
  WHERE State ='ON'
  OR Country ='Brazil'
  
  
  SELECT * FROM Customer c 
  WHERE CustomerId IN (7,10,12)
  
  
  SELECT*FROM Customer c 
  WHERE CustomerId =7
  OR CustomerId =12
  OR CustomerId =10
  
  
  SELECT * FROM Customer c 
  WHERE CustomerId BETWEEN 7 AND 10
  OR CustomerId BETWEEN 12 AND 15
  OR CustomerId BETWEEN 17 AND 19
  

  SELECT * FROM Invoice i 
  
  
  SELECT COUNT(InvoiceId) FROM Invoice i 
  
  
  
  SELECT MAX(Total) FROM Invoice i 
  
  
  
  SELECT MIN (Total) FROM Invoice i 
  
  
  
  SELECT SUM (Total) FROM Invoice i 
  
  
  
  SELECT AVG(Total ) FROM Invoice i 
  
  
  
 SELECT COUNT(InvoiceId) FROM Invoice i WHERE BillingCity = 'Paris'
  
  
  
  SELECT InvoiceId, Total  FROM Invoice i ORDER BY Total DESC
  
  
  SELECT COUNT(*) FROM Artist a 
  
  SELECT ArtistId  FROM Artist a 
  
  
  
  SELECT CustomerId, Country  FROM Customer c 
  
  SELECT COUNT(Country) FROM Customer c  
  
  
  SELECT DISTINCT (Country) FROM Customer c 
  
  
  SELECT* FROM Customer c 
  
  
  SELECT COUNT(DISTINCT(Country))FROM Customer c 
  
  
 CREATE - CREATE
 READ - SELECT
 UPDATE -
 DELETE - 
 

 
 SELECT*FROM Genre g 
 
 
 INSERT INTO Genre 
VALUES (26, 'Tehno')

 


  SELECT* FROM Genre g 
  
  
  INSERT INTO Genre
  VALUES (28,'Kalbas') 
  
  
  
  CREATE TABLE TABLE7(
  ID INTEGER
  NAME TEXT
  )
  
  
  INSERT INTO Genre 
  VALUES
  (29,'TEHNO'),
  (30,'TEHNO'),
  (31,'TEHNO')
  
  
  
  SELECT*FROM Genre g 
  
  
  
  
  INSERT INTO Genre(Genreid)  VALUES (89);
  
 
 select*from Customer c 
 
 INSERT INTO Customer (Customerid,LastName,FirstName,City)
 VALUES 
 
  
  
SELECT * FROM Customer c 


INSERT INTO Customer (FirstName, LastName,Email)
VALUES ('Matt', 'Smith', 'dr@who.uk' )

  
  
 INSERT INTO Customer (FirstName, LastName, Email)
 VALUES ('Rick','Morty', 'ggwp')
 
 
 SELECT*FROM Customer c 
 
 DELETE FROM  Customer 
 
 
 SELECT *FROM Artist a 
 
 DELETE FROM Artist  
 WHERE ArtistId = 275
 
 
 DELETE FROM Artist 
 WHERE ArtistId IN(4,5,6)
 

 DELETE FROM Artist 
 WHERE ArtistId BETWEEN 50 AND 55
 
 
 DELETE FROM Customer 
 WHERE FirstName = ('Matt')
 
  
  
  SELECT*FROM Customer c WHERE FirstName = 'Matt'
  
  
SELECT * FROM Artist 
  
DELETE FROM Artist WHERE ArtistId =280
  
  
  SELECT * FROM Invoice i 
  
  UPDATE Invoice 
  SET BillingAddress = 'Moscow'
  
  UPDATE Invoice SET BillingAddress = 'Moscow'
  WHERE InvoiceId <10
  
  
  UPDATE Invoice SET BillingAddress = 'Paris'
  WHERE InvoiceId =3
  
  
  UPDATE Invoice SET BillingCity = 'TRATATATATA'
  WHERE BillingCity = 'Berlin'
 
  
  UPDATE Invoice SET 
  BillingCountry = 'иГОРЬ',
  BillingCity ='Орел',
  BillingPostalCode = '0231847'
  WHERE InvoiceId =3
  
  
  SELECT * FROM Invoice i WHERE BillingCity = 'TRATATATATA'
  
  
  SELECT CustomerId AS ID , FirstName AS NAME  , LastName AS SURNAME  FROM Customer c 
  
  
  SELECT CustomerId, FirstName, LastName  FROM Customer c 
  
  
  SELECT CustomerId  AS ИД, FirstName as имя, LastName as фамилия FROM Customer c ORDER BY фамилия 
  
  
  SELECT CustomerId  AS ИД, FirstName as имя, LastName as фамилия FROM Customer c ORDER BY фамилия 
  LIMIT 3
  
  
  SELECT InvoiceId ,BillingAddress ,InvoiceDate  
  FROM Invoice i 
  LIMIT 5
  
  
  SELECT * FROM Album a 
  LIMIT 50
  
  SELECT* FROM Invoice i
  
  
 SELECT FirstName, LastName  FROM (SELECT * FROM Customer c WHERE CustomerId < 10)
  
 
 
  SELECT * FROM Genre g WHERE Name = 'Jazz'
  

  SELECT GenreId  FROM Genre g WHERE Name = 'Jazz' 
  
  
  SELECT * FROM Track t WHERE GenreId = 2 
  
  
  SELECT * FROM Track t WHERE GenreId =   (SELECT GenreId  FROM Genre g WHERE Name = 'Jazz') 
    
    
  SELECT * FROM Track t WHERE GenreId =   
 (SELECT GenreId  FROM Genre g WHERE Name = 'Jazz')
  
  
  SELECT GenreId  FROM Genre g WHERE Name = 'Rock'
  
  
  SELECT GenreId  FROM Genre g WHERE Name = 'Rock' or Name = 'Jazz'
  
  
  SELECT GenreId  FROM Genre g WHERE Name IN ('Rock', 'Jazz')
  
  
  
  SELECT * FROM Track t WHERE GenreId =  (SELECT GenreId FROM Genre g WHERE Name ='Rock' or Name = 'Jazz')
  
  
  SELECT * FROM Track t WHERE GenreId IN (1,2)
  
  
  SELECT AVG(Total) FROM Invoice i 
  
  
  SELECT * FROM Invoice i WHERE Total >(SELECT AVG(Total) FROM Invoice i )
  
  
  SELECT * FROM Invoice i WHERE Total >5.651941747572825
  
  
 SELECT *FROM Customer c 
 
 SELECT DISTINCT (Country)FROM Customer
 
 SELECT DISTINCT (Country) FROM Customer c 
  
 SELECT * FROM Customer GROUP BY Country
 
 SELECT Country, COUNT(*)  FROM Customer c GROUP BY Country 
  
  SELECT COUNT(*)  FROM Customer c GROUP BY Country 
  
  SELECT BillingCountry ,COUNT(*)FROM Invoice i GROUP BY BillingCountry 
  
 SELECT *FROM Customer c WHERE Country IS  NULL 
 
 SELECT BillingCountry, SUM(Total)   FROM Invoice i GROUP BY BillingCountry 
 
 SELECT * FROM Invoice i 
 

 
 SELECT BillingCountry , SUM (Total) FROM Invoice i GROUP BY BillingCountry 
 
 
 
SELECT FirstName, COUNT(CustomerId) FROM Customer c GROUP BY FirstName 
 

SELECT * FROM Customer c WHERE FirstName IN ('Frank','Mark')


SELECT FirstName, COUNT(*) AS NUM FROM Customer c GROUP BY FirstName 
HAVING  NUM > 1


SELECT FirstName, COUNT(*) FROM Customer c GROUP BY FirstName 
HAVING  COUNT(*) > 1


SELECT GenreId,Name  FROM Genre g 
UNION
SELECT ArtistId ,Name  FROM Artist a  


SELECT GenreId,Name  FROM Genre g 
UNION
SELECT ArtistId ,Name  FROM Artist a 


SELECT GenreId ,Name  FROM Genre g 
UNION
SELECT TrackId,Name FROM Track t 


SELECT PlaylistID,COUNT(TrackId) FROM PlaylistTrack pt GROUP BY PlaylistId  




SELECT * FROM PlaylistTrack pt WHERE PlaylistId = 16


SELECT * FROM Track t 




SELECT TrackId, Name , GenreId  FROM Track t 




SELECT GenreId , NAME FROM Genre g 


CREATE TABLE "USER"(
id INTEGER NOT NULL, 
first_name NVARCHAR(50) NOT NULL,
last_name NVARCHAR(50) NOT NULL,
middle_name  NVARCHAR(50) NOT NULL,
email NVARCHAR(256) NOT NULL
)



INSERT INTO 



SELECT * FROM "USER"



SELECT * FROM Invoice i WHERE BillingAddress LIKE "A%"


SELECT * FROM 

CREATE TABLE RENI(
ID INTEGER (90),
first_name NVARCHAR (200),
last_name NVARCHAR (299)
)

SELECT * FROM RENI 

               
INSERT INTO RENI (ID, first_name, last_name)
VALUES (6,'BOB', 'JOJO')

              
INSERT INTO RENI (ID, first_name, last_name)
VALUES (2,'BOB', 'JOJO'),(3,'BOB', 'JOJO'),(4,'BOB', 'JOJO'),(5,'BOB', 'JOJO')
              
 SELECT Name  FROM Genre g WHERE  GenreId = 3
 
 
 
SELECT * FROM Invoice i ORDER BY CustomerId 

SELECT FirstName ,LastName  FROM Customer ORDER BY CustomerId



SELECT * FROM Customer c WHERE Company IS NOT NULL ORDER BY Address DESC



SELECT * FROM Customer c WHERE Company IS NULL ORDER BY Address ASC



SELECT * FROM Customer c WHERE Company IN ('Embraer - Empresa Brasileira de Aeronáutica S.A.','JetBrains s.r.o.','Woodstock Discos')



SELECT* FROM Customer c WHERE  CustomerId IN (0,1,3,5,7,8)



SELECT * FROM Invoice i WHERE CustomerId BETWEEN 1 AND 43



SELECT * FROM Invoice i WHERE CustomerId = 3 OR CustomerId = 4  OR BillingAddress = 'Barbarossastraße 19'



SELECT * FROM Invoice i WHERE CustomerId = 4 AND BillingAddress = 'Ullevålsveien 14'



SELECT COUNT(InvoiceId) FROM Invoice i 


SELECT MAX(Total) FROM Invoice i


SELECT MIN(Total) FROM Invoice i 


SELECT AVG(Total) FROM Invoice i


SELECT SUM(Total) FROM Invoice i


SELECT COUNT (DISTINCT(BillingCity)) FROM Invoice i 


SELECT COUNT (BillingCity) FROM Invoice i 

SELECT * FROM Invoice i 

SELECT* FROM Customer c 


INSERT INTO Customer (Customerid, FirstName, LastName, Email) 
VALUES (60,'LORD','FORD','LORD@MAIL.RU')


DELETE FROM Customer WHERE CustomerId = 60


UPDATE Customer SET FirstName = 'FURD' WHERE CustomerId = 60


SELECT * FROM Customer c LIMIT 5


SELECT FirstName ,LastName  FROM (SELECT * FROM Customer ) 


SELECT * FROM Customer c GROUP BY Country 

select * from Invoice i 


SELECT COUNT (DISTINCT (Country)) FROM Customer c 


SELECT  total, COUNT (Total) FROM Invoice i  GROUP BY Total  


SELECT Total  ,BillingCity,COUNT(BillingCity) FROM Invoice i  GROUP BY Total 


SELECT Total  ,BillingCountry, BillingCity  ,COUNT(BillingCity) FROM Invoice i  GROUP BY Total

SELECT *FROM Invoice i GROUP BY Total HAVING Total >20

SELECT Total  ,BillingCountry, BillingCity  ,COUNT(BillingCity) 
FROM Invoice i  GROUP BY Total HAVING TOTAL >20


SELECT * FROM Track t 


SELECT * FROM Genre g  


SELECT t.TrackId ,t.Name, g.Name FROM Track t  
JOIN Genre g
ON t.GenreId = g.GenreId



SELECT t.TrackId ,
t.Name as название_песни,
g.Name as название_жанра 
FROM Track t  
JOIN Genre g
ON t.GenreId = g.GenreId


SELECT* FROM Track t 
JOIN Genre g 
ON G.GenreId = T.GenreId 


SELECT TrackId ,
track.Name ,
Genre.Name ,
UnitPrice  
FROM Track 
JOIN Genre  
ON Track.GenreId =Genre.GenreId 





SELECT t.TrackId ,
t.Name as название_песни,
g.Name as название_жанра 
FROM Track t  
JOIN Genre g
ON t.GenreId = g.GenreId
GROUP BY название_жанра






SELECT t.TrackId ,t.Name, g.Name FROM Track t  
JOIN Genre g
ON t.GenreId = g.GenreId
GROUP BY T.GenreId

SELECT g.Name , COUNT(*) FROM Track t 
JOIN Genre g 
ON t.GenreId = g.GenreId
GROUP BY t.GenreId


SELECT COUNT(*) FROM Track t 
WHERE GenreId = 
(SELECT GenreId FROM Genre WHERE NAME = 'Latin')




SELECT COUNT(*) FROM Track t 
group by GenreId 




SELECT * FROM Track t 


SELECT * FROM Album a 


SELECT * FROM Genre g 


SELECT* FROM MediaType mt 


SELECT T.TrackId , T.Name, G.Name, A.Title  FROM Track t 
JOIN Album a ON T.AlbumId = A.AlbumId
JOIN Genre g ON T.GenreId = G.GenreId 
JOIN MediaType mt ON T.MediaTypeId = MT.MediaTypeId 



SELECT T.TrackId as id ,
T.Name as "track", 
G.Name as "genre",
A.Title as "album",
mt.Name  as "type"
FROM Track t 
JOIN Album a ON T.AlbumId = A.AlbumId
JOIN Genre g ON T.GenreId = G.GenreId 
JOIN MediaType mt ON T.MediaTypeId = MT.MediaTypeId 


SELECT Name  FROM Genre 
UNION
SELECT GenreId  FROM Customer  

SELECT GenreId, Name  FROM Genre g 
UNION
SELECT TrackId, Name FROM Track t 



SELECT* FROM Customer c 

SELECT * FROM Invoice i 

SELECT * FROM Employee e 


SELECT E.LastName ,E.FirstName, SUM(I.Total)  FROM Customer c 
JOIN Invoice i ON I.CustomerId = C.CustomerId 
JOIN Employee e ON E.EmployeeId = C.SupportRepId 
GROUP BY I.Total

SELECT * FROM Customer c WHERE CustomerId = 49


SELECT C.FirstName, C.LastName , E.EmployeeId ,E.FirstName , E.LastName  FROM Customer c 
JOIN Employee e ON C.SupportRepId = E.EmployeeId 


SELECT 
    I.InvoiceId , I.Total,
    C.CustomerId ,C.FirstName ,C.LastName 
FROM Invoice I
JOIN Customer C 
ON C.CustomerId = C.CustomerId 

SELECT* FROM Invoice i 

SELECT * FROM Customer c 


SELECT
    I.InvoiceId , I.Total, 
    C.CustomerId ,C.FirstName ,C.LastName, 
    E.EmployeeId ,E.FirstName ,E.LastName
FROM Invoice I
JOIN Customer C 
ON C.CustomerId = C.CustomerId
JOIN Employee e 
ON E.EmployeeId =C.SupportRepId 
GROUP BY E.EmployeeId  




SELECT E.EmployeeId, COUNT(I.InvoiceId) 
FROM Invoice I
JOIN Customer C ON I.CustomerId = C.CustomerId
JOIN Employee e ON E.EmployeeId =C.SupportRepId 
GROUP BY E.EmployeeId  





SELECT E.EmployeeId, COUNT(I.InvoiceId) 
FROM Invoice I
JOIN Customer C ON I.CustomerId = C.CustomerId
JOIN Employee e ON E.EmployeeId =C.SupportRepId 
GROUP BY E.EmployeeId  





SELECT E.EmployeeId, COUNT(I.InvoiceId),SUM(I.Total), MAX(I.Total),AVG(I.Total)
FROM Invoice I
JOIN Customer C ON I.CustomerId = C.CustomerId
JOIN Employee e ON E.EmployeeId =C.SupportRepId 
GROUP BY E.EmployeeId 





SELECT 
e1.EmployeeId ,e1.LastName as 'фамилия подчиненного', e1.FirstName as 'имя подчиненного', e1.Title , 
e2.LastName as'имя руководителя' ,e2.FirstName as' фамилия руководителя' ,e2.Title 
FROM Employee e1 
JOIN Employee e2 
ON e1.ReportsTo = e2.EmployeeId  



SELECT Title  FROM Album a 



SELECT * FROM Invoice i 


SELECT Country, COUNT(Country) FROM Customer c GROUP BY Country 


SELECT BillingCountry, SUM(Total)  FROM Invoice i GROUP BY BillingCountry  


SELECT * FROM "user" 

-- получить дату
SELECT now()

-- Добавить пользователя
INSERT INTO "user" (login, "password", display_name) VALUES ('test_login', 'test_pass', 'test_dn')

-- Создаем процедуру добавления пользователя (логин, пароль)
CREATE OR REPLACE procedure add_user(
	username varchar(20), 
	pass varchar(100)
) LANGUAGE SQL
AS $$
	INSERT INTO public."user" (login, "password", display_name)
	VALUES ($1, $2, $1)
$$;

-- Создаем процедуру добавления пользователя (логин, пароль, отображаемое имя)
CREATE OR REPLACE procedure add_user(
	username varchar(20), 
	pass varchar(100),
	display_name varchar(40)
) LANGUAGE SQL
AS $$
	INSERT INTO public."user" (login, "password", display_name)
	VALUES ($1, $2, $3)
$$;

-- примеры использования
CALL add_user('tester', 'testpass') 

CALL add_user('myLogin', 'myPass', 'myDispName') 

-- Задача: реализовать механизм добавления сотрудника только с Id компании
-- Если такой компании нет, создать ее

CREATE UNIQUE INDEX comp_name_idx ON public.company (comp_name)

CREATE OR REPLACE procedure add_emp(first_name varchar(20), last_name varchar(20), phone varchar(15), company_name varchar(100)) 
LANGUAGE plpgsql AS 
$$
	declare 
		compId int;
	begin 
		INSERT INTO company (comp_name) VALUES ($4)
		ON CONFLICT (comp_name) DO nothing;
	
		SELECT id from company where comp_name = $4 INTO compId;
	
		INSERT INTO employee (first_name, last_name, phone, "companyId")
		VALUES ($1, $2, $3, compId);
	
		CALL add_user($1, $4);
	end	
$$;

CALL add_emp('Nat', 'Romanov', '+46473458765', 'Avengers') 

CALL add_emp('Tony', 'Stark', '+4985123443', 'Avengers') 

CALL add_emp('Chris', 'Rogers', '+4985125678', 'Avengers') 

SELECT * FROM employee e 

SELECT * FROM "user" u 

SELECT * FROM company c 



-- Задача ставить поле isActive = false при попытке удаления пользователя
select * from "user" u 

UPDATE "user" 
SET "isActive" = false 
where id = 34

CREATE TRIGGER dlt_usr_trg 
BEFORE DELETE ON public."user"
FOR EACH ROW
EXECUTE PROCEDURE dlt_usr();

CREATE OR REPLACE FUNCTION dlt_usr()
  RETURNS trigger AS '
	BEGIN
  		UPDATE public."user" SET "isActive"=false WHERE id=OLD.id;
  		RETURN NULL;
	END; ' 
language plpgsql;

SELECT * FROM "user"

DELETE FROM "user" WHERE id = 41

UPDATE "user" SET "isActive" = true

			
call add_user('test', 'test')


SELECT * FROM "user"
