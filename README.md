
### 📚 BookStore – Java Full Stack Web Application

The "BookStore" is a full stack web application built using "Spring Boot", "Thymeleaf", and "Bootstrap". It allows users to "view available books", "add new books", and "manage a personal book collection".

#### 🔧 Tech Stack:

* "Backend": Spring Boot, Spring MVC, Spring Data JPA
* "Frontend": HTML, CSS, Bootstrap, Thymeleaf
* "Database": MySQL
* "Build Tool": Maven

#### 🌟 Features:

* Home page with welcome message and image carousel
* Add a new book to the store
* View all available books
* Add selected books to "My Books" list
* Edit or delete book entries

#### 📁 Project Structure:

* `controller/` – Handles web requests (BookController, MyBookListController)
* `entity/` – Book and MyBookList entities
* `repository/` – JPA Repositories for DB operations
* `service/` – Service layer for business logic
* `templates/` – Thymeleaf HTML pages (home, booklist, register, etc.)
* `static/images/` – Project images
