package es.djord.katarover;

public class Posicion {
    private int x;

    private int y;

    public Posicion() {
        this.x = 0;
        this.y = 0;
    }

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Posicion incrementarY(int incremento) {
        return new Posicion(this.x, this.y + incremento);
    }

    public Posicion incrementarX(int incremento) {
        return new Posicion(this.x + incremento, this.y);
    }

    public Posicion incrementarX() {
        return new Posicion(++this.x, this.y);
    }

    public Posicion decrementarX() {
        return new Posicion(--this.x, this.y);
    }

    public Posicion incrementarY() {
        return new Posicion(this.x, ++this.y);
    }

    public Posicion decrementarY() {
        return new Posicion(this.x, --this.y);
    }

    @Override
    public boolean equals(Object obj) {
        Posicion posicion = (Posicion) obj;
        if (this.x == posicion.getX() && this.y == posicion.getY()) {
            return true;
        }
        return false;
    }

}
