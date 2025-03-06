package oop.generics;

public class ExGenerics {
    public static void main(String[] args) {
        Whale whale = new Whale();

        ResponseDTO<Whale> ResponseDTO = new ResponseDTO<>();
        ResponseDTO.setMessage("Hello World");
        ResponseDTO.setSeccess(true);
        ResponseDTO.setData(whale);

        Hamo hamo = new Hamo();
        ResponseDTO<Hamo> responseHamo = new ResponseDTO<>();
        responseHamo.setMessage("Hello World");
        responseHamo.setSeccess(true);
        responseHamo.setData(hamo);
    }
}

class ResponseDTO<T> {
    private boolean seccess;
    private String message;
    private T data;

    public boolean isSeccess() {
        return seccess;
    }

    public void setSeccess(boolean seccess) {
        this.seccess = seccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Whale {}
class Hamo {}
class Squirrel {}