package es.djord.katarover;

public enum Orientacion {
    N, E, S, O;

    public boolean isEjeY() {
        return (this == this.N || this == this.S);
    }

    public boolean isOrientacionPositiva() {
        if (this == this.N || this == this.E) {
            return true;
        }
        return false;
    }

    public boolean isUtimoOrdinal() {
        return (this.ordinal() == 3);
    }

    public boolean isPrimerOrdinal() {
        return (this.ordinal() == 0);
    }
}
