package ATM;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ATM extends Application {
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ATM");
        LoginForm loginform=new LoginForm(primaryStage);
        Menu menu=new Menu(primaryStage);
        Queryx query=new Queryx(primaryStage);
        Depositex deposite=new Depositex(primaryStage);
        Withdraw withdraw=new Withdraw(primaryStage);
        loginform.PrepareLoginScene();
        menu.PrepareScene();
        query.PrepareSceneQ();
        deposite.PrepareSceneD();
        withdraw.PrepareSceneW();
        loginform.setMenu(menu);
        menu.setquery(query);
        menu.setDeposite(deposite);
        menu.setWithdraw(withdraw);
        menu.setLoginform(loginform);
        query.setmenu(menu);
        deposite.setmenu(menu);
        withdraw.setmenu(menu);
        primaryStage.setScene(loginform.getScene());
        primaryStage.show();
    }
}
