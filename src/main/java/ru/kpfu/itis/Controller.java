package ru.kpfu.itis;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField name;
    public TextField group;
    public TextField graduationYear;
    public TextField university;

    public VBox usersPanel;
    public ScrollPane messagesArea;
    public VBox messages;

    private List<User> users;

    @FXML
    private Button addUser;

    @FXML
    public void add_user_clicked() {
        User user = new User();
        user.setName(name.getText());
        user.setGroup(group.getText());
        user.setGraduationYear(graduationYear.getText());
        user.setUniversity(university.getText());

        users.add(user);
        updateMessagesOutput();

        name.clear();
        group.clear();
        graduationYear.clear();
        university.clear();
    }

    private void updateMessagesOutput() {
        messages.getChildren().clear();

        for (User user : users) {
            Label messageLabel = new Label();
            messageLabel.setText(user.toString());
            messages.getChildren().add(messageLabel);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        users = new ArrayList<>();
        users.add(new User("Хайдаров Кямаль Ришатович", "11-003", "2020", "ITIS"));
        users.add(new User("Неманов Андрей Дмитриевич", "11-003", "2020", "ITIS"));
        users.add(new User("Ханеев Адель Альмирович", "11-011", "2020", "ITIS"));

        addUser.setOnAction(actionEvent -> add_user_clicked());
        updateMessagesOutput();
    }

}