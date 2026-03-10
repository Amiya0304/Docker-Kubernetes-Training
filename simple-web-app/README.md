# Simple Hello World Web Server

A minimal Java web server that displays "Hello All!! Good day!" when accessed via localhost.

## Features
- Pure Java (no frameworks)
- Single file implementation
- Lightweight and fast
- Docker compatible

## Project Structure
```
simple-web-app/
└── src/
    └── HelloServer.java
```

## Running Locally

1. **Compile:**
```bash
cd simple-web-app/src
javac HelloServer.java
```

2. **Run:**
```bash
java HelloServer
```

3. **Access in browser:**
```
http://localhost:8080
```

You should see: **Hello All!! Good day!**

## Docker

1. **Build image:**
```bash
docker build -t hello-app .
```

2. **Run container:**
```bash
docker run -p 8080:8080 hello-app
```

3. **Access:**
```
http://localhost:8080
```

## How it works
- Uses Java's built-in `HttpServer` from `com.sun.net.httpserver`
- Listens on port 8080
- Returns an HTML page with the message
- No external dependencies required
