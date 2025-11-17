package com.example;

import static spark.Spark.*;

public class HelloApp {
    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res) -> "Your pipeline is alive! ⚙️🤖✨🚀");
    }
}
