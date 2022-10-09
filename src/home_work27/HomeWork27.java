package home_work27;

public class HomeWork27 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }

}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {
    public void eat(String s) {
        if (!s.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est: " + s);
        } else {
            System.out.println("Tigr est myaso");
        }
    }

    public void drink(String s) throws NeVodaException {
        if (!s.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet: " + s);
        } else {
            System.out.println("Tigr pyet vodu");
        }
    }
}
