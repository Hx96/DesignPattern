package com.example.demo.pattern.responsibility;

import lombok.Builder;
import lombok.Data;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        MyServerRequest request = MyServerRequest.builder().isLogin(true).isPermission(false).build();
        RequestHandler requestHandler = new RequestHandler(new PermissionHandler(null));
        if (requestHandler.process(request)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }

}
@Builder
@Data
class MyServerRequest {
    boolean isLogin;
    boolean isPermission;
}
abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract boolean process(MyServerRequest myServerRequest);
}

class RequestHandler extends Handler {

    public RequestHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(MyServerRequest myServerRequest) {

        if (myServerRequest.isLogin()) {
            if(next != null){
                if (!next.process(myServerRequest)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
class PermissionHandler extends Handler {

    public PermissionHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(MyServerRequest myServerRequest) {
        if (myServerRequest.isPermission()) {
            if(next != null){
                if (!next.process(myServerRequest)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}