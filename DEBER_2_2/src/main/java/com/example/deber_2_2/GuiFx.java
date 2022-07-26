package com.example.deber_2_2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //DATA MEMBERS
        C_ControlCheese c_controlCheese = new C_ControlCheese();
        C_ControlClient c_controlClient = new C_ControlClient();
        ArrayList <String> cartDetails = new ArrayList<String>(0);
        C_InvoiceControl c_invoiceControl =new C_InvoiceControl();


        //MAIN MENU GRIDPANE -> CONTAINER
        GridPane mainMenuG = new GridPane();
        mainMenuG.setAlignment(Pos.CENTER);
        mainMenuG.setVgap(10);
        mainMenuG.setHgap(10);
        //MAIN BACKGROUND IMAGE SET
        mainMenuG.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/CHEESE_STAGE/main.png")), BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
        //MAIN MENU WINDOW
        Scene mainMenuScene = new Scene(mainMenuG,600,200);


        //CHOOSE AN OPTION -> MAIN MENU
        Button cheeseBtt = new Button("FILL CHEESE DATA");
        cheeseBtt.setStyle("-fx-background-color: #cc9df5 ");
        mainMenuG.add(cheeseBtt,0,0);

        Button costumerBtt = new Button("ADD NEW CLIENT");
        costumerBtt.setStyle("-fx-background-color: #cc9df5 ");
        mainMenuG.add(costumerBtt,1,0);

        Button sellsBtt = new Button("NEW SELL");
        sellsBtt.setStyle("-fx-background-color: #cc9df5 ");
        mainMenuG.add(sellsBtt,2,0);

        //CREATING A NEW WINDOW FOR CHEESE DATA
        cheeseBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //NEW WINDOW OPENS
                GridPane cheeseG = new GridPane();
                cheeseG.setAlignment(Pos.CENTER);
                cheeseG.setHgap(10);
                cheeseG.setVgap(10);
                Scene cheeseScene = new Scene(cheeseG,1250,500);
                //MAIN BACKGROUND IMAGE SET
                cheeseG.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/CHEESE_STAGE/cheeseG.png")), BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT)));
                stage.setScene(cheeseScene);

                //SPHERIC DATA
                cheeseG.add(new Label("SPHERIC"),0,0);
                TextField basePriceSpheric = new TextField("BASE PRICE");
                basePriceSpheric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        basePriceSpheric.setText("");
                    }
                });
                cheeseG.add(basePriceSpheric,0,1);

                TextField unitPriceSpheric = new TextField("UNIT PRICE");
                unitPriceSpheric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        unitPriceSpheric.setText("");
                    }
                });
                cheeseG.add(unitPriceSpheric,1,1);

                TextField radioSpheric = new TextField("RADIO");
                radioSpheric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        radioSpheric.setText("");
                    }
                });
                cheeseG.add(radioSpheric,2,1);

                TextField quantitySpheric = new TextField("INPUT QUANTITY");
                quantitySpheric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        quantitySpheric.setText("");
                    }
                });
                cheeseG.add(quantitySpheric,3,1);

                //CILINDRIC DATA
                cheeseG.add(new Label("CILINDRIC"),0,2);
                TextField basePriceCilindric = new TextField("BASE PRICE");
                basePriceCilindric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        basePriceCilindric.setText("");
                    }
                });
                cheeseG.add(basePriceCilindric,0,3);

                TextField unitPriceCilindric = new TextField("UNIT PRICE");
                unitPriceCilindric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        unitPriceCilindric.setText("");
                    }
                });
                cheeseG.add(unitPriceCilindric,1,3);

                TextField radioCilindric = new TextField("RADIO");
                radioCilindric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        radioCilindric.setText("");
                    }
                });
                cheeseG.add(radioCilindric,2,3);

                TextField lenghtCilindric = new TextField("LENGTH");
                lenghtCilindric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        lenghtCilindric.setText("");
                    }
                });
                cheeseG.add(lenghtCilindric,3,3);

                TextField quantityCilindric = new TextField("INPUT QUANTITY");
                quantityCilindric.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        quantityCilindric.setText("");
                    }
                });
                cheeseG.add(quantityCilindric,4,3);

                //CILINDRIC WITH HOLE DATA
                cheeseG.add(new Label("CILINDRIC WITH HOLE"),0,4);
                TextField basePriceCilindricHole = new TextField("BASE PRICE");
                basePriceCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        basePriceCilindricHole.setText("");
                    }
                });
                cheeseG.add(basePriceCilindricHole,0,5);

                TextField unitPriceCilindricHole = new TextField("UNIT PRICE");
                unitPriceCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        unitPriceCilindricHole.setText("");
                    }
                });
                cheeseG.add(unitPriceCilindricHole,1,5);

                TextField radioCilindricHole = new TextField("EXTERNAL RADIO");
                radioCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        radioCilindricHole.setText("");
                    }
                });
                cheeseG.add(radioCilindricHole,2,5);

                TextField lenghtCilindricHole = new TextField("LENGTH");
                lenghtCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        lenghtCilindricHole.setText("");
                    }
                });
                cheeseG.add(lenghtCilindricHole,3,5);

                TextField internalRadioCilindricHole = new TextField("INTERNAL RADIO");
                internalRadioCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        internalRadioCilindricHole.setText("");
                    }
                });
                cheeseG.add(internalRadioCilindricHole,4,5);

                TextField quantityCilindricHole = new TextField("INPUT QUANTITY");
                quantityCilindricHole.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        quantityCilindricHole.setText("");
                    }
                });
                cheeseG.add(quantityCilindricHole,5,5);

                //SAVE DATA TO ARRAYLIST
                Button saveCheeseData = new Button("SAVE AND EXIT");
                saveCheeseData.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent actionEvent) {


                        try {

                           for (int i = 0 ; i < c_controlCheese.getCheeseArrayList().size();i++){
                               c_controlCheese.deleteAllData();
                           }

                            for (int i = 0 ; i < c_controlCheese.getDataSpeheric().size();i++){
                                c_controlCheese.deleteAllData();
                            }



                            c_controlCheese.setDataSpeheric(Float.parseFloat(basePriceSpheric.getText()));
                            c_controlCheese.setDataSpeheric(Float.parseFloat(unitPriceSpheric.getText()));
                            c_controlCheese.setDataSpeheric(Float.parseFloat(radioSpheric.getText()));
                            c_controlCheese.setDataSpeheric(Float.parseFloat(quantitySpheric.getText()));

                            c_controlCheese.setDataCilindric(Float.parseFloat(basePriceCilindric.getText()));
                            c_controlCheese.setDataCilindric(Float.parseFloat(unitPriceCilindric.getText()));
                            c_controlCheese.setDataCilindric(Float.parseFloat(radioCilindric.getText()));
                            c_controlCheese.setDataCilindric(Float.parseFloat(lenghtCilindric.getText()));
                            c_controlCheese.setDataCilindric(Float.parseFloat(quantityCilindric.getText()));

                            c_controlCheese.setDataCilindricHole(Float.parseFloat(basePriceCilindricHole.getText()));
                            c_controlCheese.setDataCilindricHole(Float.parseFloat(unitPriceCilindricHole.getText()));
                            c_controlCheese.setDataCilindricHole(Float.parseFloat(radioCilindricHole.getText()));
                            c_controlCheese.setDataCilindricHole(Float.parseFloat(lenghtCilindricHole.getText()));
                            c_controlCheese.setDataCilindricHole(Float.parseFloat(internalRadioCilindricHole.getText()));
                            c_controlCheese.setDataCilindricHole(Float.parseFloat(quantityCilindricHole.getText()));

                            System.out.println("EXTERNAL"+ c_controlCheese.getDataCilindricHole().get(2));
                            System.out.println("INTERNAL"+ c_controlCheese.getDataCilindricHole().get(4));

                            if (c_controlCheese.getDataCilindricHole().get(2) <= c_controlCheese.getDataCilindricHole().get(4)){
                                Alert alert = new Alert(Alert.AlertType.ERROR,"RADIO MUST BE GRATER THAN INTERNAL RADIO");
                                alert.show();
                                c_controlCheese.deleteAllData();
                            }else{
                                c_controlCheese.setDataCilindricHole(Float.parseFloat(internalRadioCilindricHole.getText()));

                                c_controlCheese.setDataCilindricHole(Float.parseFloat(quantityCilindricHole.getText()));

                                //CREATION OF SPHERIC CHEESE
                                for (int i = 0; i< c_controlCheese.getDataSpeheric().get(3);i++){
                                    c_controlCheese.setCheeseArrayList(new C_Spheric(c_controlCheese.getDataSpeheric().get(0),c_controlCheese.getDataSpeheric().get(1),c_controlCheese.getDataSpeheric().get(2)));
                                }
                                System.out.println(c_controlCheese.getCheeseArrayList().size());

                                //CREATION OF CILINDRIC CHEESE
                                for (int i = 0; i< c_controlCheese.getDataCilindric().get(4);i++){
                                    c_controlCheese.setCheeseArrayList(new C_Cilindric(c_controlCheese.getDataCilindric().get(0),c_controlCheese.getDataCilindric().get(1),c_controlCheese.getDataCilindric().get(2),c_controlCheese.getDataCilindric().get(3)));
                                }
                                System.out.println(c_controlCheese.getCheeseArrayList().size());

                                //CREATION OF CILINDRIC WITH HOLE CHEESE
                                for (int i = 0; i< c_controlCheese.getDataCilindricHole().get(5);i++){
                                    c_controlCheese.setCheeseArrayList(new C_CilindricWithHole(c_controlCheese.getDataCilindricHole().get(0),c_controlCheese.getDataCilindricHole().get(1),c_controlCheese.getDataCilindricHole().get(2),c_controlCheese.getDataCilindricHole().get(3),c_controlCheese.getDataCilindricHole().get(4)));
                                }
                                System.out.println(c_controlCheese.getCheeseArrayList().size());


                                ButtonType exitMenu = new ButtonType("EXIT TO MAIN MENU");
                                Alert alert = new Alert(Alert.AlertType.INFORMATION,"DATA SAVED SUCCESSFULLY",exitMenu);
                                //alert.show();
                                Optional<ButtonType> result = alert.showAndWait();
                                if (result.get() == exitMenu) {
                                    System.out.println("Exit Button is clicked");
                                    stage.setScene(mainMenuScene);
                                }

                            }



                        }catch (NumberFormatException e){
                            System.out.println(e);
                            Alert alert = new Alert(Alert.AlertType.ERROR, "ALL DATA MUST BE FILLED");
                            alert.show();
                        }catch (Exception e){
                            System.out.println(e);
                        }

                    }
                });
                cheeseG.add(saveCheeseData,0,6);

            }
        });

        //CREATING A NEW WINDOW FOR COSTUMER DATA
        costumerBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //NEW WINDOW OPENS
                GridPane costumerG = new GridPane();
                costumerG.setAlignment(Pos.CENTER);
                costumerG.setHgap(10);
                costumerG.setVgap(10);
                //MAIN BACKGROUND IMAGE SET
                costumerG.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/CHEESE_STAGE/costumer.png")), BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT)));
                Scene costumerScene = new Scene(costumerG,500,500);
                stage.setScene(costumerScene);

                //INPUT NAME
                costumerG.add(new Label("NAME"),0,0);
                TextField costumerName = new TextField();
                costumerG.add(costumerName,0,1);

                //INPUT ADRESS
                costumerG.add(new Label("ADRESS"),0,2);
                TextField costumerAdress = new TextField();
                costumerG.add(costumerAdress,0,3);

                //INPUT PHONE
                costumerG.add(new Label("PHONE"),0,4);
                TextField costumerPhone= new TextField();
                costumerG.add(costumerPhone,0,5);

                //ADD NEW COSTUMER
                Button addNewCostumerBtt = new Button("ADD CLIENT");
                addNewCostumerBtt.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        try{
                            c_controlClient.setC_clients(new C_Client(costumerName.getText().toUpperCase(Locale.ROOT),
                                    costumerAdress.getText().toUpperCase(),
                                    Integer.parseInt(costumerPhone.getText())));
                            Alert alert = new Alert(Alert.AlertType.INFORMATION,"CLIENT SAVED SUCCESSFULLY");
                            alert.show();

                            costumerName.setText("");
                            costumerAdress.setText("");
                            costumerPhone.setText("");

                        }catch (Exception e){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION,"CHARACTER INVALID");
                            alert.show();
                        }

                    }
                });
                costumerG.add(addNewCostumerBtt,0,6);

                Button exit  = new Button("EXIT TO MAIN MENU");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(mainMenuScene);
                    }
                });
                costumerG.add(exit,1,6);














            }
        });

        //CREATING A NEW WINDOW FOR INVOICE DATA
        sellsBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //NEW WINDOW OPENS
                BorderPane container = new BorderPane();
                //MAIN BACKGROUND IMAGE SET
                container.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/CHEESE_STAGE/Sell.png")), BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT)));
                //stage.setScene(cheeseScene);


                GridPane sellG = new GridPane();
                sellG.setAlignment(Pos.CENTER);
                sellG.setHgap(10);
                sellG.setVgap(10);
                container.setTop(sellG);
                Scene sellScene = new Scene(container,500,500);
                stage.setScene(sellScene);

                //COMBOBOX FOR CLIENTS
                sellG.add(new Label("CHOOSE A CLIENT"),0,0);
                ComboBox clientsComboBox = new ComboBox();

                for (int i = 0 ; i < c_controlClient.getC_clients().size();i++){
                    clientsComboBox.getItems().add(c_controlClient.getC_clients().get(i).getName());
                }

                sellG.add(clientsComboBox,0,1);

                //COMBOBOX CHEESE
                sellG.add(new Label("CHOOSE A CHEESE TYPE"),0,2);
                ComboBox typeCheeseComboBox = new ComboBox();
                typeCheeseComboBox.getItems().add("SPHERIC");
                typeCheeseComboBox.getItems().add("CILINDRIC");
                typeCheeseComboBox.getItems().add("CILINDRIC WITH HOLE");
                sellG.add(typeCheeseComboBox,0,3);

                //TEXTFIEL CHOOSE QUANTITY
                TextField quantityTxt = new TextField("INPUT QUANTITY");
                quantityTxt.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        quantityTxt.setText("");
                    }
                });
                sellG.add(quantityTxt,1,3);

                //BUTTON TO ADD TO CART
                Button addToCart = new Button("ADD TO CART");
                addToCart.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        if (quantityTxt.getText() == ""){
                            Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE ENTER QUANTITY");
                            alert.show();

                        }else {
                            String choosed = String.valueOf(typeCheeseComboBox.getValue());
                            System.out.println("USER CHOOSED:" + choosed);

                            if (choosed == "SPHERIC") {
                                if (Integer.valueOf(quantityTxt.getText()) <= c_controlCheese.getDataSpeheric().get(3) ){
                                    cartDetails.add("SPHERIC");
                                    cartDetails.add(quantityTxt.getText());
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "PRODUCT ADDED SUCCESFULLY");
                                    alert.show();
                                    c_controlCheese.deleteData(3,c_controlCheese.getDataSpeheric().get(3)-Float.valueOf(quantityTxt.getText()),c_controlCheese.getDataSpeheric());
                                    System.out.println(c_controlCheese.getDataSpeheric().get(3));

                                }else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR, "QUANTITY ENTERED IS GRATER THAN INDEXED");
                                    alert.show();
                                }


                            } else if (choosed == "CILINDRIC") {

                                if (Integer.valueOf(quantityTxt.getText()) <= c_controlCheese.getDataCilindric().get(4) ) {
                                    cartDetails.add("CILINDRIC");
                                    cartDetails.add(quantityTxt.getText());
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "PRODUCT ADDED SUCCESFULLY");
                                    alert.show();
                                    c_controlCheese.deleteData(4,c_controlCheese.getDataCilindric().get(4)-Float.valueOf(quantityTxt.getText()),c_controlCheese.getDataCilindric());
                                    System.out.println(c_controlCheese.getDataCilindric().get(3));

                                }else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR, "QUANTITY ENTERED IS GRATER THAN INDEXED");
                                    alert.show();
                                }


                            } else if (choosed == "CILINDRIC WITH HOLE") {

                                if (Integer.valueOf(quantityTxt.getText()) <= c_controlCheese.getDataCilindricHole().get(5) ) {
                                    cartDetails.add("CILINDRIC WITH HOLE");
                                    cartDetails.add(quantityTxt.getText());
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "PRODUCT ADDED SUCCESFULLY");
                                    alert.show();
                                    c_controlCheese.deleteData(5,c_controlCheese.getDataCilindricHole().get(5)-Float.valueOf(quantityTxt.getText()),c_controlCheese.getDataCilindricHole());
                                    System.out.println(c_controlCheese.getDataCilindricHole().get(5));
                                }else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR, "QUANTITY ENTERED IS GRATER THAN INDEXED");
                                    alert.show();
                                }


                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR, "PLEASE CHOOSE A CHEESE");
                                alert.show();
                            }
                        }







                    }
                });
                sellG.add(addToCart,2,3);

                GridPane listGrid = new GridPane();
                sellG.setPadding(new Insets(25,25,25,25));
                listGrid.setPadding(new Insets(25,25,25,25));
                listGrid.setAlignment(Pos.CENTER);
                ListView<String> listView = new ListView<String>();
                listView.setStyle("-fx-control-inner-background: #eaf5e9;");
                listView.setMaxHeight(225);
                listGrid.add(listView,0,1);
                container.setBottom(listGrid);
                ObservableList<String> infoToShow = FXCollections.observableArrayList();

                //CREATE NEW INVOICE
                Button invoiceBtt = new Button("CREATE INVOICE");
                invoiceBtt.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        if (cartDetails.size() <= 0){
                            Alert alert = new Alert(Alert.AlertType.ERROR, "PLEASE ENTER ITEMS TO THE CART");
                            alert.show();
                            cartDetails.clear();
                        }else {

                            try {
                                listView.setItems(infoToShow);

                                if (c_controlClient.getC_clients().size() <=0){
                                    Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE CREATE COSTUMERS");
                                    alert.show();
                                    cartDetails.clear();
                                }

                                if (c_controlCheese.getCheeseArrayList().size()<=0){
                                    Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE ENTER CHEESE DATA");
                                    alert.show();
                                    cartDetails.clear();
                                }

                                if (clientsComboBox.getValue()==null){
                                    Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE CHOOSE A USER");
                                    alert.show();
                                    cartDetails.clear();
                                }







                                for (int i = 0; i < c_controlClient.getC_clients().size(); i++) {
                                    if (String.valueOf(clientsComboBox.getValue()) == String.valueOf(c_controlClient.getC_clients().get(i).getName())) {
                                        infoToShow.add(String.valueOf(i));
                                        infoToShow.add(c_controlClient.getC_clients().get(i).getName());
                                        infoToShow.add(c_controlClient.getC_clients().get(i).getAdress());
                                        infoToShow.add(String.valueOf(c_controlClient.getC_clients().get(i).getPhone()));

                                        C_Invoice invoice = new C_Invoice(c_controlClient.getC_clients().get(i).getName(),
                                                c_controlClient.getC_clients().get(i).getAdress(),
                                                Integer.valueOf(c_controlClient.getC_clients().get(i).getPhone()));


                                        for (int j = 0; j < cartDetails.size(); j += 2) {
                                            if (cartDetails.get(j) == "SPHERIC") {
                                                invoice.subtotal(Integer.valueOf(cartDetails.get(j + 1)), new C_Spheric(c_controlCheese.getDataSpeheric().get(0),
                                                        c_controlCheese.getDataSpeheric().get(1),
                                                        c_controlCheese.getDataSpeheric().get(2)));
                                                infoToShow.add("SPHERIC [" + cartDetails.get(j + 1) + "]  " + new C_Spheric(c_controlCheese.getDataSpeheric().get(0), c_controlCheese.getDataSpeheric().get(1),
                                                        c_controlCheese.getDataSpeheric().get(2)).cost() + " = " + invoice.getSubtotal());
                                            } else if (cartDetails.get(j) == "CILINDRIC") {
                                                invoice.subtotal(Integer.valueOf(cartDetails.get(j + 1)), new C_Cilindric(c_controlCheese.getDataCilindric().get(0),
                                                        c_controlCheese.getDataCilindric().get(1),
                                                        c_controlCheese.getDataCilindric().get(2),
                                                        c_controlCheese.getDataCilindric().get(3)));
                                                infoToShow.add("CILINDRIC [" + cartDetails.get(j + 1) + "]  " + new C_Cilindric(c_controlCheese.getDataCilindric().get(0),
                                                        c_controlCheese.getDataCilindric().get(1),
                                                        c_controlCheese.getDataCilindric().get(2),
                                                        c_controlCheese.getDataCilindric().get(3)).cost() + " = " + invoice.getSubtotal());
                                            } else if (cartDetails.get(j) == "CILINDRIC WITH HOLE") {
                                                invoice.subtotal(Integer.valueOf(cartDetails.get(j + 1)), new C_CilindricWithHole(c_controlCheese.getDataCilindricHole().get(0),
                                                        c_controlCheese.getDataCilindricHole().get(1),
                                                        c_controlCheese.getDataCilindricHole().get(2),
                                                        c_controlCheese.getDataCilindricHole().get(3),
                                                        c_controlCheese.getDataCilindricHole().get(4)));
                                                infoToShow.add("CILINDRIC WITH HOLE [" + cartDetails.get(j + 1) + "]  " + new C_CilindricWithHole(c_controlCheese.getDataCilindricHole().get(0),
                                                        c_controlCheese.getDataCilindricHole().get(1),
                                                        c_controlCheese.getDataCilindricHole().get(2),
                                                        c_controlCheese.getDataCilindricHole().get(3),
                                                        c_controlCheese.getDataCilindricHole().get(4)).cost() + " = " + invoice.getSubtotal());
                                            }
                                        }


                                        cartDetails.clear();
                                        c_invoiceControl.setInvoiceArrayList(invoice);
                                        System.out.println("ADDED INVOICE: " + c_invoiceControl.getInvoiceArrayList().size());
                                    }

                                }

                            } catch (Exception e) {
                                Alert alert = new Alert(Alert.AlertType.ERROR, "UNKNOWN ERRROR");
                                alert.show();
                                cartDetails.clear();

                            }
                        }








                    }
                });
                sellG.add(new Label("FINISH THE SELL"),0,4);
                sellG.add(invoiceBtt,0,5);

                Button totalCompany = new Button("TOTAL EARNINGS");
                totalCompany.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (c_invoiceControl.getInvoiceArrayList().size()>0){
                            C_Company c_company = new C_Company();
                            c_company.totalEarns(c_invoiceControl);

                            String msg = "COMPANY TOTAL EARNINGS $" + c_company.getTotal();
                            Alert alert = new Alert(Alert.AlertType.INFORMATION,msg);
                            alert.show();

                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR,"NO SELLS FOUNDED");
                            alert.show();
                        }




                    }
                });
                sellG.add(totalCompany,1,5);

                Button exit = new Button("EXIT TO MAIN MENU");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(mainMenuScene);
                    }
                });

                sellG.add(exit,2,5);







            }
        });




        //WINDOW OPTIONS
        stage.setResizable(false);
        stage.setTitle("DEBER 2!");
        stage.setScene(mainMenuScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}