// Code corrected with JavaFX on 12/6/23
// Pierce Mohney
// SDEV 200
// M05 assignment 3
// Program creates a frame with four different sliders that change text at the top labeled "Show colors."
// Sliders are labeled red, green, blue, and opacity which each changes the look of the labeled text in the frame. 

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ColorSliderProgramFX extends Application {

    private Slider redSlider;
    private Slider greenSlider;
    private Slider blueSlider;
    private Slider opacitySlider;
    private Label showColorsLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Slider Program");

        // Create sliders
        redSlider = createSlider("Red");
        greenSlider = createSlider("Green");
        blueSlider = createSlider("Blue");
        opacitySlider = createSlider("Opacity");

        // Create label
        showColorsLabel = new Label("Show Colors");
        showColorsLabel.setFont(Font.font(18));

        // Set up VBox layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.setAlignment(Pos.CENTER); // Center align the VBox
        vbox.getChildren().addAll(showColorsLabel, redSlider, greenSlider, blueSlider, opacitySlider);

        // Set up scene
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private Slider createSlider(String label) {
        Label sliderLabel = new Label(label);
        Slider slider = new Slider(0, 1, 1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(0.25);
        slider.setBlockIncrement(0.1);

        // Add listener to update the label and show colors
        slider.valueProperty().addListener((observable, oldValue, newValue) -> updateLabelAndShowColors());

        VBox sliderBox = new VBox(5);
        sliderBox.setAlignment(Pos.CENTER); // Center align the VBox
        sliderBox.getChildren().addAll(sliderLabel, slider);

        return slider;
    }

    private void updateLabelAndShowColors() {
        double red = redSlider.getValue();
        double green = greenSlider.getValue();
        double blue = blueSlider.getValue();
        double opacity = opacitySlider.getValue();

        showColorsLabel.setTextFill(new Color(red, green, blue, opacity));
        showColorsLabel.setText(String.format("Show Colors [R:%.2f, G:%.2f, B:%.2f, Opacity:%.2f]", red, green, blue, opacity));
    }
}
