

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(4100);
        
        app.get("/", ctx -> ctx.result("Hello World!"));

        app.get("/dynamicQuery", ctx -> {
            String name = ctx.queryParam("name");
            ctx.result(name);
        });

    }
}
