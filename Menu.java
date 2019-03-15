package ATM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu {
    Stage stage;
    Scene scene;
    LoginForm loginform;
    Queryx query;
    Depositex deposite;
    Withdraw withdraw;
    int a=0;
    HistoryOfTransactions history=new HistoryOfTransactions();
    int p=history.i;
    public Menu(Stage stage){
        this.stage=stage;
    }
    public void PrepareScene() {
        Label options = new Label("please choose one of the options please");
        Label hist=new Label();
        Button Previous = new Button("Previous");
        Button Next=new Button("Next");
        Button queryx=new Button("Query");
        Button depositex=new Button("Deposite");
        Button withdrawx=new Button("Withdraw");
        GridPane grid = new GridPane();
        grid.add(options, 0, 0);
        grid.add(queryx,0,2);
        grid.add(depositex,0,3);
        grid.add(withdrawx,0,4);
        grid.add(Previous, 0, 7);
        grid.add(Next, 7, 7);
        grid.add(hist,0,8);
        depositex.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                stage.setScene(deposite.getScene());
            }
        });
        queryx.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              stage.setScene(query.getScene());
            }
        });
        withdrawx.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(withdraw.getScene());

            }
        });
        Previous.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                history.ArrayModification();
                if(p>0) {
                    hist.setText(history.array.get(p-1) + history.array1.get(p-1));
                    p--;
                    a = p+1 ;
                }
              else {
                    hist.setText("there is no more previous data ");
                    a=p;
                }
            }
        });
        scene = new Scene(grid, 600, 400);
        Next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                history.ArrayModification();
                if(a < history.i) {
                    hist.setText(history.array.get(a) + history.array1.get(a));
                    a++;
                    p = a-1;
                }
                    else{
                        hist.setText("there is no more further data");
                        p=a;
                    }
            }
        });
    }
    public Scene getScene() {
        return scene;
    }
    public void setquery(Queryx query){
        this.query=query;
    }
    public void setLoginform(LoginForm loginform){
        this.loginform=loginform;
    }
    public void setDeposite(Depositex deposite){
        this.deposite=deposite;
    }
    public void setWithdraw(Withdraw withdraw){
        this.withdraw=withdraw;
    }
}
