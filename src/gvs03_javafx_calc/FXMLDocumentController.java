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
        try {
            double x = Double.parseDouble(textFieldX.getText());
            double a = Double.parseDouble(textFieldA.getText());
            double b = Double.parseDouble(textFieldB.getText());
            double c = Double.parseDouble(textFieldC.getText());

            double y = Solver.solve(x, a, b, c);

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
