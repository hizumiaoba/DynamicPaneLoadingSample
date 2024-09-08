module io.github.hizumiaoba.sidecomponentex {
  requires javafx.controls;
  requires javafx.fxml;
  requires com.google.common;

  opens io.github.hizumiaoba.sidecomponentex to javafx.fxml;
  exports io.github.hizumiaoba.sidecomponentex;
}