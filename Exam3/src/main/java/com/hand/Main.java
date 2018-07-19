package com.hand;

public class Main {

    public static void main(String[] args) {
        RandomDataFactory factory = new RandomDataFactory();

        IRandomData randomData = factory.createRandomData();
        randomData.sort();
        System.out.println(randomData);

        IRandomData streamRandomData = factory.createStreamRandomData();
        streamRandomData.sort();
        System.out.println(streamRandomData);
    }
}
