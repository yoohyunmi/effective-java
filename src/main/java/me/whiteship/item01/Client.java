package main.java.me.whiteship.item01;

import java.util.concurrent.CancellationException;

public class Client {
    
    public static void main(String[] args) {

        // 한개의 instance를 세 개의 팩토리가 공유해서 사용함으로써 메모리를 줄임
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h',  "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e',  "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l',  "white", fontFactory.getFont("nanum:12"));
    }
}
