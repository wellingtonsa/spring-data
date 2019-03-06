# Example API Restful spring-boot and spring-data (SchoolSpring)

## Tutorial

### Use this baseURL
```
http://localhost:8080/api/
```

## [STUDENT]

### Get all students 
```baseURL/student```

#### Request 
- Type: GET

#### Response
- Type: JSON
> (200) Array students

#### Error
> none (if not exists students in database) </br>

### Save student in database 
```baseURL/student```

#### Request
- Type: POST
```
{
  "id": 1, 
  "name": "Joao", 
  "email": "joao@email.com", 
  "class": "class_1"
}
```

#### Response
- Type: JSON
> (200) student object

#### Error
> (409) if exists student </br>
> (401) if invalid data

### Get student by id
```baseURL/student/{id}```

#### Request
- Type: GET
> params id

#### Response
- Type: JSON
> (200) student object

#### Error
> (404) if student not found </br>

### Delete student by id
```baseURL/student/{id}```

#### Request
- Type: DELETE
> params id

#### Response
- Type: JSON
> none

#### Error
> (404) if student not found </br>

### Edit student by id
```baseURL/student/{id}```

#### Request
- Type: PUT
```
{
  "name": "Maria", 
  "email": "maria@email.com", 
  "class": "class_2"
}
```
> params id

#### Response
- Type: JSON
> (200) student object

#### Error
> (404) if student not found </br>

### Get student by name
```baseURL/student/?name=```

#### Request
- Type: GET
> params name

#### Response
Type: JSON
> (200) Array students

#### Error
> (404) if student not found </br>



## [TEACHER]


## [LOGIN]

### Autenticate teacher
```baseURL/login```

#### Request
- Type: POST
```
{
  login: "teacher",
  password: "123"
}
```

#### Response
- Type: JSON
> (200) teacher DTO

#### Error
> (404) if student not found </br>
> (401) if invalid login </br>
> (401) if invalid password 

