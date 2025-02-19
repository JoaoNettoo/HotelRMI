package org.ifpe.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HotelServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            HotelServiceImpl hotel = new HotelServiceImpl();
            Naming.rebind("rmi://localhost:1099/HotelService", hotel);
            System.out.println("HotelServer is ready.");
        } catch (Exception e) {
            System.out.println("HotelServer failed: " + e);
        }
    }
}