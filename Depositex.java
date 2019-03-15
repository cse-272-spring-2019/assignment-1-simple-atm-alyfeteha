package ATM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Depositex {
    Stage stage;
    Scene scene;
    Menu menu;
    MoneyAction money=new MoneyAction();
    public Depositex(Stage stage){
        this.stage=stage;
    }
    public void PrepareSceneD(){
        Label cash=new Label("please enter the amount of cash that u want to deposite");
        Label reply=new Label();
        Button Next=new Button("Back to menu");
        Button submit=new Button("Done");
        TextField cashdeposite= new TextField();
        GridPane grid = new GridPane();
        grid.add(cash,0,0);
        grid.add(cashdeposite,0,1);
        grid.add(reply,0,5);
        grid.add(Next, 5, 7);
        grid.add(submit,4,1);
        scene = new Scene(grid, 600, 400);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String cashin=cashdeposite.getText();
                Double y=Double.parseDouble(cashin);
                money.Deposite(y);
                reply.setText("Transaction is done successfully."+money.balancex);
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


