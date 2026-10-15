package org.lab;

public record Customer(String name, Address address) {
    public String city() {
        return address.city();
    }//burdan alıyoruz karışıklık çıkmasın diye
}
