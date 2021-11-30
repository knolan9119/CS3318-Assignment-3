module cs3318assignment3tdd.cs3318javatdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs3318assignment3tdd.cs3318javatdd to javafx.fxml;
    exports cs3318assignment3tdd.cs3318javatdd;
}