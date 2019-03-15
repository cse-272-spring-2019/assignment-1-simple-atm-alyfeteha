package ATM;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginForm {
    Stage stage;
    Scene scene;
    Menu menu;
    MoneyAction money=new MoneyAction();
    public LoginForm(Stage stage){
        this.stage=stage;
    }
    public void PrepareLoginScene(){
        Label creditcardnumberL=new Label("creditcard number : ");
        PasswordField creditcardnumberF=new PasswordField();
        Button submit=new Button("submit");
        Label verificationlabel=new Label();
        GridPane grid=new GridPane();
        grid.add(creditcardnumberL,0,0);
        grid.add(creditcardnumberF,1,0);
        grid.add(submit,1,1);
        grid.add(verificationlabel,1,2);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String num=creditcardnumberF.getText();
            money.verification(num);
                    if(money.verification(num)==1) {
                        verificationlabel.setText("welcome sir");
                        verificationlabel.setFont(new Font("Times new roman", 20));
                        stage.setScene(menu.getScene());
                    }
                    else if(money.verification(num)==0) {
                        verificationlabel.setText("please enter the correct credit card number to procceed");
                        verificationlabel.setFont(new Font("Times new roman", 20));
                    }
            }
        });
        scene=new Scene(grid,600,400);
    }
    public Scene getScene(){
        return this.scene;
    }
    public void setMenu(Menu menu){
        this.menu=menu;
    }

}

