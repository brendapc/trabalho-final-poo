import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField campoUsername;

    @FXML
    private TextField campoSenha;

    @FXML
    private Button botaoLogin;

    @FXML
    void fazerLogin(ActionEvent event) {
        System.out.println("login feito com sucesso");
    }

}
