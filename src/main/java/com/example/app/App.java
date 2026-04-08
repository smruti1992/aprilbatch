package com.example.app;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", exchange -> {
            String html = "<html><body><h1>Hello from Java!</h1>"
                + "<p>Running inside a Docker container</p></body></html>";
            exchange.sendResponseHeaders(200, html.length());
            OutputStream os = exchange.getResponseBody();
            os.write(html.getBytes());
            os.close();
        });
        server.start();
        System.out.println("Server started on port 8080");
    }
}
