# Blog Management System - Backend (Java Spring Boot)

## 專案簡介
一個基於 Spring Boot 和 MySQL 的部落格管理系統，提供文章管理、使用者管理、評論管理等功能。
![image](https://github.com/Poplollipop/blog/blob/main/demo.png)

## 技術
- **後端**: Java Spring Boot
- **前端**: Angular
- **數據庫**: MySQL

## 啟動指南
1. 安裝所需依賴：`mvn install`
2. 啟動後端：`mvn spring-boot:run`
3. 啟動前端：進入 `/angular` 目錄，執行 `ng serve`

## 文件結構
```
/src
 ├── main
 │    └── java/com/blog
 │        ├── controller
 │        │    ├── PostController.java
 │        │    └── CommentController.java
 │        ├── entity
 │        │    ├── Post.java
 │        │    └── Comment.java
 │        ├── service
 │        │    ├── PostService.java
 │        │    └── CommentService.java
 │        │   ├── PostServiceImpl.java
 │        │    └── CommentServiceImpl.java
 │        └── repository
 │             ├── PostRepository.java
 │             └── CommentRepository.java


```
## 文件解釋
controller (控制層): 處理 HTTP 請求，定義 RESTful API 端點。

例如：PostController.java, CommentController.java
entity (實體類): 存放與資料庫表對應的 Java 類，用於映射數據庫的數據結構。

例如：Post.java, Comment.java
service (服務層): 封裝業務邏輯，處理來自控制層的請求，並調用資料庫層處理數據。

例如：PostService.java, CommentService.java
repository (資料庫存取層): 使用 Spring Data JPA 提供的 JpaRepository 來處理與數據庫的交互。

例如：PostRepository.java, CommentRepository.java
