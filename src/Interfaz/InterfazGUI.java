package Interfaz;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InterfazGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear controles
        Label fechaLabel = new Label("Elige una fecha:");
        DatePicker fechaPicker = new DatePicker();
        Label colorLabel = new Label("Elige un color:");
        ColorPicker colorPicker = new ColorPicker();
        Button botonConfirmar = new Button("Aceptar");
        Label resultadoLabel = new Label("Resultado:");

        // Crear layout vertical (VBox)
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);

        // Agregar controles al layout
        root.getChildren().addAll(fechaLabel, fechaPicker, colorLabel, colorPicker, botonConfirmar, resultadoLabel);

        // Acción al presionar el botón
        botonConfirmar.setOnAction(e -> {
            String fechaSeleccionada = fechaPicker.getValue().toString();
            String colorSeleccionado = colorPicker.getValue().toString();
            resultadoLabel.setText("Fecha elegida: " + fechaSeleccionada + "\nColor elegido: " + colorSeleccionado);
            System.out.println("Fecha elegida: " + fechaSeleccionada + ", Color elegido: " + colorSeleccionado);
        });

        // Crear escena y mostrarla
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("GUI de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); 
    }
}