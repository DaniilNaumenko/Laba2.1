package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Observable;

/**
 * Лаба 2.
 * Cook can cook and eat food.
 * The programmer can write code and eat.
 * After everything is eaten, both return the taste of the food they ate.
 * The Main class creates a graphical user interface.
 * @since 10.03.2019
 * @author Naumenka
 */
    public class Main extends Application {

        /**
         * Entry Point
         *
         * @param args command line arguments (not used)
         */
        public static void main(String[] args) {
            Application.launch(args);
        }

        /**
         * Creature GUI
         *
         * @param primaryStage initial scene of the application
         */
        @Override
        public void start(Stage primaryStage) {
            HBox root = new HBox();
            VBox Vcook = new VBox();
            VBox Vproger = new VBox();

            Button cook = new Button("To cook");
            Button eatProger = new Button("To eat(coder)");
            Button eatCook = new Button("To eat(chef)");
            Button code = new Button("To code");
            cook.setMinWidth(150);
            eatProger.setMinWidth(150);
            eatCook.setMinWidth(150);
            code.setMinWidth(150);

            final ProgramLogic Logic = new ProgramLogic();

            final TextField TfoodName = new TextField("");
            TfoodName.setPrefSize(150, 150);

            final TextArea console = new TextArea("Your code will be here");
            console.setMinSize(150, 200);
            console.setFont(new Font("Courier New", 12));
            console.setWrapText(true);

            final ListView<String> ListFood = new ListView<String>();
            ListFood.setMinSize(150, 150);
            final ObservableList<String> List = FXCollections.observableArrayList();

            Vcook.getChildren().addAll(ListFood, TfoodName, cook, eatCook);
            Vproger.getChildren().addAll(console, code, eatProger);
            root.getChildren().addAll(Vcook, Vproger);

            cook.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    if (TfoodName.getText().equals("")) {
                        ShowFoodAlert();
                    } else {
                        Logic.cook(TfoodName.getText());
                        List.add(TfoodName.getText());
                        ListFood.setItems(List);
                        TfoodName.setText("");
                    }
                }
            }));
            eatCook.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    if (!Logic.getArrayList().isEmpty()) {
                        ShowCookTasteAlert(Logic.eatCook());
                        List.remove(List.size() - 1);
                        ListFood.setItems(List);
                    }
                }
            }));
            eatProger.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    if (!Logic.getArrayList().isEmpty()) {
                        ShowProgerTasteAlert(Logic.eatProger());
                        List.remove(List.size() - 1);
                        ListFood.setItems(List);
                    }
                }
            }));
            code.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    console.setText(Logic.coding());
                }
            }));
            TfoodName.setOnKeyPressed((new EventHandler<KeyEvent>() {
                /*@Override*/
                public void handle(KeyEvent event) {
                    if (event.getCode() == KeyCode.ENTER) {
                        if (TfoodName.getText().equals("")) {
                            ShowFoodAlert();
                        } else {
                            Logic.cook(TfoodName.getText());
                            List.add(TfoodName.getText());
                            TfoodName.setText("");
                            ListFood.setItems(List);
                        }
                    }
                }
            }));
            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("LabWork 2");
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            primaryStage.show();
        }

        private void ShowFoodAlert() {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How is that?");
            alert.setHeaderText(null);
            alert.setContentText("chef before cooking, you need TO NAME the dish!");
            alert.showAndWait();
        }

        private void ShowProgerTasteAlert(Food food) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("We test the dish!");
            alert.setHeaderText(null);
            alert.setContentText("I think the taste of this dish is: " + food.tasteToString().toLowerCase() + "\n" +
                    "It was pretty tasty, I will go on to create code");
            alert.showAndWait();
        }

        private void ShowCookTasteAlert(Food food) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("We test the dish!");
            alert.setHeaderText(null);
            alert.setContentText("I think the taste of this dish is: " + food.tasteToString().toLowerCase() + "\n" +
                    "The next time I cook tastier,need practice.");
            alert.showAndWait();
        }
    }
/*
}*/
