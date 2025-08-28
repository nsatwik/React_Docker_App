package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AdditionFunction implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        int sum = request.getNumber1() + request.getNumber2();
        return new Response(sum);
    }
}

class Request {
    private int number1;
    private int number2;

    // Getters and Setters
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

class Response {
    private int sum;

    public Response(int sum) {
        this.sum = sum;
    }

    // Getter
    public int getSum() {
        return sum;
    }
}
