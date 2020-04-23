package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private String math_operator;

    @FXML
    private Button a0Button = new Button();

    @FXML
    private Button a4Button;

       @FXML
    private Button a7Button;

    @FXML
    private Button a1Button;

    @FXML
    private Button ClearButton;

    @FXML
    private Button x2Button;

    @FXML
    private Button a8Button;

    @FXML
    private Button a5Button;

    @FXML
    private Button a2Button;

    @FXML
    private Button x12Button;

    @FXML
    private Button a9Button;

    @FXML
    private Button a6Button;

    @FXML
    private Button a3Button;

    @FXML
    private Button PointButton;

    @FXML
    private TextField textField1;

    @FXML
    private Button MinusButton;

    @FXML
    private Button PlusButton;

    @FXML
    private Button RavnoButton;

    @FXML
    private Button DelenieButton;

    @FXML
    private Button UmnButton;

    @FXML
    void initialize() {

        a0Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a0Button.getText());
        });

        a1Button.setOnAction(actionEvent -> {
                textField1.setText(textField1.getText()+a1Button.getText());
        });

        a2Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a2Button.getText());
        });

        a3Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a3Button.getText());
        });

        a4Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a3Button.getText());
        });

        a5Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a5Button.getText());
        });

        a6Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a6Button.getText());
        });

        a7Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a7Button.getText());
        });

        a8Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a8Button.getText());
        });

        a9Button.setOnAction(actionEvent -> {
            textField1.setText(textField1.getText()+a9Button.getText());
        });

        PlusButton.setOnAction(actionEvent -> {
            String Button_Text=PlusButton.getText();
            getOperator(Button_Text);
        });

        MinusButton.setOnAction(actionEvent -> {
            String Button_Text=MinusButton.getText();
            getOperator(Button_Text);
        });

        UmnButton.setOnAction(actionEvent -> {
            String Button_Text=UmnButton.getText();
            getOperator(Button_Text);
        });

        DelenieButton.setOnAction(actionEvent -> {
            String Button_Text=DelenieButton.getText();
            getOperator(Button_Text);
        });

        RavnoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                switch (math_operator) {
                    case "+":
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;
                    case "-":
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;
                    case "/":
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;
                    case "*":
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                    case "Х²":
                        total2 = Math.pow(total1,2);
                        break;
                    case "√ ":
                        total2 = Math.pow(total1,0.5);
                        break;
                }
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        ClearButton.setOnAction(actionEvent ->  {
            textField1.clear();
        });


        PointButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0");
                } else if (textField1.getText().contains(".")) {
                    PlusButton.setDisable(false);
                } else {
                    String PointButtonText = textField1.getText() + PointButton.getText();
                    textField1.setText(PointButtonText);
                }
                PointButton.setDisable(false);
            }
        });

        x2Button.setOnAction(actionEvent ->  {
                getOperator(x2Button.getText());
        });
        x12Button.setOnAction(actionEvent -> {
                getOperator(x12Button.getText());
        });
}

    private void getOperator(String button_text) {
        math_operator = button_text;
        total1 = Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

}