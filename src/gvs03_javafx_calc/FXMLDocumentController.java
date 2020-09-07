package gvs03_javafx_calc;

import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TextField textFieldX;
    @FXML
    private TextField textFieldA;
    @FXML
    private TextField textFieldB;
    @FXML
    private TextField textFieldC;
    @FXML
    private Label labelResult;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        double x, a, b, c, y;

        try {
            x = Double.parseDouble(textFieldX.getText());
            a = Double.parseDouble(textFieldA.getText());
            b = Double.parseDouble(textFieldB.getText());
            c = Double.parseDouble(textFieldC.getText());

            if (x < 4) {
                y = ((((x * x) + (a * a)) * c) / (2 * b));
            } else {
                y = ((x * x * x) * (a - b));
            }
            if ((!Double.isNaN(y)) && (!Double.isInfinite(y))) {
                labelResult.setText(String.format("Ответ: %.2f", y));
            } else {
                labelResult.setText("Нет ответа");
            }
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ошибка введенных данных!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            textFieldX.requestFocus();
            textFieldX.setText("");
            textFieldA.setText("");
            textFieldB.setText("");
            textFieldC.setText("");
            labelResult.setText("Пожалуйста, введите числовые значения");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
