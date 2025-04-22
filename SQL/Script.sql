select from where

CREATE TABLE test_1

CREATE TABLE test_2 (
id INTEGER 
) 

CREATE TABLE test_3 (
id BLALBA
) 

create table users (
id integer NOT null, 
first_name nvarchar(50) not null,
lat_name nvarchar(50)  not null,
middle_name nvarchar (50),
email nvarchar (256) not null,
constraint users_id primary key (id)
)

int x = 5;
int y = "Test"; !!!
String s = "Test";
String s1 = "5";

drop table users

create table [Customer]
(
  [Customerid] integer not null,
  [First_name] nvarchar(40) not null,
  [Last_name] nvarchar(20) not null,
  [Company] nvarchar(80),
  [Addreass] nvarchar(70),
  [City] nvarchar(40),
  [Country] nvarchar(40),
  [PostalCode] nvarchar(10),
  [Phone] nvarchar(24),
  [Fax] nvarchar(24),
  [Email] nvarchar(60) not null,
  [SupportRepId] integer,
constraint [PK_Customer] primary key ([CustomerId])
foreign key ([SupportRepId]) references [Employee] ([EmployeeId])
on delete no action on update no action
)

create table test_1
(
 id integer not null,
 name nvarcher(200),
 constraint pk_test primary key (id)
)



SELECT CustomerId from Customer;

Select CustomerId, FirstName, LastName, Email
FROM Customer;

select FirstName, FirstName, FirstName from Customer

select * from Customer 

select * from customer where FirstName = "Mark"

select * from customer where company is not null

select * from customer where city = "Rio de Janeiro"

select * from Customer c  where Company not null

select * from Customer where CustomerId >50

select * from Customer where CustomerId >=50

select * from Customer where CustomerId <=50

select * from Customer where CustomerId =50

select * from Customer where CustomerId !=50

select from Customer c where 

select * from Invoice order by total 

select * from Invoice order by total ASC

select * from Invoice order by total desc

select * from Customer c order by FirstName 

select * from Customer c order by FirstName desc

select * from Invoice where CustomerID = 7
order by Total ASC

select InvoiceId, Total from Invoice Where CustomerId = 7 
order by Total DESC

select InvoiceId, Total from Invoice where CustomerId = 7 
order by total ASC

select * from Customer where CustomerId = 7
select * from Customer Where CustomerId = 10
select * from Customer Where CustomerId = 12


select * from Customer Where CustomerId IN (7,10,12)

select * from Customer Where City IN ("Prague", "Vienne")

select * from Customer where CustomerId between 10 and 15

select * from Customer where City between "Prague" and "Vienne"

select * from Customer where CustomerId between 15 and 10

select * from Customer where customerId between 10 and 15

select* from Customer 
Where FirstName like "A%"

select * from Customer
Where FirstName like "%A"

select * from Customer
Where FirstName like "%A%"

select * from Customer
Where FirstName like "%A%re"

select * from Customer
Where FirstName like "%"

select * from Customer
Where FirstName like "%ma"

select * from Customer  
where Country = "Canada" and State = "ON" and FirstName = "Robert"

select * from customer
where Country = "Canada"
OR Country = "brazil"
OR Country = "Germany"

select * from Customer 
where CustomerId in (7,10,12)

select from Customer 
where CustomerId between 7 and 10
or CustomerId between 12 and 15
or CustomerId between 17 and 19

select * from Invoice i 
select count(InvoiceId) from Invoice 

select count(*) from Invoice 

select max(total) from Invoice

select MIN(total) from invoice

select SUM(Total) from Invoice

select avg(total) from Invoice

select count(*) from Invoice where BillingCity = "Paris"

select avg(total) from Invoice where BillingCity = "Paris"

2 урок 

select * from Employee

select EmployeeId, Title  from Employee e where EmployeeId != 4 
order by Title DESC

SELECT count(*) FROM PlaylistTrack

select * from PlaylistTrack

select * from Customer c where c.CustomerId  In (4,5,6,7,8)

select count(customerId) from Customer c 

select CustomerId, Country from Customer c  

select count (Country) from Customer c  

DISTINCT - убрать дубликаты

select distinct (FirstName) from Customer

select DISTINCT  (Country) from Customer 

select distinct (Firstname) from Customer

select count (distinct (Country )) from Customer

select count (distinct (Country)) from Customer c

create -
read - select
update -
delete -

select * from Genre 

insert into Genre 
values (26,"Techno")

insert into Genre 
values( 31,"muz")


select * from NewTable nt


insert into Genre values (32, "test")

insert into NewTable values (1, "bob","marli")

delete from Customer 

delete from Customer where CustomerId = 1

select* from customer

delete from artist 
where artistId = 2

delete from Artist 
where artistId in (4,5,6)

select * from artist


insert INTO NewTable values (12,"asdasdad", "asdasd")

delete from artist where artistId =3

insert into NewTable(id, l_name)
values (14,"23324")

select * from NewTable

select *from artist where ArtistId in (1,2,3,4,5,6,7,8)

insert into Newtable (l_name, f_name)
values ("asdfasdf","asdfasdfasdf")

select* from NewTable

SELECT *FROM  NewTable

INSERT INTO NewTable (f_name)
VALUES ("adjklfgr")

INSERT INTO NewTable (l_name)
VALUES ("sdf")

SELECT * FROM NewTable


insert into Customer (FirstName, LastName, Email)
values ("Test","Test","test")


select * from Customer c 

select * from Track t 

select * from Newtable

delete from Newtable where id < 17

delete * from NewTable

select * from Artist

delete from Artist where artistId = 275 

delete from Artist where ArtistId between 10 and 15
 
select * from Artist

delete from Artist where ArtistId = 280


insert into
delete from


select * from Customer 

select * from invoice 

update Invoice 
set BillingAddress = "Moscow"

update Invoice set BillingAddress = "Berlin"
where InvoiceId >10

update Invoice set Billingaddress = "Игорь" 
where InvoiceID = 3

update Invoice set
BillingAddress = "Валера",
BillingCity = "Орел",
BillingPostalCode = "0876786"
Where InvoiceId = 2

select * from Invoice i 

select * from Invoice 
Where i.

select CustomerId, FirstName, LastName From Customer 

select CustomerId as id, FirstName as name, LastName as Surname From Customer 

select * from Customer 

select CustomerId as Ид, FirstName as Имя, LastName as Фамилия From Customer 

select CustomerId as ID, FirstName as Имя, LastName as Фамилия 
from Customer c order by Фамилия  desc  

select * from Invoice i 
order by total desc 
limit 100

select * from Customer c Where Customerid < 10

select FirstName, LastName from (select * from Customer c Where Customerid < 10)

select GenreId from Genre where Name = "Jazz"

select * from track where GenreId = (select GenreId from Genre where Name = "Jazz")

select * from track where GenreId = 
(select GenreId from genre where name = "Rock" )

select GenreId from genre where name = "Rock" or name = "Jazz"

select genreId from genre where name in ("Rock","Jazz")

select * from track where GenreId =
(select genreId from genre where name in ("Rock","Jazz"))

select invoiceId, Total from invoice

select avg(total) from Invoice i 

select from Invoice 

select * from Invoice where total > 5.651941747572815

select * from Invoice where total > 
(select avg(total) from Invoice i )

select customerid, firstname from Customer 

select * from customer group by country

select distinct (Country) from customer

select country from Customer group by country 

select Country , count (*) from Customer Group by Country

select BillingCountry, sum(Total)  from invoice group by BillingCountry 

SELECT BillingCountry ,sum(total)  from invoice group by BillingCountry 

SELECT BillingCountry ,max(total)  from invoice group by BillingCountry 

select * from Invoice i where BillingCountry = "Czech Republic" 

select count(distinct(FirstName)) from customer 

select firstname, count(customerId) from customer group by Firstname

select * from Customer where FirstName in ("Frank","Mark")

select firstname, count(*) from customer group by Firstname

select firstname, count(*) from customer group by Firstname 
order by count(*) DESC 

select firstname, count(*) as num from customer group by Firstname 
order by count(*) DESC 

select firstname, count(*) as num from customer group by Firstname 
where num > 1

select count(*), GenreId from Track group by genreId

select max(total), CustomerId from invoice group by CustomerId

select sum(Total), CustomerId from invoice group by CustomerId

select firstname, count(*) as num from customer group by Firstname 
having num > 1

select firstname, count(*) as num from customer group by Firstname 
having count(*) > 1

select firstname, count(*) from customer group by FirstName 
having count (*) > 1

select GenreId, Name from Genre g
union
select ArtistId, Name from Artist

select * from PlaylistTrack 

select * from Track t 

select playlistId, count(TrackId)
from PlaylistTrack group by PlaylistId  

select * from PlaylistTrack pt 

select * from Track t 

select TrackId, Name, GenreId  from Track t 

select genreId, Name  from Genre g

SELECT track.TrackId, Track.Name, Track.GenreId, Genre.GenreId, genre.Name  from Track
join genre 
on Genre.GenreId  = Track.GenreId 

SELECT track.TrackId as id, Track.Name as track, genre.Name as genre from Track
join genre 
on Genre.GenreId  = Track.GenreId 

select t.TrackId, t.Name, g.Name,t.UnitPrice  from Track t
join Genre g 
on g.GenreId = t.GenreId

select *from track t
join Genre g
on g.GenreId = t.GenreId

select trackId, Track.Name, Genre.Name,track.GenreId, Genre.GenreId, UnitPrice from track
join genre 
on genre.genreid = track.GenreId

select TrackId, Track.Name, Genre.Name from Track  
join genre 
on Track.GenreId = Genre.GenreId
Group BY Track.GenreId

select Genre.name, count(*) from Track  
join genre 
on Track.GenreId = Genre.GenreId
Group BY Track.GenreId

select * from track

select 
track.TrackId as "id", 
Track.name as "track",
Genre.Name as "genre",
Album.Title as "album",
MediaType.Name as "type"
from Track 
join Genre on Track.GenreId = Genre.GenreId
join Album on Track.AlbumId = Album.AlbumId
join MediaType on Track.MediaTypeId = MediaType.MediaTypeId

select * from Track t 

select * from Employee e 

select * from Invoice i 

select * from Customer c 

select 
Customer.FirstName ,Customer.LastName ,customer.CustomerId,
Employee.EmployeeId, Employee.FirstName, Employee.LastName
from customer
join Employee on Employee.EmployeeId = Customer.SupportRepId
join Invoice on Invoice.CustomerId = Customer.CustomerId


select
i.InvoiceId , i.Total, 
c.CustomerId, c.FirstName, c.LastName
from Invoice i
join customer c on i.CustomerId = c.CustomerId

SELECT 
i.InvoiceId, i.Total,
c.CustomerId , c.FirstName as custFrirstname, c.LastName as custLastName,
e.EmployeeId , e.FirstName as empFirstName, e.LastName as empLastName
from invoice i
join customer c on i.CustomerId =c.CustomerId
join Employee e on e.EmployeeId = c.SupportRepId


SELECT 
i.Total,
c.FirstName as custFrirstname, c.LastName as custLastName,
e.FirstName as empFirstName, e.LastName as empLastName
from invoice i
join customer c on i.CustomerId =c.CustomerId
join Employee e on e.EmployeeId = c.SupportRepId

SELECT 
i.InvoiceId, i.Total,
c.CustomerId , c.FirstName as custFrirstname, c.LastName as custLastName,
e.EmployeeId , e.FirstName as empFirstName, e.LastName as empLastName
from invoice i
join customer c on i.CustomerId =c.CustomerId
join Employee e on e.EmployeeId = c.SupportRepId
group by e.EmployeeId

SELECT 
      e.EmployeeId,e.FirstName, e.LastName, count(i.InvoiceId), sum(i.total), max(i.Total), avg(i.Total)
from invoice i
join customer c on i.CustomerId =c.CustomerId
join Employee e on e.EmployeeId = c.SupportRepId
group by e.EmployeeId

SELECT * from Employee e

select 
      e1.EmployeeId, e1.LastName as "Фамилия подчиненного", e1.FirstName as "имя подчиненного", 
      e2.LastName as "Фамилия руководителя", e2.FirstName as "Имя руководителя"  
from Employee e1 
join Employee e2
on e2.ReportsTo  = e1.EmployeeId 

select 
      e1.EmployeeId, e1.LastName as "Фамилия подчиненного", e1.FirstName as "имя подчиненного", 
      e2.LastName as "Фамилия руководителя", e2.FirstName as "Имя руководителя"  
from Employee e1 
left join Employee e2
on e2.ReportsTo  = e1.EmployeeId 

select 
      e1.EmployeeId, e1.LastName as "Фамилия подчиненного", e1.FirstName as "имя подчиненного", 
      e2.LastName as "Фамилия руководителя", e2.FirstName as "Имя руководителя"  
from Employee e1 
right join Employee e2
on e2.ReportsTo  = e1.EmployeeId 







