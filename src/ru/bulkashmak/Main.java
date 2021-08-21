package ru.bulkashmak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int numberOfBusStops = 10;
        Random random = new Random();

        List<int[]> busStops = new ArrayList<>();
        for (int i=0; i<numberOfBusStops; i++) {
            int enter = random.nextInt(20);
            int[] busStop = {enter, random.nextInt(enter+1)};
            busStops.add(busStop);
        }

        for (int[] bs : busStops) {
            System.out.printf("[%d %d] ", bs[0], bs[1]);
        }

        System.out.println("\n"+
                busStops.stream()
                        .mapToInt(bs -> bs[0] - bs[1])
                        .sum());
    }
}
