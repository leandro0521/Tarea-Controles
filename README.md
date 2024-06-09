# Interfaz de Fecha y Color en JavaFX

Este programa JavaFX permite a los usuarios seleccionar una fecha y un color mediante una interfaz gráfica. La clase principal, `InterfazGUI`, extiende `Application` e implementa el método `start` para configurar los elementos de la interfaz, incluyendo un `DatePicker` para la fecha, un `ColorPicker` para el color, y un botón para confirmar las selecciones.

Los controles se organizan verticalmente en un `VBox`. Al presionar el botón de confirmación, la fecha y el color seleccionados se muestran en una etiqueta de resultados y se imprimen en la consola. La interfaz se muestra en una ventana titulada "GUI de Fecha y Color".

La aplicación se ejecuta mediante el método `main`, que lanza la interfaz gráfica con `launch(args)`.

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

# compilacion: 

![image](https://github.com/leandro0521/Tarea-Controles/assets/168586082/76a8ddaf-e441-47a1-b258-922394e7556c)
