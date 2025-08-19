# Foro Hub API

API REST desarrollada con **Spring Boot** que simula el funcionamiento del foro de Alura, permitiendo crear, visualizar, actualizar y eliminar tópicos de discusión.

---

## 🚀 Funcionalidades

- ✅ Crear un nuevo tópico  
- ✅ Listar todos los tópicos  
- ✅ Buscar un tópico por ID  
- ✅ Actualizar un tópico existente  
- ✅ Eliminar un tópico  
- ✅ Validación de datos  
- ✅ Autenticación con Spring Security + JWT  

---

## 🧱 Tecnologías utilizadas

| Herramienta | Uso |
|-------------|---------------------------|
| Java 21     | Lenguaje principal        |
| Spring Boot | Framework base            |
| Spring Web  | Creación de API REST      |
| Spring Data JPA | Persistencia con JPA |
| H2 Database | Base de datos en memoria  |
| Spring Security | Seguridad y autenticación |
| JWT (jjwt)  | Tokens de acceso          |

---

## ▶️ Cómo ejecutar

1. Clona el repositorio  
2. Ejecuta el proyecto desde tu IDE o con:  
3. La API quedará disponible en:  
http://localhost:8081


---

## 🔐 Autenticación

Antes de consumir los endpoints debes iniciar sesión:

**POST /login**

```json
{
"username": "admin",
"password": "admin123"
}

👉 Te devuelve un token JWT.

Luego envíalo en cada petición como header:

Authorization: Bearer <token>

| Método | Ruta          | Descripción     |
| ------ | ------------- | --------------- |
| POST   | /topicos      | Crear un tópico |
| GET    | /topicos      | Listar todos    |
| GET    | /topicos/{id} | Buscar por ID   |
| PUT    | /topicos/{id} | Actualizar      |
| DELETE | /topicos/{id} | Eliminar        |
