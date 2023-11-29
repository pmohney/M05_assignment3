// 11/28/23
// Pierce Mohney
// SDEV 200
// M05 assignment 3
// Program creates a frame with four different sliders which change text at the top labeled "Show colors."
// Sliders are labeled red, green, blue, and opacity which each changes the look of the labeled text in the frame. 

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorSliderProgram extends JFrame {

    private JLabel showColorsLabel;
    private JSlider redSlider, greenSlider, blueSlider, opacitySlider;

    public ColorSliderProgram() {
        setTitle("Color Slider Program");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        showColorsLabel = new JLabel("Show Colors");
        showColorsLabel.setHorizontalAlignment(JLabel.CENTER);

        redSlider = createSlider("Red");
        greenSlider = createSlider("Green");
        blueSlider = createSlider("Blue");
        opacitySlider = createSlider("Opacity");
//Creates the frame, labeled text, and slider labels 

        add(showColorsLabel);
        add(redSlider);
        add(greenSlider);
        add(blueSlider);
        add(opacitySlider);

        redSlider.addChangeListener(new SliderChangeListener());
        greenSlider.addChangeListener(new SliderChangeListener());
        blueSlider.addChangeListener(new SliderChangeListener());
        opacitySlider.addChangeListener(new SliderChangeListener());
    }
//Adds sliders to the frame

    private JSlider createSlider(String label) {
        JSlider slider = new JSlider(JSlider.HORIZONTAL);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(false);
        slider.setBorder(BorderFactory.createTitledBorder(label));
        return slider;
    }

    private class SliderChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int redValue = redSlider.getValue();
            int greenValue = greenSlider.getValue();
            int blueValue = blueSlider.getValue();
            float opacityValue = opacitySlider.getValue() / 100f;

            showColorsLabel.setForeground(new Color(redValue, greenValue, blueValue, (int) (255 * opacityValue)));
    //Changes values of each label text based on slider position
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorSliderProgram colorSliderProgram = new ColorSliderProgram();
            colorSliderProgram.setVisible(true);
        });
    }
}
