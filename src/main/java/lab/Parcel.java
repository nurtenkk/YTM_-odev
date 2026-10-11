package lab;

public record Parcel(String label, int grams) {
    public Parcel {
        if (grams <= 0) {
            throw new IllegalArgumentException("Koli ağırlığı pozitif olmalı: " + label);
        }
    }
}