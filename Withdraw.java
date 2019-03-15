package ATM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Withdraw {
    Stage stage;
    Scene scene;
    Menu menu;
     MoneyAction money=new MoneyAction();
    public Withdraw(Stage stage){
        this.stage=stage;
    }
    public void PrepareSceneW(){
        Label cash=new Label("please enter the amount of cash that u want to withdraw");
        Label reply=new Label();
        Button Next=new Button("Back to menu");
        Button submit=new Button("Done");
        TextField cashwithdraw= new TextField();
        GridPane grid = new GridPane();
        grid.add(cash,0,0);
        grid.add(cashwithdraw,0,1);
        grid.add(reply,0,5);
        grid.add(Next, 5, 7);
        grid.add(submit,4,1);
        scene = new Scene(grid, 600, 400);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String cashinx=cashwithdraw.getText();
                Double z=Double.parseDouble(cashinx);
                if(money.balancex<z)
                reply.setText("Transaction is unsuccessful.");
                else {
                    reply.setText("Transaction is successfully. " + money.Withdraw(z));
                }
            }
        });
        Next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(menu.getScene());
            }
        });
    }
    public void setmenu(Menu menu) {
        this.menu = menu;
    }
    public Scene getScene() {
        return scene;
    }
    }


