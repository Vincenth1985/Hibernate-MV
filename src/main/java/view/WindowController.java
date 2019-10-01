package view;

import data.ClientMapper;
<<<<<<< HEAD
import data.OfferMapper;
import javafx.fxml.FXML;
import model.Client;
import model.Offer;
=======
import data.OrderMapper;
import data.ProductMapper;
import javafx.fxml.FXML;
import model.Client;
import model.Offer;
import model.Order;
>>>>>>> fc6c5ee08494de187da78db9764eb7f531b3f582
import model.Product;
import repository.ClientRepository;
import repository.OfferRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class WindowController {
    // --------------------- REPOSITORIES ---------------------
    private ProductRepository productRepository;
    private OfferRepository offerRepository;
    private OrderRepository orderRepository;
    private ClientRepository clientRepository;

    // --------------------- INITIALIZE ---------------------
    @FXML
    private void initialize() {
        productRepository = new ProductRepository();
        offerRepository = new OfferRepository();
        orderRepository = new OrderRepository();
        clientRepository = new ClientRepository();
    }

    // --------------------- CREATE ---------------------
    @FXML
    private void createClient() {

    }

    @FXML
    private void createOffer() {

    }

    @FXML
    private void createProduct() {

    }

    // --------------------- GET ---------------------
    @FXML
    private void getClient() {

    }

    @FXML
    private void getOffer() {


    }

    @FXML
    private void getOrder() {

    }

    @FXML
    private void getProduct() {

    }

    // --------------------- DELETE ---------------------
    @FXML
    private void deleteOffer() {

    }

    @FXML
    private void deleteOrder() {

    }

    @FXML
    private void deleteClient() {

    }

    @FXML
    private void deleteProduct() {

    }

    // --------------------- PRINT ---------------------
    @FXML
    private void printClient() {

    }

    @FXML
    private void printProduct() {

    }

    @FXML
    private void printOrder() {

    }

    @FXML
    private void printOffer() {

    }

    // --------------------- UPDATE ---------------------
    @FXML
    private void updateProduct() {

    }

    @FXML
    private void updateClient() {

    }

    @FXML
    private void updateOrder() {

    }

    @FXML
    private void updateOffer() {

    }

    // --------------------- ADD ---------------------
    @FXML
    private void addClientToOffer() {

    }

    @FXML
    private void addProductsToClient() {

    }

    // --------------------- REMOVE ---------------------
    @FXML
    private void removeProductsFromOffer() {

    }

    // --------------------- CONFIRM ---------------------
    @FXML
    private void confirmOrder() {

    }

    // --------------------- TEST ---------------------
    @FXML
    private void testButton() {

    }
}
