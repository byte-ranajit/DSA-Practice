package org.example.generic;

public class Singletone {

    private Singletone() {}

    private static class Holder {
        private static final Singletone INSTANCE = new Singletone();
    }

    public static Singletone getInstance() {
        return Holder.INSTANCE;
    }

}


class drive{
    public static void main(String[] args) {
        Object obj = Singletone.getInstance().toString();

        System.out.println(obj);
    }
}