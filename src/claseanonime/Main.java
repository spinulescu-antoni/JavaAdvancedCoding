package claseanonime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new Car(20000, CarType.MERCEDES, 2010);
        Car mercedes2 = new Car(35000, CarType.MERCEDES, 2012);

        Car fiat1 = new Car(3500, CarType.FIAT, 2008);
        Car fiat2 = new Car(7000, CarType.FIAT, 2010);

        Car skoda1 = new Car(12000, CarType.SKODA, 2015);
        Car skoda2 = new Car(25000, CarType.SKODA, 2021);


        Dealership dealership = new Dealership();
        System.out.println(dealership.getFinalPrice(mercedes1));
        System.out.println(dealership.getFinalPrice(mercedes2));
        System.out.println("----------");
        System.out.println(dealership.getFinalPrice(fiat1));
        System.out.println(dealership.getFinalPrice(fiat2));
        System.out.println("----------");
        System.out.println(dealership.getFinalPrice(skoda1));
        System.out.println(dealership.getFinalPrice(skoda2));

//        clasa anonima

        Offer clientOffer = new Offer() {

            @Override
            public int getDiscount(Car car) {
                return 10;

            }
        };
        dealership.negociate(mercedes1, clientOffer);
//        apelare metoda negociate cu Car si Offer , in cazul nostru Car -> mercedes1 si Offer -> clasa anonima
//        clientOffer dealership.negociate(mercedes1, clientOffer)

//        Task4
        List<Car> listaMasini = new ArrayList<>();
        Car mercedes1List = new Car(30000, CarType.MERCEDES, 2019);
        Car mercedes2List = new Car(50000, CarType.MERCEDES, 2021);

        Car fiatLista = new Car(10000, CarType.FIAT, 2018);
        Car skodaLista = new Car(20000, CarType.SKODA, 2019);

        listaMasini.add(mercedes1List);
        listaMasini.add(mercedes2List);
        listaMasini.add(fiatLista);
        listaMasini.add(skodaLista);
        System.out.println("\n");
        System.out.println("Lista masini inainte de modificare:");
        System.out.println(listaMasini);

        System.out.println("Lista masini cu pret > 25000");
        List<Car> masiniPeste25000 = listaMasini.stream()
                .filter(car -> car
                        .getPrice() > 25000)
                .collect(Collectors.toList());
        System.out.println(masiniPeste25000);


        System.out.println("Lista masini dupa modificare");
        listaMasini.removeIf((car) -> car.getPrice() > 25000);
        System.out.println(listaMasini);
    }
}
