package com.example;

import static spark.Spark.*;

public class HelloApp {
    public static void main(String[] args) {
        port(9090);
        ipAddress("0.0.0.0");  // Allow external traffic
        get("/hello", (req, res) -> "Your pipeline is alive! ⚙️🤖✨🚀");
    }
}
