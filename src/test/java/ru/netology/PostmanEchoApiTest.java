package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoApiTest {
    @Test
    void workPost() {
        String text = "Hallo";
        given()
                .baseUri("https://postman-echo.com")
                .body(text) // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hallo"))
        ;
    }
}
