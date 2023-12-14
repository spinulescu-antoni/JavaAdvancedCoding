package claseanonime;

import java.time.LocalDate;

public class Dealership {
    private class brandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            switch (car.getType()) {
                case MERCEDES:
                    discount = 5;
                    break;
                case FIAT:
                    discount = 10;
                    break;
                case SKODA:
                    discount = 15;
                    break;
                default:
                    discount = 0;
            }
            return discount;
        }
    }

    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount;
            int vechime = LocalDate.now().getYear() - car.getYear();
            switch (car.getType()) {
                case MERCEDES:
                    discount = 300 * vechime;
                    break;
                case FIAT:
                    discount = 100 * vechime;
                    break;
                case SKODA:
                    discount = 150 * vechime;
                    break;
                default:
                    discount = 0;
            }
            return discount;
        }
    }
    double getFinalPrice(Car car){
        brandOffer brandOffer = new brandOffer();
        int brandOfferDiscount = brandOffer.getDiscount(car);
        double carDiscountBrand = brandOfferDiscount / 100. * car.getPrice();
        System.out.println("A fost aplicata oferta de Brand: " + brandOfferDiscount);
        DealerOffer dealerOffer = new DealerOffer();
        int dealerOfferDiscount = dealerOffer.getDiscount(car);
        car.setPrice(car.getPrice() - carDiscountBrand - dealerOfferDiscount);
        System.out.println("A fost aplicata oferta de la Dealer: " + dealerOfferDiscount);
        return car.getPrice();
    }

    void negociate(Car car, Offer offer){
        int clientDiscount = offer.getDiscount(car);
        car.setPrice(car.getPrice() * (1 - clientDiscount / 100.));
        System.out.println("Clientu a negociat un discount de: " + clientDiscount + "%");
        System.out.println("Pretul dupa oferta negociata de client: " + car.getPrice());
    }
}
