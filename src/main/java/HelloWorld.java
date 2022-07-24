import org.springframework.stereotype.Component;


class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld been is created");
    }

    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
}