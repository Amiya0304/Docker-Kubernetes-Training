import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <title>Welcome</title>\n" +
                        "    <style>\n" +
                        "        body {\n" +
                        "            font-family: Arial, sans-serif;\n" +
                        "            display: flex;\n" +
                        "            justify-content: center;\n" +
                        "            align-items: center;\n" +
                        "            height: 100vh;\n" +
                        "            margin: 0;\n" +
                        "            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n" +
                        "        }\n" +
                        "        .container {\n" +
                        "            text-align: center;\n" +
                        "            background: white;\n" +
                        "            padding: 50px;\n" +
                        "            border-radius: 10px;\n" +
                        "            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);\n" +
                        "        }\n" +
                        "        h1 {\n" +
                        "            color: #333;\n" +
                        "            font-size: 48px;\n" +
                        "            margin: 0;\n" +
                        "            animation: fadeIn 1s ease-in;\n" +
                        "        }\n" +
                        "        @keyframes fadeIn {\n" +
                        "            from { opacity: 0; }\n" +
                        "            to { opacity: 1; }\n" +
                        "        }\n" +
                        "    </style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"container\">\n" +
                        "        <h1>Hello All!! Good day!</h1>\n" +
                        "    </div>\n" +
                        "</body>\n" +
                        "</html>";

                exchange.getResponseHeaders().set("Content-Type", "text/html");
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        server.setExecutor(null);
        server.start();
        System.out.println("Server started on http://localhost:8080");
        System.out.println("Press Ctrl+C to stop the server");
    }
}
