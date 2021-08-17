package com.thorinhood;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        //Client client = new Client(12, 14, "Vasya", 100);
        //todo this is ugly!!!! find solution for creating a client
        // with more readable way

        Client client = Client.builder()
                .name("Vasya")
                .debt(12)
                .salary(100)
                .bonus(10)
                .build();
        System.out.println(client);

    }
}

