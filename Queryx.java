package ATM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Queryx {
    Stage stage;
    Scene scene;
    Menu menu;
   MoneyAction money=new MoneyAction();
    public Queryx(Stage stage){
        this.stage=stage;
    }
    public void PrepareSceneQ(){
        Label balance=new Label();
        Button balanceBtn=new Button("Get Current Balance");
        Button Next=new Button("Back to Menu");
        GridPane grid = new GridPane();
        grid.add(balance,2,12);
        grid.add(Next, 5, 7);
        grid.add(balanceBtn, 10, 7);
        scene = new Scene(grid, 600, 400);
        Next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(menu.getScene());
            }
        });
        balanceBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                balance.setText("your balance is "+money.Queryu());
            }
        });
    }
    public Scene getScene() {
        return scene;
    }
    public void setmenu(Menu menu) {
        this.menu = menu;
    }

}
