module ma.enset.gestionconsultationbdcc {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.enset.gestionconsultationbdcc to javafx.fxml;
    exports ma.enset.gestionconsultationbdcc;
}